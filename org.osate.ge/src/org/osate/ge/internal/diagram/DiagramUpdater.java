package org.osate.ge.internal.diagram;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.debug.internal.ui.DefaultLabelProvider;
import org.osate.ge.graphics.Graphic;
import org.osate.ge.internal.DockArea;
import org.osate.ge.internal.DockingPosition;
import org.osate.ge.internal.graphics.AgeConnection;
import org.osate.ge.internal.labels.AgeLabelConfiguration;
import org.osate.ge.internal.labels.LabelConfiguration;
import org.osate.ge.internal.labels.LabelConfigurationBuilder;

/**
 * Updates the diagram's elements based on the diagram configuration.
 *
 */
// TODO: Document purpose, etc
public class DiagramUpdater {	
	private final BusinessObjectTreeFactory boTreeFactory;
	private final DiagramElementInfoProvider infoProvider; // TODO:Rename
	
	private final Map<DiagramNode, Map<RelativeBusinessObjectReference, AgeDiagramElement>> containerToRelativeReferenceToGhostMap = new HashMap<>();
		
	// This interface provides the business objects that should be included in the diagram.
	// The updater is responsible for adding and removing elements as necessary.
	public static interface BusinessObjectTreeFactory {
		BusinessObjectTree createBusinessObjectTree(final DiagramConfiguration configuration);
	}
	
	public static interface BusinessObjectTree {
		Collection<BusinessObjectTreeNode> getRootNodes();
	}
	
	public static interface BusinessObjectTreeNode {
		Object getBusinessObject();
		RelativeBusinessObjectReference getRelativeReference();
		CanonicalBusinessObjectReference getCanonicalReference();
		Collection<BusinessObjectTreeNode> getChildren();
		String getName(); // Get name for the business object's name label
	}

	// TODO: Rename
	public static interface DiagramElementInfoProvider {
		/**
		 * Provides the graphic that should be used for a business object. 
		 * The specified diagram element may not be fully initialized. Only the business object and container fields are guaranteed to be initialized.
		 * @param element
		 * @return
		 */
		Graphic getGraphic(AgeDiagramElement element);
		
		/**
		 * The specified diagram element may not be fully initialized. Only the business object and container fields are guaranteed to be initialized.
		 * @param element
		 * @return the default docking position. Must not be null.
		 */
		DockingPosition getDefaultDockingPosition(AgeDiagramElement element);
		
		/**
		 * 
		 * @param element
		 * @return may return null.
		 */
		AgeLabelConfiguration getDefaultLabelConfiguration(AgeDiagramElement element);
		
		AgeDiagramElement getConnectionStart(final AgeDiagramElement e);
		AgeDiagramElement getConnectionEnd(final AgeDiagramElement e);
	}
	
	public DiagramUpdater(final BusinessObjectTreeFactory boTreeFactory, 
			final DiagramElementInfoProvider infoProvider) {
		this.boTreeFactory = Objects.requireNonNull(boTreeFactory, "boTreeFactory must not be null");
		this.infoProvider = Objects.requireNonNull(infoProvider, "infoProvider must not be null"); // Adjust message after rename
	}

	public void updateDiagram(final AgeDiagram diagram) {
		final List<AgeDiagramElement> connectionElements = new LinkedList<>();
		final BusinessObjectTree boTree = Objects.requireNonNull(boTreeFactory.createBusinessObjectTree(diagram.getConfiguration()), "Business Object Tree Factory returned null");
		
		diagram.modify(new DiagramModifier() {
			@Override
			public void modify(final DiagramModification m) {
				updateElements(m, diagram, boTree.getRootNodes(), connectionElements);
				finalizeConnections(m, connectionElements);
			}			
		});
	}
	
