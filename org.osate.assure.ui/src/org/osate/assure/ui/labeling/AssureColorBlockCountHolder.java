package org.osate.assure.ui.labeling;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.Color;
import org.osate.assure.assure.AssureResult;
import org.osate.assure.util.AssureUtilExtension;

public class AssureColorBlockCountHolder {

	private int totalCount;
	private int successBlocks;
	private int errorBlocks;
	private int failBlocks;
	private List<Color> colorValues = new ArrayList<Color>();

	private AssureColorBlockCountHolder(Color blueColor) {
		for (int i = 0; i < 10; i++) {
			colorValues.add(blueColor);
		}
	}

	public static AssureColorBlockCountHolder createAssureColorBlockCountHolder(Object resultObj, Color blueColor, Color greenColor, Color redColor) {
		AssureColorBlockCountHolder assureColorBlockCountHolder = new AssureColorBlockCountHolder(blueColor);
		assureColorBlockCountHolder.populateAssureColorBlockCountHolder(resultObj, greenColor, redColor);
		return assureColorBlockCountHolder;
	}

	private int getBlockCount(int count) {
		float portionCalc = 10 * count / totalCount;
		return Math.round(portionCalc);
	}

	private boolean firstIslargestValue(int x, int y, int z) {
		if (x >= y && x >= z)
			return true;
		return false;
	}

	private void populateAssureColorBlockCountHolder(Object resultObj, Color greenColor, Color redColor) {

		if (resultObj instanceof AssureResult) {
			AssureResult ele = (AssureResult) resultObj;
			totalCount = AssureUtilExtension.getTotalCount(ele);
			if (ele.getMetrics().getSuccessCount() > 0 && totalCount > 0) {
				successBlocks = getBlockCount(ele.getMetrics().getSuccessCount());
				if (successBlocks < 1)
					successBlocks = 1;
			}
			if (ele.getMetrics().getFailCount() > 0 && totalCount > 0) {
				failBlocks = getBlockCount(ele.getMetrics().getFailCount());
				if (failBlocks < 1)
					failBlocks = 1;
			}
			if (ele.getMetrics().getErrorCount() + ele.getMetrics().getTimeoutCount() > 0 && totalCount > 0) {
				errorBlocks = getBlockCount(ele.getMetrics().getErrorCount() + ele.getMetrics().getTimeoutCount());
				if (errorBlocks < 1)
					errorBlocks = 1;
			}
			while (successBlocks + failBlocks + errorBlocks > 0 && successBlocks + failBlocks + errorBlocks < 10) {
				if (failBlocks > 1 && firstIslargestValue(failBlocks, successBlocks, errorBlocks)) {
					failBlocks = failBlocks + 1;
				} else if (errorBlocks > 1 && firstIslargestValue(errorBlocks, failBlocks, successBlocks)) {
					errorBlocks = errorBlocks + 1;
				} else if (successBlocks > 1 && firstIslargestValue(successBlocks, failBlocks, errorBlocks)) {
					successBlocks = successBlocks + 1;
				} else {
					break;
				}
			}
			while (successBlocks + failBlocks + errorBlocks > 10) {
				if (failBlocks > 1 && firstIslargestValue(failBlocks, successBlocks, errorBlocks)) {
					failBlocks = failBlocks - 1;
				} else if (errorBlocks > 1 && firstIslargestValue(errorBlocks, failBlocks, successBlocks)) {
					errorBlocks = errorBlocks - 1;
				} else if (successBlocks > 1 && firstIslargestValue(successBlocks, failBlocks, errorBlocks)) {
					successBlocks = successBlocks - 1;
				} else {
					break;
				}
			}
		}
		for (int i = 0; i < successBlocks; i++) {
			colorValues.set(i, greenColor);
		}
		for (int i = successBlocks; i < successBlocks + failBlocks; i++) {
			colorValues.set(i, redColor);
		}
		for (int i = successBlocks + failBlocks; i < successBlocks + failBlocks + errorBlocks; i++) {
			colorValues.set(i, null);
		}
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getSuccessBlocks() {
		return successBlocks;
	}

	public int getFailBlocks() {
		return failBlocks;
	}

	public int getErrorBlocks() {
		return errorBlocks;
	}

	public List<Color> getColorValues() {
		return colorValues;
	}

}
