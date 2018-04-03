package org.osate.xtext.aadl2.errormodel.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class Page extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private TabFolder folder;

	public Page() {
		super(GRID);
		setPreferenceStore(EMV2Plugin.getDefault().getPreferenceStore());
		setDescription("Experimental Features in EMV2");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	@Override
	public void createFieldEditors() {
		RadioGroupFieldEditor separateEMV2File = new RadioGroupFieldEditor(Constants.EMV2_SEPARATE_FILE,
				"Allow EMV2 libraries and subclauses in separate files", 1,
				new String[][] { { "Embedded EMV2 Library and Subclauses", Constants.EMV2_SEPARATE_FILE_NO },
			{ "EMV2 libraries and subclauses in separate file", Constants.EMV2_SEPARATE_FILE_YES } },
				getFieldEditorParent(), true);
		addField(separateEMV2File);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
	}

	/**
	 * Adjust the layout of the field editors so that they are properly aligned.
	 */
	@Override
	protected void adjustGridLayout() {
		if (folder != null) {
			TabItem[] items = folder.getItems();
			for (int j = 0; j < items.length; j++) {
				GridLayout layout = ((GridLayout) ((Composite) items[j].getControl()).getLayout());
				layout.numColumns = 3;
				layout.marginHeight = 5;
				layout.marginWidth = 5;
			}
		}

		// need to call super.adjustGridLayout() since fieldEditor.adjustForNumColumns() is protected
		super.adjustGridLayout();

		// reset the main container to a single column
		((GridLayout) super.getFieldEditorParent().getLayout()).numColumns = 1;
	}

	/**
	 * Returns a parent composite for a field editor.
	 * <p>
	 * This value must not be cached since a new parent may be created each time this method called. Thus this method
	 * must be called each time a field editor is constructed.
	 * </p>
	 * @return a parent
	 */
	@Override
	protected Composite getFieldEditorParent() {
		if (folder == null || folder.getItemCount() == 0) {
			return super.getFieldEditorParent();
		}
		return (Composite) folder.getItem(folder.getItemCount() - 1).getControl();
	}

	/**
	 * Adds a tab to the page.
	 * @param text the tab label
	 */
	public void addTab(String text) {
		if (folder == null) {
			// initialize tab folder
			folder = new TabFolder(super.getFieldEditorParent(), SWT.NONE);
			folder.setLayoutData(new GridData(GridData.FILL_BOTH));
		}

		TabItem item = new TabItem(folder, SWT.NONE);
		item.setText(text);

		Composite currentTab = new Composite(folder, SWT.NULL);
		GridLayout layout = new GridLayout();
		currentTab.setLayout(layout);
		currentTab.setFont(super.getFieldEditorParent().getFont());
		currentTab.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		item.setControl(currentTab);
	}

}