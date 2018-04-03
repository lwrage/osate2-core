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

package org.osate.verify.ui.outline

import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.emf.ecore.EObject
import org.osate.verify.verify.VerificationActivity
import static extension org.osate.alisa.common.util.CommonUtilExtension.*
import static extension org.osate.reqspec.util.ReqSpecUtilExtension.*
import static extension org.osate.verify.util.VerifyUtilExtension.*
import org.osate.reqspec.reqSpec.Requirement
import org.osate.verify.verify.Claim

class VerifyEObjectHoverProvider extends DefaultEObjectHoverProvider {
		override getHoverInfoAsHtml (EObject o){ 
		switch (o){
			VerificationActivity: {
				val Requirement req = o.containingClaim.requirement
				return reqText(req)
				}
			Claim: {
				val Requirement req = o.requirement
				return reqText(req)
				}
		}
		return super.getHoverInfoAsHtml(o)
	}
	
	def reqText(Requirement req){
				val z =  (req.title?:"") 
				var zz = (req.description?.toText(req.targetClassifier))?:""
				if (zz.length > 0) zz = ": " + zz
				val res = "Requirement "+req.name+": "+ z + zz
			return res
	}
	
}