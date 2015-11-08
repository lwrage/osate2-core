package org.osate.assure.ui.handlers;

	import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.xtext.EcoreUtil2;
import org.osate.aadl2.Element;
import org.osate.alisa.workbench.alisa.AssurancePlan;
import org.osate.assure.assure.AssuranceCase;
import org.osate.assure.assure.AssureResult;
import org.osate.assure.ui.views.AssureView;
import org.osate.assure.util.AssureUtilExtension;


	public class RunAssureHandler extends AlisaHandler {
		private static final String RERUN_ID = "org.osate.alisa.commands.rerunAssure";
		private IHandlerActivation rerunActivation;

		@Override
		protected String getJobName() {
			return "Assure Verification";
		}

		@Override
		protected IStatus runJob(Element root, IProgressMonitor monitor) {
			clearProofs();
			disableRerunHandler();

			long start = System.currentTimeMillis();

			if (root instanceof AssureResult){
				AssuranceCase ac = AssureUtilExtension.getEnclosingAssuranceCase(root); 
				String name = ((AssurancePlan)root).getName();
				List<AssureResult> acl = new BasicEList<AssureResult>();
				acl.add(ac);
				drawProofs(acl);
			}

			long stop = System.currentTimeMillis();
			System.out.println("Evaluation time: " + (stop - start) / 1000.0 + "s");

			enableRerunHandler(root);
			System.out.println(EcoreUtil2.getURI(root));

			return Status.OK_STATUS;
		}

		private void enableRerunHandler(final Element root) {
			getWindow().getShell().getDisplay().syncExec(new Runnable() {
				@Override
				public void run() {
					IHandlerService handlerService = getHandlerService();
					rerunActivation = handlerService
							.activateHandler(RERUN_ID, new RerunAssureHandler(root, RunAssureHandler.this));
				}
			});
		}

		private void disableRerunHandler() {
			if (rerunActivation != null) {
				getWindow().getShell().getDisplay().syncExec(new Runnable() {
					@Override
					public void run() {
						IHandlerService handlerService = getHandlerService();
						handlerService.deactivateHandler(rerunActivation);
						rerunActivation = null;
					}
				});
			}
		}

		private IHandlerService getHandlerService() {
			return (IHandlerService) getWindow().getService(IHandlerService.class);
		}


		private void drawProofs(final List<AssureResult> ac) {
			final IWorkbenchPage page = getWindow().getActivePage();

			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					displayView(ac, page);
				}
			});
		}

		private void displayView(final List<AssureResult> ac, final IWorkbenchPage page) {
			try {
				AssureView view = (AssureView) page.showView(AssureView.ID);
				view.setProofs(ac);
				view.setFocus();
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}

		protected void clearProofs() {
			drawProofs(Collections.<AssureResult> emptyList());
		}
	}
