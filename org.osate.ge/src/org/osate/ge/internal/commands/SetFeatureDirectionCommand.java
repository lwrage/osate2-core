package org.osate.ge.internal.commands;

import javax.inject.Named;

import org.osate.aadl2.AbstractFeature;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.DirectedFeature;
import org.osate.aadl2.DirectionType;
import org.osate.aadl2.FeatureGroup;
import org.osate.aadl2.FeatureGroupType;
import org.osate.ge.di.Activate;
import org.osate.ge.di.CanActivate;
import org.osate.ge.di.GetLabel;
import org.osate.ge.di.IsAvailable;
import org.osate.ge.di.Names;
import org.osate.ge.internal.di.GetBusinessObjectToModify;
import org.osate.ge.BusinessObjectContext;
import org.osate.ge.query.StandaloneQuery;
import org.osate.ge.services.QueryService;

public class SetFeatureDirectionCommand {
	private static final StandaloneQuery parentQuery = StandaloneQuery.create((root) -> root.ancestor(1));
	final DirectionType featDir;

	public SetFeatureDirectionCommand(final DirectionType featDir) {
		this.featDir = featDir;
	}

	@GetLabel
	public String getLabel() {
		if (featDir == DirectionType.IN) {
			return "Set Direction to In";
		}
		else if (featDir == DirectionType.OUT) {
			return "Set Direction to Out";
		}
		
		return "Set Direction to In and Out";
	}

	@IsAvailable
	public boolean isAvailable(@Named(Names.BUSINESS_OBJECT) final DirectedFeature feat,
			@Named(Names.BUSINESS_OBJECT_CONTEXT) final BusinessObjectContext boc,
			final QueryService queryService) {
		final Object containerBo = queryService.getFirstBusinessObject(parentQuery, boc);
		final Classifier classifier = feat.getContainingClassifier();
		return classifier == containerBo && (classifier instanceof FeatureGroupType || classifier instanceof ComponentType);
	}

	@CanActivate
	public boolean canActivate(@Named(Names.BUSINESS_OBJECT) final DirectedFeature feat) {
		return featDir != feat.getDirection();
	}

	@GetBusinessObjectToModify
	public Object getBusinessObjectToModify(@Named(Names.BUSINESS_OBJECT) final Object bo) {
		return bo;
	}
	
	@Activate
	public boolean activate(@Named(Names.BUSINESS_OBJECT) final DirectedFeature feat) {
		if(feat instanceof AbstractFeature || feat instanceof FeatureGroup) {
			feat.setIn(featDir != DirectionType.IN_OUT && featDir == DirectionType.IN);
			feat.setOut(featDir != DirectionType.IN_OUT && featDir == DirectionType.OUT);
		} else {
			feat.setIn(featDir == DirectionType.IN_OUT || featDir == DirectionType.IN);
			feat.setOut(featDir == DirectionType.IN_OUT || featDir == DirectionType.OUT);
		}
		
		return true;
	}
}
