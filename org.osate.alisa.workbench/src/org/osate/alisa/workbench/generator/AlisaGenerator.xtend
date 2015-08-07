/*
 * generated by Xtext
 */
package org.osate.alisa.workbench.generator

import com.google.inject.Inject
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.UniqueEList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.osate.aadl2.ComponentClassifier
import org.osate.aadl2.ComponentImplementation
import org.osate.aadl2.ComponentType
import org.osate.alisa.common.scoping.CommonGlobalScopeProvider
import org.osate.alisa.workbench.alisa.AlisaWorkArea
import org.osate.alisa.workbench.alisa.AssurancePlan
import org.osate.alisa.workbench.alisa.AssuranceTask
import org.osate.categories.categories.RequirementCategory
import org.osate.categories.categories.SelectionCategory
import org.osate.categories.categories.VerificationCategory
import org.osate.verify.verify.AllExpr
import org.osate.verify.verify.ArgumentExpr
import org.osate.verify.verify.Claim
import org.osate.verify.verify.ElseExpr
import org.osate.verify.verify.RefExpr
import org.osate.verify.verify.ThenExpr
import org.osate.verify.verify.VerificationActivity
import org.osate.verify.verify.VerificationCondition
import org.osate.verify.verify.VerificationPlan
import org.osate.verify.verify.VerificationPrecondition
import org.osate.verify.verify.VerificationValidation
import org.osate.verify.verify.VerifyPackage
import org.osate.verify.verify.WhenExpr

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.osate.alisa.common.util.CommonUtilExtension.*
import org.osate.alisa.workbench.util.IAlisaReferenceFinder

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AlisaGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val workarea = resource.contents.get(0) as AlisaWorkArea
		workarea.cases.forEach [ mycase |
			switch (mycase){
			AssurancePlan: fsa.generateFile('''«mycase.name».assure''', generateCase(mycase))
			AssuranceTask: fsa.generateFile('''«mycase.name».assure''', generateAssuranceTask(mycase))
			}
		]
	}

	@Inject extension IQualifiedNameProvider qualifiedNameProvider
	
	var EList<SelectionCategory> selectionFilter = null
	var EList<RequirementCategory> requirementFilter = null
	var EList<VerificationCategory> verificationFilter = null
	
	def generateAssuranceTask(AssuranceTask at){
		selectionFilter = at.selectionFilter
		requirementFilter = at.requirementFilter
		verificationFilter = at.verificationFilter
		at.assurancePlan?.generateCase
	}

	def generateCase(AssurancePlan acp) {
		acp.target.generate(acp, false)
	}

	def generateSystemEvidence(ComponentClassifier cc, AssurancePlan acp) {
		cc.generate(acp,true)
	}

