package org.osate.ge.internal.diagram.runtime;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Immutable type which represents the diagram configuration.
 *
 * @see DiagramConfigurationBuilder
 */
public class DiagramConfiguration {
	private final CanonicalBusinessObjectReference contextBoReference;
	private final Set<String> lcEnabledAadlPropertyNames; // Lowercase AADL property names

	// Determines whether the primary label of connections should be visible by default. This overrides the settings of the business object handler and can be
	// overridden by the user selection.
	private final Boolean connectionPrimaryLabelsVisible;

	DiagramConfiguration(final CanonicalBusinessObjectReference contextBoReference,
			final Set<String> displayedAadlPropertyNames, final Boolean connectionPrimaryLabelsVisible) {
		this.contextBoReference = contextBoReference == null ? null : contextBoReference;
		this.lcEnabledAadlPropertyNames = Collections.unmodifiableSet(new HashSet<String>(Objects.requireNonNull(displayedAadlPropertyNames, "displayedAadlPropertyNames must not be null")));
		this.connectionPrimaryLabelsVisible = connectionPrimaryLabelsVisible;
	}

	public CanonicalBusinessObjectReference getContextBoReference() {
		return contextBoReference;
	}

	/**
	 * Returns an unmodifiable collection of enable AADL qualified property names. All names will be lower case.
	 * @return
	 */
	public Set<String> getEnabledAadlPropertyNames() {
		return lcEnabledAadlPropertyNames;
	}

	public Boolean getConnectionPrimaryLabelsVisible() {
		return connectionPrimaryLabelsVisible;
	}

	@Override
	public String toString() {
		return "{ contextBoReference: " + contextBoReference + ", enabledAadlPropertyNames: "
				+ lcEnabledAadlPropertyNames + ", connectionPrimaryLabelsVisible: " + connectionPrimaryLabelsVisible
				+ " } ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((connectionPrimaryLabelsVisible == null) ? 0 : connectionPrimaryLabelsVisible.hashCode());
		result = prime * result + ((contextBoReference == null) ? 0 : contextBoReference.hashCode());
		result = prime * result + ((lcEnabledAadlPropertyNames == null) ? 0 : lcEnabledAadlPropertyNames.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		DiagramConfiguration other = (DiagramConfiguration) obj;
		if (connectionPrimaryLabelsVisible == null) {
			if (other.connectionPrimaryLabelsVisible != null) {
				return false;
			}
		} else if (!connectionPrimaryLabelsVisible.equals(other.connectionPrimaryLabelsVisible)) {
			return false;
		}
		if (contextBoReference == null) {
			if (other.contextBoReference != null) {
				return false;
			}
		} else if (!contextBoReference.equals(other.contextBoReference)) {
			return false;
		}
		if (lcEnabledAadlPropertyNames == null) {
			if (other.lcEnabledAadlPropertyNames != null) {
				return false;
			}
		} else if (!lcEnabledAadlPropertyNames.equals(other.lcEnabledAadlPropertyNames)) {
			return false;
		}
		return true;
	}
}
