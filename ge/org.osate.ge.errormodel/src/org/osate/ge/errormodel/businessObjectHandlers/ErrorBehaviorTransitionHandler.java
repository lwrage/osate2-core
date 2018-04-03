/*******************************************************************************
 * Copyright (C) 2016 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0105.
 *******************************************************************************/
package org.osate.ge.errormodel.businessObjectHandlers;

import javax.inject.Named;
import org.osate.ge.BusinessObjectContext;
import org.osate.ge.GraphicalConfiguration;
import org.osate.ge.GraphicalConfigurationBuilder;
import org.osate.ge.PaletteEntry;
import org.osate.ge.di.CanCreate;
import org.osate.ge.di.CanDelete;
import org.osate.ge.di.CanStartConnection;
import org.osate.ge.di.Create;
import org.osate.ge.di.GetGraphicalConfiguration;
import org.osate.ge.di.GetName;
import org.osate.ge.di.GetPaletteEntries;
import org.osate.ge.di.IsApplicable;
import org.osate.ge.di.ValidateName;
import org.osate.ge.errormodel.util.ErrorModelNamingUtil;
import org.osate.ge.graphics.ArrowBuilder;
import org.osate.ge.graphics.ConnectionBuilder;
import org.osate.ge.graphics.Graphic;
import org.osate.ge.query.StandaloneQuery;
import org.osate.ge.services.QueryService;
import org.osate.ge.di.Names;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition;

public class ErrorBehaviorTransitionHandler {
	private static final Graphic graphic = ConnectionBuilder.create().
			sourceTerminator(ArrowBuilder.create().open().build()).
			destinationTerminator(ArrowBuilder.create().filled().build()).build();
	private static StandaloneQuery srcQuery = StandaloneQuery.create((rootQuery) -> rootQuery.parent().children().filterByBusinessObjectRelativeReference(ebt->((ErrorBehaviorTransition)ebt).getSource()));
	private static StandaloneQuery dstQuery = StandaloneQuery.create((rootQuery) -> rootQuery.parent().children().filterByBusinessObjectRelativeReference(ebt->((ErrorBehaviorTransition)ebt).getTarget()));
	
	@GetPaletteEntries
	public PaletteEntry[] getPaletteEntries() {
		return new PaletteEntry[] { 
			// Disabled until UI for creating transitions is implemented.
			//PaletteEntryFactory.makeCreateConnectionEntry(ErrorModelCategories.ERROR_MODEL, "Transition", null, null)
		};
	}
	
	@IsApplicable
	@CanDelete
	public boolean isApplicable(final @Named(Names.BUSINESS_OBJECT) ErrorBehaviorTransition transition) {
		return true;
	}
	
	@GetGraphicalConfiguration
	public GraphicalConfiguration getGraphicalConfiguration(final @Named(Names.BUSINESS_OBJECT_CONTEXT) BusinessObjectContext boc, 
			final QueryService queryService) {
		return GraphicalConfigurationBuilder.create().
			graphic(graphic).
			source(getSource(boc, queryService)).
			destination(getDestination(boc, queryService)).
			build();
	}
	
	private BusinessObjectContext getSource(final @Named(Names.BUSINESS_OBJECT_CONTEXT) BusinessObjectContext boc, 
			final QueryService queryService) {
		return queryService.getFirstResult(srcQuery, boc);
	}
	
	private BusinessObjectContext getDestination(final @Named(Names.BUSINESS_OBJECT_CONTEXT) BusinessObjectContext boc, 
			final QueryService queryService) {
		return queryService.getFirstResult(dstQuery, boc);
	}
		
	@GetName
	public String getName(final @Named(Names.BUSINESS_OBJECT) ErrorBehaviorTransition bo) {
		return bo.getName();
	}
	
	@ValidateName
	public String validateName(final @Named(Names.BUSINESS_OBJECT) ErrorBehaviorTransition transition, final @Named(Names.NAME) String value) {
		final ErrorBehaviorStateMachine stateMachine = (ErrorBehaviorStateMachine)transition.eContainer();
		return ErrorModelNamingUtil.validateName(stateMachine, transition.getName(), value);
	}
		
	// TODO
	/*@GetCreateOwner
	public ContainerShape getCreateConnectionOwner() {
		return null;
	}
	*/
	@CanStartConnection
	public boolean canStartConnection(@Named(Names.SOURCE_BO) final ErrorBehaviorState state) {
		return true;
	}
	
	@CanCreate
	public boolean canCreateConnection() {
		// TODO
		return true;
	}
	
	@Create
	public Object createConnectionBusinessObject() {
		// TODO
		return null;
	}
}
