/*
 * Created on July 7, 2004
 *
 * <copyright>
 * Copyright  2004 by Carnegie Mellon University, all rights reserved.
 *
 * Use of the Open Source AADL Tool Environment (OSATE) is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
 * NO WARRANTY
 *
 * ANY INFORMATION, MATERIALS, SERVICES, INTELLECTUAL PROPERTY OR OTHER PROPERTY OR RIGHTS GRANTED OR PROVIDED BY
 * CARNEGIE MELLON UNIVERSITY PURSUANT TO THIS LICENSE (HEREINAFTER THE "DELIVERABLES") ARE ON AN "AS-IS" BASIS.
 * CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, INFORMATIONAL CONTENT,
 * NONINFRINGEMENT, OR ERROR-FREE OPERATION. CARNEGIE MELLON UNIVERSITY SHALL NOT BE LIABLE FOR INDIRECT, SPECIAL OR
 * CONSEQUENTIAL DAMAGES, SUCH AS LOSS OF PROFITS OR INABILITY TO USE SAID INTELLECTUAL PROPERTY, UNDER THIS LICENSE,
 * REGARDLESS OF WHETHER SUCH PARTY WAS AWARE OF THE POSSIBILITY OF SUCH DAMAGES. LICENSEE AGREES THAT IT WILL NOT
 * MAKE ANY WARRANTY ON BEHALF OF CARNEGIE MELLON UNIVERSITY, EXPRESS OR IMPLIED, TO ANY PERSON CONCERNING THE
 * APPLICATION OF OR THE RESULTS TO BE OBTAINED WITH THE DELIVERABLES UNDER THIS LICENSE.
 *
 * Licensee hereby agrees to defend, indemnify, and hold harmless Carnegie Mellon University, its trustees, officers,
 * employees, and agents from all claims or demands made against them (and any related losses, expenses, or
 * attorney's fees) arising out of, or relating to Licensee's and/or its sub licensees' negligent use or willful
 * misuse of or negligent conduct or willful misconduct regarding the Software, facilities, or other rights or
 * assistance granted by Carnegie Mellon University under this License, including, but not limited to, any claims of
 * product liability, personal injury, death, damage to property, or violation of any laws or regulations.
 *
 * Carnegie Mellon University Software Engineering Institute authored documents are sponsored by the U.S. Department
 * of Defense under Contract F19628-00-C-0003. Carnegie Mellon University retains copyrights in all material produced
 * under this contract. The U.S. Government retains a non-exclusive, royalty-free license to publish or reproduce these
 * documents, or allow others to do so, for U.S. Government purposes only pursuant to the copyright license
 * under the contract clause at 252.227.7013.
 *
 * </copyright>
 *
 *
 * @version $Id: ConnectionLevelChecker.java,v 1.13 2010-03-23 19:59:50 jseibel Exp $
 */
package org.osate.analysis.security;


import org.eclipse.core.runtime.IProgressMonitor;
import org.osate.aadl2.AccessConnection;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.Connection;
import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Property;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.modeltraversal.ForAllElement;
import org.osate.aadl2.properties.InvalidModelException;
import org.osate.aadl2.properties.PropertyDoesNotApplyToHolderException;
import org.osate.aadl2.properties.PropertyIsModalException;
import org.osate.xtext.aadl2.properties.util.PropertyUtils;

/**
 * @author phf
 */
public class ConnectionLevelChecker extends ForAllElement {
	/** The property to check.  Must be an aadlinteger-valued property. */
	private final Property property;

	private final LevelComparator levelComp;
	
	private final IProgressMonitor monitor;
	
	
	public ConnectionLevelChecker(final IProgressMonitor monitor,
			final AnalysisErrorReporterManager errMgr, final Property pd,
			final LevelComparator lc) {
		super(PROCESS_TOP_DOWN_COMPONENT_IMPL, errMgr);
		this.monitor = monitor;
		this.property = pd;
		this.levelComp = lc;
	}

	@Override
	public void process(Element obj) {
		if (obj instanceof ComponentImplementation){
			monitor.subTask("Checking connections in " + ((ComponentImplementation) obj).getQualifiedName());
			this.processPostOrderAll(((ComponentImplementation)obj).getAllConnections());
			monitor.worked(1);
		} else
		if (obj instanceof Connection) {
			checkSecurityLevel((Connection) obj);
			if (monitor.isCanceled()) {
				cancelTraversal();
			}
		}
	}

	public void checkSecurityLevel(Connection conn) {
		if (conn instanceof AccessConnection) {
			return;
		}
		
		NamedElement scxt = conn.getAllSrcContextComponent();
		NamedElement dcxt = conn.getAllDstContextComponent();
		if (scxt == null || dcxt == null) return;
		try {
			long slv;
			try {
				slv = PropertyUtils.getIntegerValue(scxt, property, 0);
			} catch (PropertyDoesNotApplyToHolderException e) {
				slv = 0;
			} catch (PropertyIsModalException e) {
				warning(scxt, "Modal property association for property \"" + property.getQualifiedName() + "\"");
				slv = 0;
			}
			
			long dlv;
			try {
				dlv = PropertyUtils.getIntegerValue(dcxt, property, 0);
			} catch (PropertyDoesNotApplyToHolderException e) {
				dlv = 0;
			} catch (PropertyIsModalException e) {
				warning(scxt, "Modal property association for property \"" + property.getQualifiedName() + "\"");
				dlv = 0;
			}
			
			if (!levelComp.compareLevels(slv, dlv)) {
				error(conn, "Level violation for " + property.getQualifiedName() +
						": Source has level " + slv +
						" and destination has level " + dlv);
			}
		} catch (InvalidModelException e) {
			error(e.getElement(), e.getMessage());
		}
	}
}
