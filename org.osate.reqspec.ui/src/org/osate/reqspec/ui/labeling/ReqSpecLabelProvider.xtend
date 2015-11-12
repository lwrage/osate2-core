/*
* generated by Xtext
*/
package org.osate.reqspec.ui.labeling

import com.google.inject.Inject
import org.osate.reqspec.reqSpec.Requirement
import static extension org.osate.alisa.common.util.CommonUtilExtension.*

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class ReqSpecLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
//	def text(Requirement ele) {
//		val z =  (ele.title?:"") 
//		val zzz= ele.rationale
//		val zz = ele.description?.toText(ele)
//		ele.name
//	}

//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
