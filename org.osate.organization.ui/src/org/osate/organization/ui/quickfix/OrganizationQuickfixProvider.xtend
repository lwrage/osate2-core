/*
* generated by Xtext
*/
package org.osate.organization.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.osate.organization.validation.OrganizationValidator
import org.osate.organization.organization.Stakeholder
import static extension org.osate.organization.OrganizationUtil.*

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class OrganizationQuickfixProvider extends org.osate.alisa.common.ui.quickfix.CommonQuickfixProvider {

@Fix(OrganizationValidator::DUPLICATE_STAKEHOLDER)
def void removeStakeholder(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,"Remove stakeholder",
			'''Remove stakeholder '«issue.data.get(0)»' ''',
			"delete.gif",
			[element, context| (element as Stakeholder).containingOrganization.stakeholder.remove(element)]
		)
		}
}
