package org.osate.xtext.aadl2.errormodel.util;

import java.util.Collection;

import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeToken;

public interface ErrorModelState {

	/**
	 * the type token associated with a given model object
	 * For model objects that also have an error state the typetoken applies to the state
	 * @return
	 */
	public TypeToken getToken();

	/**
	 * set the current state to the token.
	 * Also record it in the visited history.
	 * return true if previously visited.
	 * return false if not previously visited.
	 * @param token
	 * @return
	 */
	public void setVisitToken(TypeToken token);

	/**
	 * remove the token from the visited list
	 * @param token
	 */
	public void removeVisitedToken(TypeToken token);

	/**
	 * the visited type tokens associated with a given model object
	 * For model objects that also have an error state the typetoken applies to the state
	 * @return
	 */
	public Collection<TypeToken> getVisitedTokens();

	/**
	 * returns true if type token is already in the list of visited tokens.
	 * This test will also return true if its supertype is included
	 * @param tt
	 * @return
	 */
	public boolean visited(TypeToken tt);

	/**
	 * set the type token for model object
	 * @param token
	 */
	public void setToken(TypeToken token);

	/**
	 * set the type token for model object to null
	 * @param token
	 */
	public void unsetToken();

	/**
	 * current error behavior state of a component
	 * Should only be set for components
	 * FOr states with error types, the type token represents the token
	 * @return
	 */
	public ErrorBehaviorState getErrorState();

	/**
	 * set the current error behavior state of a component
	 * @param errorBehaviorState
	 */
	public void setErrorState(ErrorBehaviorState errorBehaviorState);

	/**
	 * set all elements of error model state to null
	 */
	public void unsetAll();
}
