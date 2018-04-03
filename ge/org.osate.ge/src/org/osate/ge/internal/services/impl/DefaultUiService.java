package org.osate.ge.internal.services.impl;

import java.util.Objects;

import org.osate.ge.internal.services.EditorProvider;
import org.osate.ge.internal.services.UiService;

public class DefaultUiService implements UiService {
	private final EditorProvider editorProvider;

	public DefaultUiService(final EditorProvider editorProvider) {
		this.editorProvider = Objects.requireNonNull(editorProvider, "editorProvider must not be null");
	}

	@Override
	public void activateTool(final Object tool) {
		editorProvider.getEditor().activateTool(tool);
	}

	@Override
	public void deactivateActiveTool() {
		editorProvider.getEditor().deactivateActiveTool();
	}

	@Override
	public void clearSelection() {
		editorProvider.getEditor().clearSelection();
	}
}
