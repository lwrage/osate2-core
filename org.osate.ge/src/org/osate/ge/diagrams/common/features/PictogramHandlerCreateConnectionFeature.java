package org.osate.ge.diagrams.common.features;

import java.util.Objects;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.osate.ge.ext.Categorized;
import org.osate.ge.ext.ExtensionPaletteEntry;
import org.osate.ge.ext.Names;
import org.osate.ge.ext.annotations.CanCreateConnection;
import org.osate.ge.ext.annotations.CanStartConnection;
import org.osate.ge.ext.annotations.CreateConnection;
import org.osate.ge.services.ExtensionService;

// ICreateConnectionFeature implementation that delegates behavior to a pictogram handler
public class PictogramHandlerCreateConnectionFeature extends AbstractCreateConnectionFeature implements Categorized {
	private final ExtensionService extService;
	private final ExtensionPaletteEntry paletteEntry;
	private final Object handler;
	
	public PictogramHandlerCreateConnectionFeature(final ExtensionService extService, final IFeatureProvider fp, final ExtensionPaletteEntry paletteEntry, final Object pictogramHandler) {
		super(fp, paletteEntry.getLabel(), "");
		this.extService = Objects.requireNonNull(extService, "extService must not be null");
		this.paletteEntry = Objects.requireNonNull(paletteEntry, "paletteEntry must not be null");
		this.handler = Objects.requireNonNull(pictogramHandler, "pictogramHandler must not be null");
	}

	@Override
	public String getCategory() {
		return paletteEntry.getCategory();
	}

	@Override
	public String getCreateImageId() {
		return paletteEntry.getImageId();
	}

	@Override
	public boolean canStartConnection(final ICreateConnectionContext context) {
		final IEclipseContext eclipseCtx = createEclipseContext(context);
		try {
			return (boolean)ContextInjectionFactory.invoke(handler, CanStartConnection.class, eclipseCtx);
		} finally {
			eclipseCtx.dispose();
		}
	}
	
	@Override
	public boolean canCreate(final ICreateConnectionContext context) {
		final IEclipseContext eclipseCtx = createEclipseContext(context);
		try {
			return (boolean)ContextInjectionFactory.invoke(handler, CanCreateConnection.class, eclipseCtx);
		} finally {
			eclipseCtx.dispose();
		}
	}

	@Override
	public Connection create(final ICreateConnectionContext context) {
		final IEclipseContext eclipseCtx = createEclipseContext(context);
		try {
			return (Connection)ContextInjectionFactory.invoke(handler, CreateConnection.class, eclipseCtx);
		} finally {
			eclipseCtx.dispose();
		}
	}
	
	private final IEclipseContext createEclipseContext(final ICreateConnectionContext createCtx) {
		final IEclipseContext eclipseCtx = extService.createChildContext();
		try {
			eclipseCtx.set(Names.SOURCE_PICTOGRAM_ELEMENT, createCtx.getSourcePictogramElement());
			eclipseCtx.set(Names.TARGET_PICTOGRAM_ELEMENT, createCtx.getTargetPictogramElement());
			eclipseCtx.set(Names.PALETTE_ENTRY_CONTEXT, paletteEntry.getContext());
			return eclipseCtx;
		} catch(Exception ex) {
			eclipseCtx.dispose();
			throw ex;
		}		
	}
}
