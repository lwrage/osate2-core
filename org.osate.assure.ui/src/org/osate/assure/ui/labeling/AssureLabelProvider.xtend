/*
* generated by Xtext
*/
package org.osate.assure.ui.labeling

import com.google.inject.Inject
import org.osate.assure.assure.ResultIssue
import org.osate.assure.assure.ResultIssueType
import org.osate.assure.assure.ClaimResult
import static extension org.osate.assure.util.AssureUtilExtension.*
import org.osate.assure.assure.VerificationActivityResult
import org.osate.assure.assure.AssuranceCase
import org.osate.assure.assure.ValidationResult
import org.osate.assure.assure.ThenResult
import org.osate.assure.assure.ElseResult

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class AssureLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
	def text(ClaimResult ele) {
		"Claim: "+ele.constructMessage
		+ ele.assureResultCounts
	}
	
	def text(VerificationActivityResult ele) {
		"Evidence: "+ ele.constructMessage	+ ele.resultState.toTextLabel
		+ ele.assureResultCounts

	}
	
	def text(AssuranceCase ele) {
		"System "+ele.constructMessage		
		+ ele.assureResultCounts
	}
	
	def text(ResultIssue ele) {
		if (ele.name == null) return (ele.target?.constructLabel?:"")+ ele.constructMessage
		ele.name + ": " + ele.constructMessage
	}
	
	def text(ElseResult ele) {
		'else'
	}
	def text(ThenResult ele) {
		'then'
	}

	def image(ResultIssue ele) {
		switch(ele.issueType){
			case ResultIssueType.ERROR: 'error.png'
			case ResultIssueType.SUCCESS: 'valid.png'
			case ResultIssueType.WARNING: 'warning.png'
			case ResultIssueType.INFO: 'info.png'
		}
	}
	
	
	def image(ClaimResult ele) {
		if (ele.isSuccessful) return 'valid.png'//'claimsuccess.png'
		if (ele.noSuccess) return 'error.png'//'claimfail.png'
		if (ele.isZeroCount) return 'info.png'//'validationfail.png'
		return 'questionmark.png'//'claim.png'
	}
	
	def image(VerificationActivityResult ele) {
		if (ele.isSuccessful) return 'valid.png'//'evidencesuccess.png'
		if (ele.noSuccess) return 'error.png'//'evidencefail.png'
		if (ele.isZeroCount) return 'info.png'//'validationfail.png'
		return 'questionmark.png'//'evidence.png'
	}
	
	def image(AssuranceCase ele) {
		if (ele.isSuccessful) return 'valid.png'//'assuresuccess.png'
		if (ele.noSuccess) return 'error.png'//'assurefail.png'
		if (ele.isZeroCount) return 'info.png'//'validationfail.png'
		return 'questionmark.png'//'assure.png'
	}
	
	def image(ValidationResult ele) {
		if (ele.isSuccessful) return 'valid.png'//'validationsuccess.png'
		if (ele.noSuccess) return 'error.png'//'validationfail.png'
		if (ele.isZeroCount) return 'info.png'//'validationfail.png'
		return 'questionmark.png'//'validation.png'
	}
	
	def image(ThenResult ele) {
		if (ele.isSuccessful) return 'valid.png'
		if (ele.noSuccess) return 'error.png'
		if (ele.isZeroCount) return 'info.png'//'validationfail.png'
		return 'questionmark.png'
	}
	
	def image(ElseResult ele) {
		if (ele.isSuccessful) return 'valid.png'
		if (ele.noSuccess) return 'error.png'
		if (ele.isZeroCount) return 'info.png'//'validationfail.png'
		return 'questionmark.png'
	}
	
}