	/**
	 * 
	 * @param container is the container for which to update the elements
	 * @param bos 
	 * @param connectionElements is a collection to populate with connection elements.
	 */
	private void updateElements(final DiagramModification m, final DiagramNode container, final Collection<BusinessObjectTreeNode> bos, final Collection<AgeDiagramElement> connectionElements) {
		for(final BusinessObjectTreeNode n : bos) {
			// Get existing element if it exists.
			AgeDiagramElement element = container.getByRelativeReference(n.getRelativeReference());
			
			// Create the element if it does not exist
			if(element == null) {
				final AgeDiagramElement removedGhost = removeGhost(container, n.getRelativeReference());
				if(removedGhost == null) {
					element = new AgeDiagramElement(container, n.getBusinessObject(), n.getRelativeReference(), n.getCanonicalReference(), n.getName());
				} else {
					element = removedGhost;
				}
				
				m.addElement(element);
			} else {
				// Update the business object. Although the reference matches. The business object may be new.
				m.updateBusinessObjectWithSameRelativeReference(element, n.getBusinessObject());
			}
			
			// Set the graphic
			m.setGraphic(element, infoProvider.getGraphic(element));
			
			final DockingPosition defaultDockingPosition = Objects.requireNonNull(infoProvider.getDefaultDockingPosition(element), "getDefaultDockingPosition() must not return null");
			final boolean dockable = defaultDockingPosition != DockingPosition.NOT_DOCKABLE;
			if(dockable) {
				// If parent is docked, the child should use the group docking area
				if(container instanceof AgeDiagramElement && ((AgeDiagramElement) container).getDockArea() != null) { 								 
					m.setDockArea(element, DockArea.GROUP);
				} else if(element.getDockArea() == null) {
					m.setDockArea(element, defaultDockingPosition.getDockArea());
				}
			} else {
				// Ensure the dock area is null
				m.setDockArea(element, null);
			}		
			
			// Set the label configuration if one is provided and the element's label configuration has not already been configuration
			if(element.getLabelConfiguration() == null) {
				m.setLabelConfiguration(element, infoProvider.getDefaultLabelConfiguration(element));
			}
			
			// Add connection elements to the list so that they can be easily accessed in later stages of the update process
			if(element.getGraphic() instanceof AgeConnection) {
				connectionElements.add(element);
			}
			
			// Update the element's children
			updateElements(m, element, n.getChildren(), connectionElements);
		}
		
		// Remove elements whose business objects are not in the business object tree
		// At this point, it is assumed that there is a diagram element for each business object. Elements that are incomplete may be pruned later.
		// If the collections are the same size, there is nothing to remove
		if(bos.size() != container.getDiagramElements().size()) {
			// Build Set of Relative References of All the Objects in the Business Object Tree
			final Set<RelativeBusinessObjectReference> boTreeRelativeReferenceSet = bos.stream().map((n) -> n.getRelativeReference()).collect(Collectors.toCollection(HashSet::new));
			Iterator<AgeDiagramElement> childrenIt = container.getDiagramElements().iterator();
			while(childrenIt.hasNext()) {
				final AgeDiagramElement child = childrenIt.next();
				if(!boTreeRelativeReferenceSet.contains(child.getRelativeReference())) {
					addGhost(child);
					m.removeElement(child);
				}
			}
		}
	}
	
	/**
	 * Finishes updating connections and removes invalid connections
	 */
	private void finalizeConnections(final DiagramModification m, final Collection<AgeDiagramElement> connectionElements) {
		// Set connection ends
		for(final AgeDiagramElement e : connectionElements) {
			m.setConnectionStart(e, infoProvider.getConnectionStart(e));
			m.setConnectionEnd(e, infoProvider.getConnectionEnd(e));
		}
		
		// Build Collection of All Invalid Connections
		final Set<AgeDiagramElement> invalidConnectionElements = new HashSet<>();
		Iterator<AgeDiagramElement> connectionElementsIt = connectionElements.iterator();
		while(connectionElementsIt.hasNext()) {
			final AgeDiagramElement e = connectionElementsIt.next();
			
			if(e.getStartElement() == null || e.getEndElement() == null) {
				invalidConnectionElements.add(e);
				
				// Remove the connection from the connection collection and the diagram
				connectionElementsIt.remove();
				addGhost(e);
				m.removeElement(e);
			}
		}
		
		// Loop through the connections repeatedly until there are no longer any invalid connections referenced.
		for(int lastSize = 0; (invalidConnectionElements.size() - lastSize) > 0; lastSize = invalidConnectionElements.size()) {
			connectionElementsIt = connectionElements.iterator();
			while(connectionElementsIt.hasNext()) {
				final AgeDiagramElement e = connectionElementsIt.next();
				if(invalidConnectionElements.contains(e.getStartElement()) || invalidConnectionElements.contains(e.getEndElement())) {
					invalidConnectionElements.add(e);
					
					// Remove the connection from the connection collection and the diagram
					connectionElements.remove(e);
					addGhost(e);
					m.removeElement(e);
				}
			}
		}
	}
	
	// Ghosting
	public void clearGhosts() {
		containerToRelativeReferenceToGhostMap.clear();
	}
	
	public void addGhost(final AgeDiagramElement ghost) {
		final DiagramNode container = ghost.getContainer();
		
		// Get the mapping from relative reference to the ghost for the container
		Map<RelativeBusinessObjectReference, AgeDiagramElement> relativeReferenceToGhostMap = containerToRelativeReferenceToGhostMap.get(container);
		if(relativeReferenceToGhostMap == null) {
			relativeReferenceToGhostMap = new HashMap<>();
			containerToRelativeReferenceToGhostMap.put(container, relativeReferenceToGhostMap);
		}
		
		// Add the ghost to the map		
		relativeReferenceToGhostMap.put(ghost.getRelativeReference(), ghost);		
	}
	
	public AgeDiagramElement removeGhost(final DiagramNode container, final RelativeBusinessObjectReference relativeReference) {
		final Map<RelativeBusinessObjectReference, AgeDiagramElement> relativeReferenceToGhostMap = containerToRelativeReferenceToGhostMap.get(container);
		if(relativeReferenceToGhostMap == null) {
			return null;
		}
		
		return relativeReferenceToGhostMap.remove(relativeReference);
	}	
}
