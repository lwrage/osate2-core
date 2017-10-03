/*******************************************************************************
 * Copyright (C) 2013 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0073.
 *******************************************************************************/
package org.osate.ge.internal.ui.dialogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ModalPath;
import org.osate.aadl2.ModeFeature;

/**
 * Dialog for configuring the modes and mode transitions, "mode features", in which a modal element is contained.
 *
 */
public class SetInModeFeaturesDialog extends TitleAreaDialog {
	private final List<Control> modeControls = new ArrayList<Control>(); // A list of all controls that are involved in configuring modes. Will be disabled when the all modes check box is selected.
	private final Map<String, ModeFeature> inModesOrTransitions = new HashMap<>();
	private final Set<ModeFeature> localModes = new HashSet<>();
	private final Set<ModeFeature> localModeTransitions = new HashSet<>();
	private boolean inAllModes;

	/**
	 *
	 * @param parentShell
	 * @param modalPath selected element on flows dialog
	 * @param compImpl the component containing the modalPath
	 * @param inModesOrTransitions
	 */
	public SetInModeFeaturesDialog(final Shell parentShell,
			final ModalPath modalPath, final ComponentImplementation compImpl) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE);

		// Available Modes
		localModes.addAll(compImpl.getAllModes());
		// Available Mode Transitions
		localModeTransitions.addAll(compImpl.getAllModeTransitions());

		for (final ModeFeature mf : modalPath.getInModeOrTransitions()) {
			inModesOrTransitions.put(mf.getName(), mf);
		}

		inAllModes = inAllModes();
	}

	private boolean inAllModes() {
		return inModesOrTransitions.isEmpty();
	}

	@Override
	public void create() {
		super.create();
		setTitle("Modes");
		setMessage("Select the modes for the element.", IMessageProvider.INFORMATION);
	}

	@Override
	protected void configureShell(final Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Configure In Modes");
		newShell.setMinimumSize(400, 225);
	}

	public Map<String, ModeFeature> getNameToModeFeatureMap() {
		if(inAllModes) {
			return new HashMap<>();
		}

		return inModesOrTransitions;
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite area = (Composite)super.createDialogArea(parent);

		ScrolledComposite scrolled = new ScrolledComposite(area, SWT.H_SCROLL | SWT.V_SCROLL);
		scrolled.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		scrolled.setLayout(new GridLayout());
		scrolled.setExpandVertical(true);
		scrolled.setExpandHorizontal(true);

		final Composite container = new Composite(scrolled, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		final GridLayout layout = new GridLayout();
		container.setLayout(layout);

		// All modes checkbox
		final Button allModesBtn = new Button(container, SWT.CHECK);
		allModesBtn.setText("All Modes");
		final GridData allModesGridData = new GridData();
		allModesGridData.horizontalSpan = layout.numColumns;
		allModesBtn.setLayoutData(allModesGridData);
		allModesBtn.setSelection(inAllModes);

		final Label modeSeparator = new Label(container, SWT.HORIZONTAL | SWT.SEPARATOR);
		final GridData modeSeparatorLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		modeSeparatorLayoutData.horizontalSpan = layout.numColumns;
		modeSeparator.setLayoutData(modeSeparatorLayoutData);

		// Add controls for each of the local modes
		for (final ModeFeature mf : localModes) {
			addLocalMode(container, mf);
		}

		scrolled.setContent(container);
		scrolled.setMinSize(container.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		// If mode transitions are available
		if (!localModeTransitions.isEmpty()) {
			final GridData modeTransitionSeparatorLayoutData = new GridData(GridData.FILL_HORIZONTAL);
			final Label modeTransitionSeparator = new Label(container, SWT.HORIZONTAL | SWT.SEPARATOR);
			modeTransitionSeparatorLayoutData.horizontalSpan = layout.numColumns;
			modeTransitionSeparator.setLayoutData(modeTransitionSeparatorLayoutData);
			for (final ModeFeature mf : localModeTransitions) {
				addLocalMode(container, mf);
			}
		}

		// Update all check boxes when all modes is selected
		updateEnabledStateOfModeControls(!allModesBtn.getSelection());
		allModesBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				updateEnabledStateOfModeControls(!allModesBtn.getSelection());
				inAllModes = allModesBtn.getSelection();
			}
		});

		return area;
	}

	private void updateEnabledStateOfModeControls(final boolean value) {
		for(final Control c : modeControls) {
			c.setEnabled(value);
		}
	}

	private void addLocalMode(final Composite container, final ModeFeature mf) {
		final Button modeBtn = new Button(container, SWT.CHECK);
		modeBtn.setText(mf.getName());
		modeControls.add(modeBtn);

		// Set checked state
		if (inModesOrTransitions.keySet().contains(mf.getName())) {
			modeBtn.setSelection(true);
		}

		// Handle selections to the mode button or the child mode combo
		final SelectionListener selectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				if(modeBtn.getSelection()) {
					inModesOrTransitions.put(mf.getName(), mf);
				} else {
					inModesOrTransitions.remove(mf.getName());
				}
			}
		};

		// Register selection listeners
		modeBtn.addSelectionListener(selectionListener);
	}
}
