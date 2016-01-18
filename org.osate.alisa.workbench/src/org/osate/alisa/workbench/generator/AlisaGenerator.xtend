/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */

/*
 * generated by Xtext
 */
package org.osate.alisa.workbench.generator

import com.google.inject.Inject
import java.util.Collections
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.osate.aadl2.ComponentClassifier
import org.osate.aadl2.ComponentImplementation
import org.osate.aadl2.ComponentType
import org.osate.aadl2.Subcomponent
import org.osate.aadl2.util.Aadl2Util
import org.osate.alisa.workbench.alisa.AssuranceCase
import org.osate.alisa.workbench.alisa.AssuranceTask
import org.osate.alisa.workbench.util.IAlisaGlobalReferenceFinder
import org.osate.categories.categories.CategoryFilter
import org.osate.reqspec.reqSpec.Requirement
import org.osate.reqspec.reqSpec.Requirements
import org.osate.reqspec.reqSpec.SystemRequirements
import org.osate.verify.util.IVerifyGlobalReferenceFinder
import org.osate.verify.verify.AllExpr
import org.osate.verify.verify.ArgumentExpr
import org.osate.verify.verify.Claim
import org.osate.verify.verify.ElseExpr
import org.osate.verify.verify.RefExpr
import org.osate.verify.verify.ThenExpr
import org.osate.verify.verify.VerificationActivity
import org.osate.verify.verify.VerificationPlan

