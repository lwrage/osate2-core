/*
* generated by Xtext
*/
package org.osate.verify.ui.labeling

import com.google.inject.Inject
import org.osate.verify.verify.AllExpr
import org.osate.verify.verify.RefExpr
import org.osate.verify.verify.ElseExpr
import org.osate.verify.verify.ThenExpr

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class VerifyLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
	
	def text(ThenExpr ele) {
		'then'
	}
	def text(ElseExpr ele) {
		'else'
	}
	def text(AllExpr ele) {
		'all'
	}
	def text(RefExpr ele){
		ele.verification.name
	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
