/*
 * generated by Xtext
 */
package org.osate.reqspec.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.osate.reqspec.ui.internal.ReqSpecActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ReqSpecExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ReqSpecActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ReqSpecActivator.getInstance().getInjector(ReqSpecActivator.ORG_OSATE_REQSPEC_REQSPEC);
	}
	
}