import static extension org.osate.reqspec.util.ReqSpecUtilExtension.*
import static extension org.osate.verify.util.VerifyUtilExtension.*
import static extension org.osate.alisa.workbench.util.AlisaWorkbenchUtilExtension.*
import static extension org.osate.alisa.common.util.CommonUtilExtension.*
import org.osate.alisa.workbench.alisa.AssurancePlan

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AlisaGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val mycase = resource.contents.get(0) as AssuranceCase
		if (mycase != null) {
			fsa.generateFile('''«mycase.name».assure''', generateFullAssuranceCase(mycase))
			mycase.tasks.forEach [ task |
				fsa.generateFile('''«task.name».assure''', generateAssuranceTask(task as AssuranceTask))
			]
		}
	}

	@Inject extension IQualifiedNameProvider qualifiedNameProvider

	var CategoryFilter filter = null

	def generateAssuranceTask(AssuranceTask at) {
		filter = at
		globalPlans = new BasicEList()
		globalClaims = new BasicEList()
		val res = at.assuranceCase.generateAssuranceCase
		if (res.length == 0) {
			at.emptyCase("\"Empty case due to unresolved target reference or empty filter result\"")
		} else {
			res
		}
	}

	var EList<VerificationPlan> globalPlans

	var EList<Claim> globalClaims

	def generateFullAssuranceCase(AssuranceCase acp) {
		filter = null
		globalPlans = new BasicEList()
		globalClaims = new BasicEList()
		acp.generateAssuranceCase
	}

	def generateAssuranceCase(AssuranceCase acp) {
		'''
			case «acp.name»
			[
				tbdcount 0
				«FOR ap : acp.assurancePlans»
					«ap.generateAssurancePlan»
				«ENDFOR»
			]
		'''
	}

	def emptyCase(AssuranceTask at, String msg) {
		'''
			case  «at.name»
			[
				tbdcount 0
				message «msg»
			]
		'''
	}

	@Inject extension IVerifyGlobalReferenceFinder referenceFinder

	def CharSequence generateAssurancePlan(AssurancePlan acp) {
		var Iterable<VerificationPlan> myplans = Collections.EMPTY_LIST
		var ComponentClassifier cc
		if (acp != null) {
			myplans = acp.assure
			cc = acp.target
			if (myplans.empty && !Aadl2Util.isNull(cc)) {
				myplans = cc.getVerificationPlans(acp)
			}
		}
		val APparts = doAssurancePlanParts(acp, myplans, cc)
		if(APparts.length == 0) return ''''''
		'''	
			model «acp.assuranceCase.name».«acp.name»
			for «acp.target.getQualifiedName»
				[
				tbdcount 0
				«APparts»
				]
		'''
	}

	/**
	 * sub: system of interest as subcomponent of another system
	 */
	def CharSequence generateSubsystemVerificationPlansGlobals(Subcomponent sub,AssurancePlan mp) {
		var Iterable<VerificationPlan> myplans = Collections.EMPTY_LIST
		var ComponentClassifier cc
		if (!Aadl2Util.isNull(sub)) {
			cc = sub.allClassifier
			if (!Aadl2Util.isNull(cc)) {
				myplans = cc.getVerificationPlans(mp);
			}
		}
		val APparts = doAssurancePlanParts(mp, myplans, cc)
		if(APparts.length == 0) return ''''''
		'''	
			subsystem «sub.name» 
			for «sub.name»
			[
			tbdcount 0
			«APparts»
			]
		'''
	}
	
	/**
	 * sub: system of interest as subcomponent of another system only for global requirements from enclosing case
	 */
	def CharSequence generateSubsystemGlobalOnly(Subcomponent sub,AssurancePlan mp) {
		var Iterable<VerificationPlan> myplans = Collections.EMPTY_LIST
		val APparts = doAssurancePlanParts(mp, myplans, sub.allClassifier)
		if(APparts.length == 0) return ''''''
		'''	
			subsystem «sub.name» 
			for «sub.name»
			[
			tbdcount 0
			«APparts»
			]
		'''
	}

	/**
	 * generate myplans verification plan claims.
	 * process include to identify and generate locally used and recursively used global requirements.
	 * myplans:  Myplans may be empty list.
	 * cc: component classifier for which we identify include requirements 
	 * 
	 */
	def doAssurancePlanParts(AssurancePlan assurancePlan, Iterable<VerificationPlan> vplans, ComponentClassifier cc) {
		// first collect any global and self includes
		val selfPlans = new BasicEList()
		val selfClaims = new BasicEList()
		val globalPlansTop = globalPlans.size
		val globalClaimsTop = globalClaims.size
		for (vplan : vplans) {
			val reqs = vplan.requirements
			if (reqs instanceof SystemRequirements) {
				val includes = reqs.include
				for (incl : includes) {
					if (incl.include instanceof Requirements) {
						if (incl.componentCategory.matchingCategory(cc.category)) {
							val plans = referenceFinder.
								getAllVerificationPlansForRequirements(incl.include as Requirements, vplan)
							if (incl.self) {
								selfPlans.addAll(plans)
							} else {
								globalPlans.addAll(plans)
							}
						}
					} else {
						val greq = incl.include as Requirement
						val greqs = greq.containingRequirements
						val plans = referenceFinder.getAllVerificationPlansForRequirements(greqs, vplan)
						for (vp : plans) {
							for (claim : vp.claim) {
								if (claim.requirement.name.equals(greq.name)) {
									if (incl.self) {
										selfClaims.add(claim)
									} else {
										globalClaims.add(claim)
									}
								}
							}
						}
					}
				}
			}
		}
		val result = 
		'''
			«FOR vplan : vplans»
				«FOR claim : vplan.claim»
					«IF claim.evaluateRequirementFilter(filter)»
					«claim.generate()»
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			«FOR vplan : selfPlans»
				«FOR claim : vplan.claim.filter[cl|cl.requirement?.componentCategory.matchingCategory(cc.category)]»
				«IF claim.evaluateRequirementFilter(filter)»
				«claim.generateAll(cc)»
				«ENDIF»
				«ENDFOR»
			«ENDFOR»
				«FOR claim : selfClaims.filter[cl|cl.requirement?.componentCategory.matchingCategory(cc.category)]»
				«IF claim.evaluateRequirementFilter(filter)»
				«claim.generateAll(cc)»
				«ENDIF»
				«ENDFOR»
			«FOR vplan : globalPlans»
				«FOR claim : vplan.claim.filter[cl|cl.requirement?.componentCategory.matchingCategory(cc.category)]»
					«IF claim.evaluateRequirementFilter(filter)»
					«claim.generateAll(cc)»
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			«FOR claim : globalClaims.filter[cl|cl.requirement?.componentCategory.matchingCategory(cc.category)]»
				«IF claim.evaluateRequirementFilter(filter)»
				«claim.generateAll(cc)»
				«ENDIF»
			«ENDFOR»
			«IF cc instanceof ComponentImplementation»
				«FOR subc : cc.allSubcomponents»
					«subc.generateSubsystemPlans(assurancePlan)»
				«ENDFOR»
			«ENDIF»
		'''
		var plansize = globalPlans.size
		while (plansize > globalPlansTop) {
			globalClaims.remove(plansize - 1)
			plansize = plansize - 1
		}
		var claimsize = globalClaims.size
		while (claimsize > globalClaimsTop) {
			globalClaims.remove(claimsize - 1)
			claimsize = claimsize - 1
		}
		return result
	}

	@Inject IAlisaGlobalReferenceFinder refFinder

	def CharSequence generateSubsystemPlans(Subcomponent subc, AssurancePlan parentap) {
		val cc = subc.allClassifier
		if(subc.isAssumeSubsystem(parentap)) return subc.generateSubsystemGlobalOnly(parentap)
		switch (cc) {
			ComponentType:
				generateSubsystemGlobalOnly(subc,parentap)
			ComponentImplementation: {
				val subacs = refFinder.getAssuranceCases(cc)
				if (subacs.empty) {
					subc.generateSubsystemVerificationPlansGlobals(parentap)
				} else {
				'''
				«FOR subac : subacs»
				«subac.generateAssuranceCase»
				«ENDFOR»
				'''	
				}
			}
		}
	}

	def boolean isAssumeSubsystem(Subcomponent subc, AssurancePlan parentacp) {
		if(parentacp == null) return false
		if(parentacp.assumeAll) return true
		val assumes = parentacp.assumeSubsystems
		for (sub : assumes) {
			if(sub.name.equalsIgnoreCase(subc.name)) return true;
		}
		return false
	}


	def CharSequence generateAll(Claim claim, ComponentClassifier cc){
		'''
		«IF cc instanceof ComponentImplementation && claim.requirement.connections»
		«FOR conn : (cc as ComponentImplementation).crossConnections»
		«claim.generate(conn.name)»
		«ENDFOR»
		«ELSE»
		«claim.generate()»
		«ENDIF»
		'''		
	}

	def CharSequence generate(Claim claim) {
		
		claim.generate(claim.requirement.targetElement?.name)
	}


	def CharSequence generate(Claim claim, String forTargetElement) {
		val claimvas = doGenerateVA(claim)
		val subclaims = if(claim.subclaim != null) doGenerateSubclaims(claim) else ''''''
		val claimassert = if(claim.assert != null) claim.assert.generate else ''''''
		if(claimvas.length == 0 && subclaims.length == 0 && claimassert.length == 0) return ''''''
		'''
		claim «claim.constructClaimReference»
		[
			tbdcount 0
			«IF forTargetElement != null»
			for «forTargetElement»
			«ENDIF»
			«IF claim.assert != null»
			«claimassert»
			«ELSE»
			«claimvas»
			«ENDIF»
		]
		'''
	}

	def doGenerateVA(Claim claim) {
		'''
			«FOR va : claim.activities»
				«va.doGenerate»
			«ENDFOR»
		'''
	}

	def doGenerateSubclaims(Claim claim) {
		'''
			«FOR subclaim : claim?.subclaim»
				«subclaim.generate(claim.requirement.targetElement?.name)»
			«ENDFOR»
		'''
	}

	def doGenerate(VerificationActivity va) {
		'''
			«IF va.evaluateVerificationActivityFilter(filter) && va.evaluateVerificationMethodFilter(filter) »
				verification «va.constructVerificationActivityReference»
				[
					executionstate todo
					resultstate tbd
					tbdcount 0
					«IF va.method?.precondition != null»
						precondition «va.method.fullyQualifiedName»
						[
							executionstate todo
							resultstate tbd
							tbdcount 0
						]
					«ENDIF»
					«IF va.method?.validation != null»
						validation «va.method.fullyQualifiedName»
						[
							executionstate todo
							resultstate tbd
							tbdcount 0
						]
					«ENDIF»
				]
			«ENDIF»
		'''
	}

	def CharSequence generate(ArgumentExpr expr) {
		switch expr {
			AllExpr: expr.doGenerate
			ThenExpr: expr.doGenerate
			ElseExpr: expr.doGenerate
			RefExpr: expr.doGenerate
		}
	}

	def doGenerate(AllExpr expr) {
		'''
			«FOR subexpr : expr.elements»
				«subexpr.generate»
			«ENDFOR»
		'''
	}

	def doGenerate(ThenExpr expr) {
		val leftresult = expr.left.generate
		val successorresult = expr.successor.generate
		if(leftresult.length == 0) return ''''''
		if(successorresult == 0) return leftresult
		'''
			then
				«leftresult»
			do
				«successorresult»
			[
				tbdcount 0
			]
		'''
	}

	def doGenerate(ElseExpr expr) {
		val leftresult = expr.left.generate
		val errorresult = expr.error.generate
		val failresult = expr.fail?.generate ?: ''''''
		val timeoutresult = expr.timeout?.generate ?: ''''''
		if(leftresult.length == 0) return ''''''
		if(errorresult == 0 && failresult.length == 0 && timeoutresult.length == 0) return leftresult
		'''
			else
				«expr.left.generate»
			«IF errorresult.length > 0»
				error 
					«errorresult»
			«ENDIF»
			«IF expr.fail != null»
				fail "«expr.fail.generate»"
			«ENDIF»
			«IF expr.timeout != null»
				timeout "«expr.timeout.generate»"
			«ENDIF»
			[
				tbdcount 0
			]
		'''
	}

	def doGenerate(RefExpr expr) {
		if (expr.verification != null)
			expr.verification.doGenerate
		else ''''''
	}

}
