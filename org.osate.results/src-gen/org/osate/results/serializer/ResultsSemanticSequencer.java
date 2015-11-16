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
package org.osate.results.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.osate.results.results.IssuesReport;
import org.osate.results.results.ReportIssue;
import org.osate.results.results.ResultContributor;
import org.osate.results.results.ResultData;
import org.osate.results.results.ResultReport;
import org.osate.results.results.ResultReportCollection;
import org.osate.results.results.ResultsPackage;
import org.osate.results.services.ResultsGrammarAccess;

@SuppressWarnings("all")
public class ResultsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ResultsGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ResultsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ResultsPackage.ISSUES_REPORT:
				sequence_IssuesReport(context, (IssuesReport) semanticObject); 
				return; 
			case ResultsPackage.REPORT_ISSUE:
				sequence_ReportIssue(context, (ReportIssue) semanticObject); 
				return; 
			case ResultsPackage.RESULT_CONTRIBUTOR:
				sequence_ResultContributor(context, (ResultContributor) semanticObject); 
				return; 
			case ResultsPackage.RESULT_DATA:
				sequence_ResultData(context, (ResultData) semanticObject); 
				return; 
			case ResultsPackage.RESULT_REPORT:
				sequence_ResultReport(context, (ResultReport) semanticObject); 
				return; 
			case ResultsPackage.RESULT_REPORT_COLLECTION:
				sequence_ResultReportCollection(context, (ResultReportCollection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING? target=[EObject|URIID] decription=STRING? issues+=ReportIssue*)
	 */
	protected void sequence_IssuesReport(EObject context, IssuesReport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (issueType=ReportIssueType title=STRING target=[EObject|URIID])
	 */
	protected void sequence_ReportIssue(EObject context, ReportIssue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ResultsPackage.Literals.REPORT_ISSUE__ISSUE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ResultsPackage.Literals.REPORT_ISSUE__ISSUE_TYPE));
			if(transientValues.isValueTransient(semanticObject, ResultsPackage.Literals.REPORT_ISSUE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ResultsPackage.Literals.REPORT_ISSUE__TITLE));
			if(transientValues.isValueTransient(semanticObject, ResultsPackage.Literals.REPORT_ISSUE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ResultsPackage.Literals.REPORT_ISSUE__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReportIssueAccess().getIssueTypeReportIssueTypeEnumRuleCall_0_0(), semanticObject.getIssueType());
		feeder.accept(grammarAccess.getReportIssueAccess().getTitleSTRINGTerminalRuleCall_1_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getReportIssueAccess().getTargetEObjectURIIDParserRuleCall_2_0_1(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (contributor=[EObject|URIID] cell+=STRING+ issues+=ReportIssue* subcontributor+=ResultContributor*)
	 */
	protected void sequence_ResultContributor(EObject context, ResultContributor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_ResultData(EObject context, ResultData semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ResultsPackage.Literals.RESULT_DATA__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ResultsPackage.Literals.RESULT_DATA__NAME));
			if(transientValues.isValueTransient(semanticObject, ResultsPackage.Literals.RESULT_DATA__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ResultsPackage.Literals.RESULT_DATA__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResultDataAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getResultDataAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         title=STRING? 
	 *         target=[EObject|URIID] 
	 *         decription=STRING? 
	 *         content+=ResultReport* 
	 *         issues+=ReportIssue*
	 *     )
	 */
	protected void sequence_ResultReportCollection(EObject context, ResultReportCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         title=STRING? 
	 *         target=[EObject|URIID] 
	 *         decription=STRING? 
	 *         (heading=STRING content+=ResultContributor*)? 
	 *         resultData+=ResultData* 
	 *         issues+=ReportIssue*
	 *     )
	 */
	protected void sequence_ResultReport(EObject context, ResultReport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
