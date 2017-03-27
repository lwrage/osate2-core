package org.osate.ge.internal.query;

import java.util.Deque;
import org.osate.ge.internal.diagram.DiagramNode;

class AncestorsQuery<A> extends AgeDiagramElementQuery<A> {
	public AncestorsQuery(final AgeDiagramElementQuery<A> prev) {
		super(prev);
	}
	
	@Override
	void run(final Deque<AgeDiagramElementQuery<A>> remainingQueries, final DiagramNode ctx, final QueryExecutionState<A> state, final QueryResult result) {
		DiagramNode e = ctx;

		while(e != null && !result.done) {		
			e = AncestorUtil.getContainer(e);
			if(e != null) {
				processResultValue(remainingQueries, e, state, result);
			}
		}
	}
}
