/*
 * <copyright>
 * Copyright  2006 by Carnegie Mellon University, all rights reserved.
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
 * </copyright>
 */
package org.osate.analysis.resource.budgets.logic;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.ComponentCategory;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.UnitLiteral;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.FeatureCategory;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.SystemInstance;
import org.osate.aadl2.instance.SystemOperationMode;
import org.osate.aadl2.modelsupport.modeltraversal.ForAllElement;
import org.osate.ui.actions.AbstractAaxlAction;
import org.osate.xtext.aadl2.properties.util.GetProperties;

public class DoResourceBudgetLogic {

	private double capacity = 0;
	private double vcapacity = 0;
	private double budgetTotal = 0;

	private int components = 0;
	private int budgetedComponents = 0;
	private int resources = 0;
	private int capacityResources = 0;
	protected AbstractAaxlAction errManager;
	private boolean doDetailedLog = true;
	String prefixSymbol = "*";

	public DoResourceBudgetLogic(AbstractAaxlAction action) {
		this.errManager = action;
	}

	protected AbstractAaxlAction getErrManager() {
		return this.errManager;
	}

	public void analyzeResourceBudget(final SystemInstance si, final SystemOperationMode som) {
		init();
		UnitLiteral kbliteral = GetProperties.getKBUnitLiteral(si);
		UnitLiteral mipsliteral = GetProperties.getMIPSUnitLiteral(si);
		EList proclist = new ForAllElement().processPreOrderComponentInstance(si, ComponentCategory.PROCESSOR);
		logHeader("\n\nDetailed Processor MIPS Capacity Report\n");
		logHeader("Component,Capacity");
		capacity = sumCapacity(proclist, ResourceKind.MIPS, "processor", mipsliteral);
		detailedLog(null, capacity, mipsliteral);
		EList vproclist = new ForAllElement().processPreOrderComponentInstance(si, ComponentCategory.VIRTUAL_PROCESSOR);
		if (!vproclist.isEmpty()) {
			logHeader("\n\nDetailed Virtual Processor MIPS Capacity Report\n");
			logHeader("Component,Capacity");
			vcapacity = sumVPMIPSBudget(vproclist, mipsliteral);
			detailedLog(null, vcapacity, mipsliteral);
		}
		logHeader("\n\nDetailed MIPS Budget Report\n");
		logHeader("Component,Budget,Actual,Notes");
		budgetTotal = sumBudgets(si, ResourceKind.MIPS, mipsliteral, som, "");
		if (budgetTotal >= 0) {
			detailedLog(null, budgetTotal, mipsliteral);
			report(si, "MIPS", mipsliteral, som);
		}

		init();
		EList memlist = new ForAllElement().processPreOrderComponentInstance(si, ComponentCategory.MEMORY);
		logHeader("\n\nDetailed RAM Capacity Report\n");
		logHeader("Component,Capacity");
		capacity = sumCapacity(memlist, ResourceKind.RAM, "Memory", kbliteral);
		detailedLog(null, capacity, kbliteral);
		logHeader("\n\nDetailed RAM Budget Report\n");
		logHeader("Component,Budget,Actual,Notes");
		budgetTotal = sumBudgets(si, ResourceKind.RAM, kbliteral, som, "");
		if (budgetTotal >= 0) {
			detailedLog(null, budgetTotal, kbliteral);
			report(si, "RAM", kbliteral, som);
		}

		init();
		memlist = new ForAllElement().processPreOrderComponentInstance(si, ComponentCategory.MEMORY);
		logHeader("\n\nDetailed ROM Capacity Report\n");
		logHeader("Component,Capacity");
		capacity = sumCapacity(memlist, ResourceKind.ROM, "ROM", kbliteral);
		detailedLog(null, capacity, kbliteral);
		logHeader("\n\nDetailed ROM Budget Report\n");
		logHeader("Component,Budget,Actual,Notes");
		budgetTotal = sumBudgets(si, ResourceKind.ROM, kbliteral, som, "");
		if (budgetTotal >= 0) {
			detailedLog(null, budgetTotal, kbliteral);
			report(si, "ROM", kbliteral, som);
		}
	}

