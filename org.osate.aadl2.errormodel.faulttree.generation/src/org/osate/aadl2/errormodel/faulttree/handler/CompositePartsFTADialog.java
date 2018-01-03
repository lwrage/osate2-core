
package org.osate.aadl2.errormodel.faulttree.handler;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class CompositePartsFTADialog extends TitleAreaDialog {

	private String value;
	java.util.List<String> values;
	private Combo errorMode;
	private String target = "";

	public CompositePartsFTADialog(Shell parentShell) {
		super(parentShell);
	}

	public void setValues(java.util.List<String> v) {
		values = v;
	}

	public void setTarget(String targetname) {
		target = targetname;
	}

	@Override
	public void create() {
		super.create();
		setTitle("Fault-Tree Analysis");
		setMessage("Select the Failure Mode to Analyze (error state, propagation)"
				+ (target.isEmpty() ? "" : " for " + target), IMessageProvider.INFORMATION);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);

		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(layout);

		Label labelErrorMode = new Label(container, SWT.NONE);
		labelErrorMode.setText("Error-Mode");

		errorMode = new Combo(container, SWT.READ_ONLY | SWT.BORDER);
		String val[] = new String[values.size()];
		for (int i = 0; i < values.size(); i++) {
			val[i] = values.get(i);
		}
		errorMode.setItems(val);

		errorMode.select(0);
		return area;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	private void saveInput() {
		value = errorMode.getText();
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	public String getValue() {
		return value;
	}

}