@Inject extension IAlisaReferenceFinder referenceFinder


	def CharSequence generate(ComponentClassifier cc, AssurancePlan acp, boolean systemEvidence) {
		val myplans = cc.getVerificationPlans();
		'''	
			«IF !myplans.empty»
			«IF !systemEvidence»
				evidence «acp.name» for «acp.name»
			«ELSE»
				evidence «cc.name» for system «cc.getQualifiedName»
			«ENDIF»
				[
					tbdcount 1
					«FOR myplan : myplans»
						«FOR claim : myplan.claim»
						«IF claim.evaluateRequirementFilter»
							«claim.generate()»
						«ENDIF»
						«ENDFOR»
					«ENDFOR»
					«FOR subcl : cc.subcomponentClassifiers»
						«subcl.filterplans(acp)»
					«ENDFOR»
				]
			«ENDIF»
		'''
	}
	
	def CharSequence filterplans(ComponentClassifier cc, AssurancePlan parentacp){
		if (cc instanceof ComponentType || cc.skipAssuranceplans(parentacp)) return ''''''
		val subacp = cc.getSubsystemAssuranceplan(parentacp)
		if (subacp != null){
			subacp.generateCase
		} else {
			cc.generateSystemEvidence(parentacp)
		}
	}
	
	def boolean skipAssuranceplans(ComponentClassifier cc, AssurancePlan parentacp){
		val assumes = parentacp.assumeSubsystems
		for (cl: assumes){
			if (cc.isSameorExtends(cl)) return true;
		}
		return false
	}
	
	def AssurancePlan getSubsystemAssuranceplan(ComponentClassifier cc, AssurancePlan parentacp){
		val assure = parentacp.assurePlans
		for (ap: assure){
			if (cc.isSameorExtends(ap.target)) return ap;
		}
		return null
	}

	def CharSequence generate(Claim claim) {
		'''
			claim «claim.requirement.fullyQualifiedName»
			[
				tbdcount 1
			    «FOR subclaim : claim?.subclaim»
				«subclaim.generate()»
				«ENDFOR»
				«claim.assert.generate»
				]
			'''
	}

	def CharSequence generate(ArgumentExpr expr) {
		switch expr {
			AllExpr: expr.doGenerate
			ThenExpr: expr.doGenerate
			ElseExpr: expr.doGenerate
			WhenExpr: expr.doGenerate
			RefExpr: if(expr.verification.evaluateVerificationFilter) expr.doGenerate
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
		'''
			then
				«expr.left.generate»
			do
				«expr.successor.generate»
			[
				tbdcount 1
			]
		'''
	}

	def doGenerate(ElseExpr expr) {
		'''
			else
				«expr.left.generate»
			other
				«expr.other.generate»
			«IF expr.fail != null»
			fail "«expr.fail.generate»"
			«ENDIF»
			«IF expr.timeout != null»
			timeout "«expr.timeout.generate»"
			«ENDIF»
			[
				tbdcount 1
			]
		'''
	}

	def doGenerate(WhenExpr expr) {
		'''
			«IF expr.evaluateSelectionCondition»
				«expr.verification.generate»
			«ENDIF»
		'''
	}

	def doGenerate(RefExpr expr) {
		'''
			verification «expr.verification.fullyQualifiedName»
			[
				executionstate todo
				resultstate tbd
				tbdcount 1
				«IF expr.verification?.method?.condition != null»
					«expr.verification?.method?.condition.generate»
				«ENDIF»
			]
		'''
	}

	def generate(VerificationCondition vc) {
		'''
			«vc.keyword» «vc.fullyQualifiedName»
			[
				executionstate todo
				resultstate tbd
				tbdcount 1
			]
		'''
	}

	def evaluateSelectionCondition(WhenExpr expr) {
		val selection = expr.condition
		if (selectionFilter == null || selectionFilter.empty || selection.empty) return true
		val intersect = selection.copyAll
		intersect.retainAll(selectionFilter) 
		!intersect.isEmpty
	}

	def evaluateRequirementFilter(Claim claim) {
		val req = claim.requirement.category
		if (requirementFilter == null || requirementFilter.empty || req.empty) return true
		val intersect = req.copyAll
		intersect.retainAll(requirementFilter) 
		!intersect.isEmpty
	}

	def evaluateVerificationFilter(VerificationActivity va) {
		val vcs = va.method.category
		if (verificationFilter == null || verificationFilter.empty || vcs.empty) return true
		val intersect = vcs.copyAll
		intersect.retainAll(requirementFilter) 
		!intersect.isEmpty
	}

	def keyword(VerificationCondition vc) {
		switch vc {
			VerificationValidation: '''validation'''
			VerificationPrecondition: '''precondition'''
		}
	}
	
	def subcomponentClassifiers(ComponentClassifier cl){
		if (cl instanceof ComponentImplementation){
			val List<ComponentClassifier> result = new UniqueEList<ComponentClassifier>()
			result += cl.allSubcomponents.map[sub|sub.classifier]
			result
		} else {
			Collections.emptyList
		}
	}
	

}
