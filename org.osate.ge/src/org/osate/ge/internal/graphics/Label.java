package org.osate.ge.internal.graphics;

public class Label implements AgeShape {
	@Override
	public boolean isMoveable() {
		return false;
	}
	
	@Override
	public boolean isResizeable() {
		return false;
	}
}