	private void init() {
		capacity = 0;
		components = 0;
		budgetedComponents = 0;
		resources = 0;
		capacityResources = 0;
		budgetTotal = 0;
	}

	protected enum ResourceKind {
		MIPS, RAM, ROM
	};

	private double getCapacity(ComponentInstance ne, ResourceKind kind) {
		switch (kind) {
		case MIPS:
			if (ne.getCategory().equals(ComponentCategory.PROCESSOR))
				return GetProperties.getProcessorMIPS(ne);
			if (ne.getCategory().equals(ComponentCategory.VIRTUAL_PROCESSOR))
				return GetProperties.getMIPSBudgetInMIPS(ne);
		case RAM:
			return GetProperties.getRAMCapacityInKB(ne, 0.0);
		case ROM:
			return GetProperties.getROMCapacityInKB(ne, 0.0);
		}
		return 0.0;
	}

	private double getBudget(NamedElement ne, ResourceKind kind) {
		switch (kind) {
		case MIPS:
			return GetProperties.getMIPSBudgetInMIPS(ne, 0.0);
		case RAM:
			return GetProperties.getRAMBudgetInKB(ne, 0.0);
		case ROM:
			return GetProperties.getROMBudgetInKB(ne, 0.0);
		}
		return 0.0;
	}

	private double sumVPMIPSBudget(EList ilist, UnitLiteral unit) {
		double total = 0.0;
		for (Iterator it = ilist.iterator(); it.hasNext();) {
			ComponentInstance io = (ComponentInstance) it.next();
			double budget = GetProperties.getMIPSBudgetInMIPS(io);
			total += budget;
			detailedLog(io, budget, unit);
		}
		return total;
	}

	private double sumCapacity(EList ilist, ResourceKind rk, String resourceName, UnitLiteral unit) {
		double total = 0.0;
		for (Iterator it = ilist.iterator(); it.hasNext();) {
			ComponentInstance io = (ComponentInstance) it.next();
			double capacity = getCapacity(io, rk);
			total += capacity;
			detailedLog(io, capacity, unit);
			resources++;
			if (capacity > 0)
				capacityResources++;
		}
		return total;
	}

	/**
	 * calculate the budget of components with budgets, i.e., application
	 * components and devices For application components they are required,
	 * while for devices they are optional
	 * 
	 * @param ci component instance whose subtree is to be added up
	 * @param rk Property Definition of property to be added
	 * @param unit Unit in which the property value should be retrieved
	 * @param somName String name of SOM (used in reporting)
	 * @return double total, zero, if no budget, -1 if hardware only in
	 *         substructure
	 */
	protected double sumBudgets(ComponentInstance ci, ResourceKind rk, UnitLiteral unit, final SystemOperationMode som,
			String prefix) {
		double subtotal = 0.0;
		EList subcis = ci.getComponentInstances();
		boolean HWOnly = false;
		boolean isSystemInstance = ci instanceof SystemInstance;
		int subbudgetcount = 0;
		int subcount = 0;
		if (subcis.size() == 0) {
			if (isHardware(ci)) {
				return -1;
			}
		} else {
			// track HWonly if subcomponents
			HWOnly = true;
		}
		for (Iterator it = subcis.iterator(); it.hasNext();) {
			ComponentInstance subci = (ComponentInstance) it.next();
			double subresult = sumBudgets(subci, rk, unit, som, isSystemInstance ? "" : prefix + prefixSymbol);
			if (subresult >= 0) {
				HWOnly = false;
				subtotal += subresult;
				if (subci.getCategory() == ComponentCategory.DEVICE) {
					if (subresult > 0) {
						// only count device if it has a budget
						subcount++;
						subbudgetcount++;
					}
				} else {
					// track how many non-devices and whether they have a budget
					subcount++;
					if (subresult > 0) {
						subbudgetcount++;
					}
				}
			}
		}
		if (HWOnly)
			return -1;
		double budget = getBudget(ci, rk);
		String resourceName = ci.getCategory().getName();
		String notes = "";
		if (rk == ResourceKind.MIPS && ci.getCategory() == ComponentCategory.THREAD) {
			subtotal = GetProperties.getThreadExecutioninMIPS(ci);
		}
		components = components + subcount;
		budgetedComponents = budgetedComponents + subbudgetcount;
		if (budget > 0 && subtotal > budget) {
			notes = notes + ",Error: subtotal exceeds budget " + budget + " by " + (subtotal - budget) + " "
					+ unit.getName();
		}

		if (subtotal > 0 && subtotal < budget) {
			notes = notes
					+ ", "
					+ String.format(resourceName + " " + ci.getInstanceObjectPath() + " total %.1f " + unit.getName()
							+ " below budget %.1f " + unit.getName() + " (%.1f %% slack)", subtotal, budget,
							(budget - subtotal) / budget * 100);
		}
		if (!isSystemInstance)
			detailedLog(prefix, ci, budget, subtotal, resourceName, unit, notes);
		return subtotal == 0 ? budget : subtotal;
	}

