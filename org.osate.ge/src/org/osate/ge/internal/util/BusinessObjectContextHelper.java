package org.osate.ge.internal.util;

import java.util.Objects;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osate.ge.BusinessObjectContext;
import org.osate.ge.di.GetGraphicalConfiguration;
import org.osate.ge.di.GetName;
import org.osate.ge.di.Names;
import org.osate.ge.internal.AgeGraphicalConfiguration;
import org.osate.ge.internal.services.ExtensionService;

/**
 * Helper class for invoking business object handler methods. 
 * Only supports a subset of messages at this time. 
 *
 */
public class BusinessObjectContextHelper implements AutoCloseable {
	private final IEclipseContext ctx;
	
	public BusinessObjectContextHelper(final ExtensionService extService) {
		this.ctx = Objects.requireNonNull(extService, "extService must not be null").createChildContext();
	}
	
	@Override
	public void close() {
		ctx.dispose();
	}
	
	public String getName(final BusinessObjectContext boc, final Object boh) {
		try {
			updateContextArguments(boc);
	    	return (String)ContextInjectionFactory.invoke(boh, GetName.class, ctx, null);
		} finally {
			clearContextArguments();
		}
	}
	
	public AgeGraphicalConfiguration getGraphicalConfiguration(final BusinessObjectContext boc, final Object boh) {
		try {
			updateContextArguments(boc);
			return (AgeGraphicalConfiguration)ContextInjectionFactory.invoke(boh, GetGraphicalConfiguration.class, ctx, null);
		} finally {
			clearContextArguments();
		}
	}
	
	private void updateContextArguments(final BusinessObjectContext boc) {
		Objects.requireNonNull(boc, "boc must not be null");
		ctx.set(Names.BUSINESS_OBJECT, boc.getBusinessObject());
		ctx.set(Names.BUSINESS_OBJECT_CONTEXT, boc);
	}
	
	private void clearContextArguments() {
		ctx.remove(Names.BUSINESS_OBJECT);
		ctx.remove(Names.BUSINESS_OBJECT_CONTEXT);
	}
}
