package org.osate.ge.internal.util;

import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.osate.aadl2.modelsupport.resources.PredeclaredProperties;

public class ProjectUtil {
	/**
	 * Get affects projects. At this point, this function returns projects which directly or indirectly reference the project containing the model element.
	 * @param project
	 * @param relevantProjects
	 * @return relevantProjects
	 */
	public static Set<IProject> getAffectedProjects(final IProject project, final Set<IProject> relevantProjects) {
		if (project.isAccessible()) {
			if (relevantProjects.add(project)) {
				// Get referencing projects if the project was not already part of the relevant projects set
				for (final IProject referencingProject : project.getReferencingProjects()) {
					getAffectedProjects(referencingProject, relevantProjects);
				}

				// Get referencing projects if the project was not already part of the relevant projects set
				try {
					for (final IProject referencedProject : project.getReferencedProjects()) {
						// Don't handle the plugin resources project or the set of referencing and referenced projects will likely contain all AADL projects
						if (!PredeclaredProperties.PLUGIN_RESOURCES_PROJECT_NAME
								.equalsIgnoreCase(referencedProject.getName())) {
							getAffectedProjects(referencedProject, relevantProjects);
						}
					}
				} catch (final CoreException e) {
					// Ignore
				}
			}
		}

		return relevantProjects;
	}

	public static IProject getProject(final URI elementUri) {
		final IPath projectPath = new Path(elementUri.toPlatformString(true)).uptoSegment(1);
		final IResource projectResource = ResourcesPlugin.getWorkspace().getRoot().findMember(projectPath);
		if (!(projectResource instanceof IProject)) {
			return null;
		}
		return (IProject) projectResource;
	}
}