	protected boolean isHardware(ComponentInstance ci) {
		ComponentCategory cat = ci.getCategory();
		if (cat == ComponentCategory.BUS || cat == ComponentCategory.PROCESSOR
				|| cat == ComponentCategory.VIRTUAL_PROCESSOR || cat == ComponentCategory.MEMORY)
			return true;
		if (cat == ComponentCategory.SYSTEM || cat == ComponentCategory.DEVICE) {
			EList el = ci.getFeatureInstances();
			for (Iterator it = el.iterator(); it.hasNext();) {
				FeatureInstance fi = (FeatureInstance) it.next();
				if (fi.getCategory() != FeatureCategory.BUS_ACCESS) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	private void report(SystemInstance si, String resourceName, UnitLiteral unit, final SystemOperationMode som) {
		String somName = "default";
		if (som != null) {
			somName = som.getName();
		}
		if (budgetTotal < 0) {
			budgetTotal = 0;
		}
		errManager.infoSummaryReportOnly(si, som, "Summary\n");

		String modelStats = resourceName + " capacity " + GetProperties.toStringScaled(capacity, unit) + " : "
				+ resourceName + " budget " + GetProperties.toStringScaled(budgetTotal, unit);
		if (budgetTotal > capacity) {
			modelStats = "System " + si.getName() + " over capacity: " + modelStats;
			errManager.errorSummary(si, somName, modelStats);
		} else
			errManager.infoSummary(si, somName, modelStats);
		modelStats = capacityResources + " out of " + resources + " with " + resourceName + " capacity";
		if (capacityResources < resources) {
			errManager.warningSummary(si, somName, modelStats);
		} else {
			errManager.infoSummary(si, somName, modelStats);
		}
		modelStats = budgetedComponents + " out of " + components + " with " + resourceName + " budget";
		if (budgetedComponents < components) {
			errManager.warningSummary(si, somName, modelStats);
		} else {
			errManager.infoSummary(si, somName, modelStats);
		}
	}

	protected void logHeader(String msg) {
		errManager.logInfo(msg);
	}

	protected void detailedLog(String prefix, ComponentInstance ci, double budget, double actual, String resourceName,
			UnitLiteral unit, String msg) {
		if (doDetailedLog) {
			String budgetmsg = prefix + GetProperties.toStringScaled(budget, unit) + ",";
			String actualmsg = prefix + GetProperties.toStringScaled(actual, unit) + ",";
			errManager.logInfo(prefix + ci.getCategory().getName() + " " + ci.getComponentInstancePath() + ", "
					+ budgetmsg + actualmsg + msg);
		}
	}

	protected void detailedLog(ComponentInstance ci, double budget, UnitLiteral unit) {
		if (doDetailedLog) {
			String budgetmsg = GetProperties.toStringScaled(budget, unit) + ",";
			String front = ci == null ? "Total" : ci.getCategory().getName() + " " + ci.getComponentInstancePath();
			errManager.logInfo(front + ", " + budgetmsg);
		}
	}

}
