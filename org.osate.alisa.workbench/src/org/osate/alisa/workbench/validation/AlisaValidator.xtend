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
package org.osate.alisa.workbench.validation

import com.google.inject.Inject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType
import org.osate.alisa.workbench.alisa.AlisaPackage
import org.osate.alisa.workbench.alisa.AssurancePlan
import org.osate.verify.util.IVerifyGlobalReferenceFinder

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class AlisaValidator extends AbstractAlisaValidator {

public static val ASSURANCE_PLAN_OWN_MISSING_VERIFICATION_PLANS = 'org.osate.alisa.workbench.validation.assurance.plan.own.missing.verification.plans'
public static val ASSURANCE_PLAN_OWN_INVALID_VERIFICATION_PLANS = 'org.osate.alisa.workbench.validation.assurance.plan.own.invalid.verification.plans'

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	@Inject extension IVerifyGlobalReferenceFinder referenceFinder

	@Check(CheckType.NORMAL)
	def void checkAssurancePlanNormal(AssurancePlan assurancePlan) {
		checkAssurancePlanOwnOmissions(assurancePlan)
	}
	@Check(CheckType.FAST)
	def void checkAssurancePlanFast(AssurancePlan assurancePlan) {
		checkAssurancePlanOwnForInvalid(assurancePlan) 
	}

	def void checkAssurancePlanOwnOmissions(AssurancePlan assurancePlan) {
		val res = referenceFinder.getVerificationPlans(assurancePlan.target, assurancePlan).filter([avp | !assurancePlan.assureOwn.contains(avp)])		
		if (res.size > 0){
			val String[] namesAndURI = newArrayOfSize(res.length * 2)
			res.forEach([vp, counter |
				namesAndURI.set(counter * 2, vp.name)
				namesAndURI.set((counter * 2) + 1, EcoreUtil.getURI(vp).toString())
			])
			warning("Assurance Plan '" + assurancePlan.name + "' missing Verification Plans in 'assure own' statement '",
				assurancePlan, AlisaPackage.Literals.ASSURANCE_PLAN__NAME, ASSURANCE_PLAN_OWN_MISSING_VERIFICATION_PLANS, namesAndURI)
		}
	}

	def void checkAssurancePlanOwnForInvalid(AssurancePlan assurancePlan) {
		val res = assurancePlan.assureOwn.filter([avp |
			!referenceFinder.getVerificationPlans(assurancePlan.target, assurancePlan).toList.contains(avp)
		])
		if (res.size > 0){
			res.forEach([vp, counter |
				val idx = assurancePlan.assureOwn.indexed.filter([value == vp]).head.key
				error("Verification Plan '" + vp.name  + "' is not valid for Assurance Plan '" +assurancePlan.name,
						assurancePlan, AlisaPackage.Literals.ASSURANCE_PLAN__ASSURE_OWN, idx, 
						ASSURANCE_PLAN_OWN_INVALID_VERIFICATION_PLANS, vp.name, EcoreUtil.getURI(vp).toString())
				
			])
		}
	}

}
