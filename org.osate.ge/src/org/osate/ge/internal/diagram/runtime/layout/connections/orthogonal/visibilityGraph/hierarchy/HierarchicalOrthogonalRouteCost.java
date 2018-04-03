package org.osate.ge.internal.diagram.runtime.layout.connections.orthogonal.visibilityGraph.hierarchy;

/**
 * Route cost for use with hierarchical orthogonal routes.
 * In order of priority:
 * Routes which have lower hierarchy crossings are considered cheaper.
 * Routes which have a lower number of bends are considered cheaper.
 * Lastly, routes with a lower length are considered cheaper.
 *
 */
public class HierarchicalOrthogonalRouteCost implements Comparable<HierarchicalOrthogonalRouteCost> {
	public static HierarchicalOrthogonalRouteCost ZERO = new HierarchicalOrthogonalRouteCost(0, 0, 0);
	public static HierarchicalOrthogonalRouteCost INFINITY = new HierarchicalOrthogonalRouteCost(Integer.MAX_VALUE, Integer.MAX_VALUE,
			Double.POSITIVE_INFINITY);

	public final int numberOfHierarchyCrosssings;
	public final int numberOfBends;
	public final double length;

	public HierarchicalOrthogonalRouteCost(final int numberOfHierarchyCrosssings, final int numberOfBends, final double length) {
		this.numberOfHierarchyCrosssings = numberOfHierarchyCrosssings;
		this.numberOfBends = numberOfBends;
		this.length = length;
	}

	@Override
	public int compareTo(final HierarchicalOrthogonalRouteCost c2) {
		int result = Integer.compare(numberOfHierarchyCrosssings, c2.numberOfHierarchyCrosssings);
		if (result == 0) {
			result = Integer.compare(numberOfBends, c2.numberOfBends);
			if (result == 0) {
				return Double.compare(length, c2.length);
			}
		}

		return result;
	}

	public static HierarchicalOrthogonalRouteCost add(final HierarchicalOrthogonalRouteCost c1, final HierarchicalOrthogonalRouteCost c2) {
		return new HierarchicalOrthogonalRouteCost(c1.numberOfHierarchyCrosssings + c2.numberOfHierarchyCrosssings,
				c1.numberOfBends + c2.numberOfBends, c1.length + c2.length);
	}
}