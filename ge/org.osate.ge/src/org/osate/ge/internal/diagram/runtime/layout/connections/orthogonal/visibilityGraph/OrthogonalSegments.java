package org.osate.ge.internal.diagram.runtime.layout.connections.orthogonal.visibilityGraph;

import java.util.Collections;
import java.util.Set;

/**
 * This class retains a references to the passed in segments. It does not make a copy of the segments.
 *
 * @param <T>
 */
public class OrthogonalSegments<T> {
	private final Set<HorizontalSegment<T>> horizontalSegments;
	private final Set<VerticalSegment<T>> verticalSegments;

	public OrthogonalSegments(final Set<HorizontalSegment<T>> horizontalSegments,
			final Set<VerticalSegment<T>> verticalSegments) {
		this.horizontalSegments = Collections.unmodifiableSet(horizontalSegments);
		this.verticalSegments = Collections.unmodifiableSet(verticalSegments);
	}

	public final Set<HorizontalSegment<T>> getHorizontalSegments() {
		return horizontalSegments;
	}

	public final Set<VerticalSegment<T>> getVerticalSegments() {
		return verticalSegments;
	}
}