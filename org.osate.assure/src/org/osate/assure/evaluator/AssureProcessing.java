package org.osate.assure.evaluator;

import org.osate.assure.assure.AndThenResult;
import org.osate.assure.assure.AssumptionResult;
import org.osate.assure.assure.CaseResult;
import org.osate.assure.assure.ClaimResult;
import org.osate.assure.assure.FailThenResult;
import org.osate.assure.assure.HazardResult;
import org.osate.assure.assure.PreconditionResult;
import org.osate.assure.assure.VerificationActivityResult;
import org.osate.assure.assure.VerificationExpr;
import org.osate.verify.verify.VerificationActivity;

public class AssureProcessing {
	public static void processCaseResult(CaseResult caseResult) {
		System.out.println("case result=" + caseResult);

		for (ClaimResult claimResult : caseResult.getClaimResult()) {
			processClaimResult(claimResult);
		}
		for (HazardResult claimResult : caseResult.getHazardResult()) {
			processHazardResult(claimResult);
		}
		for (CaseResult subCaseResult : caseResult.getSubCaseResult()) {
			processCaseResult(subCaseResult);
		}
	}

	public static void processClaimResult(ClaimResult claimResult) {
		System.out.println("claim result=" + claimResult);

		for (VerificationExpr verificationResult : claimResult.getVerificationActivityResult()) {
			processVerificationExpr(verificationResult);
		}

		for (ClaimResult subClaimResult : claimResult.getSubClaimResult()) {
			processClaimResult(subClaimResult);
		}
	}

	public static void processVerificationExpr(VerificationExpr verificationExpr) {
		System.out.println("claim result=" + verificationExpr);
		if (verificationExpr instanceof VerificationActivityResult) {
			processVerificationResult((VerificationActivityResult) verificationExpr);
		} else if (verificationExpr instanceof FailThenResult) {
			FailThenResult ftr = (FailThenResult) verificationExpr;
			for (VerificationExpr ve : ftr.getFirst()) {
				processVerificationExpr(ve);
			}
		} else if (verificationExpr instanceof AndThenResult) {
			FailThenResult ftr = (FailThenResult) verificationExpr;
			for (VerificationExpr ve : ftr.getFirst()) {
				processVerificationExpr(ve);
			}
		}
	}

	public static void processVerificationResult(VerificationActivityResult verificationActivityResult) {
		VerificationActivity verificationActivity = verificationActivityResult.getTarget();

		for (AssumptionResult assumptionResult : verificationActivityResult.getAssumptionResult()) {
			processAssumptionResult(assumptionResult);
		}

		for (PreconditionResult preResult : verificationActivityResult.getPreconditionResult()) {
			processPreconditionResult(preResult);
		}
//		if (verificationActivity != null) {
//			VerificationMethod method = verificationActivityResult.getTarget().getMethod();
//			System.out.println("verification method=" + method.getName());
//			if (method.getMethodType() == SupportedTypes.SINGLEPREDICATE) {
//				System.out.println("title=" + method.getTitle());
//				System.out.println("method=" + method.getMethodPath());
//				String methodpath = method.getMethodPath();
//				String className = methodpath.substring(0, methodpath.lastIndexOf("."));
//				String methodName = methodpath.substring(methodpath.lastIndexOf(".") + 1, methodpath.length());
//				Object[] args;
//				args = new Object[0];
//				try {
////					AlisaLoader.alisaInvoke("testresourcebudget.JulienTest", "juliensimple", args);
//					args = new Object[1];
////					CaseResult cr = AssureUtilExtension.getEnclosingCaseResult(verificationActivityResult);
//					InstanceObject obj = cr.getInstance();
////					args[0] = (ComponentInstance) obj;
////					AlisaLoader.alisaInvoke("testresourcebudget.JulienTest", "julien", args);
//					args[0] = (ComponentInstance) obj;
//					AlisaLoader.alisaInvoke(className, methodName, args);
//				} catch (AssertionFailedError e) {
//					AssureUtilExtension.addFailure(verificationActivityResult, e);
//				} catch (ThreadDeath e) { // don't catch ThreadDeath by accident
//					throw e;
//				} catch (Throwable e) {
//					AssureUtilExtension.addError(verificationActivityResult, e);
//				}
//
//			}
//		}

	}

	public static void processHazardResult(HazardResult hazardResult) {
		System.out.println("hazard result=" + hazardResult);

//		for (VerificationActivityResult verificationResult : hazardResult.getVerificationActivityResult()) {
//			processVerificationResult(verificationResult);
//		}
//
//		for (ClaimResult subClaimResult : hazardResult.getSubClaimResult()) {
//			processClaimResult(subClaimResult);
//		}
	}

	public static void processAssumptionResult(AssumptionResult assumptionResult) {
		System.out.println("assumption result=" + assumptionResult);

//		for (VerificationActivityResult verificationResult : hazardResult.getVerificationActivityResult()) {
//			processVerificationResult(verificationResult);
//		}
//
//		for (ClaimResult subClaimResult : hazardResult.getSubClaimResult()) {
//			processClaimResult(subClaimResult);
//		}
	}

	public static void processPreconditionResult(PreconditionResult preconditionResult) {
		System.out.println("precondition result=" + preconditionResult);

//		for (VerificationActivityResult verificationResult : hazardResult.getVerificationActivityResult()) {
//			processVerificationResult(verificationResult);
//		}
//
//		for (ClaimResult subClaimResult : hazardResult.getSubClaimResult()) {
//			processClaimResult(subClaimResult);
//		}
	}

}
