package org.osate.aadl2.errormodel.faulttree.tests

import com.itemis.xtext.testing.FluentIssueCollection
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.osate.aadl2.AadlPackage
import org.osate.aadl2.SystemImplementation
import org.osate.aadl2.errormodel.FaultTree.LogicOperation
import org.osate.aadl2.errormodel.FaultTree.util.FaultTreeUtils
import org.osate.aadl2.errormodel.faulttree.generation.CreateFTAModel
import org.osate.aadl2.errormodel.tests.ErrorModelUiInjectorProvider
import org.osate.aadl2.instantiation.InstantiateModel
import org.osate.core.test.OsateTest

import static org.junit.Assert.*
import org.osate.aadl2.instance.SystemInstance

@RunWith(XtextRunner)
@InjectWith(ErrorModelUiInjectorProvider)
class PropagationPointsTest extends OsateTest {
	override getProjectName() {
		"PropagationPointsTest"
	}

	static boolean once = true

//	var static FluentIssueCollection result
	var static SystemInstance instance

	@Before
	override setUp() {
	}

	@After
	override cleanUp() {
	}

	@Before
	/**
	 * All tests use the same model
	 */
	def void initWorkspace() {
		val aadlFile = "propagationpointstest.aadl"
		val modelroot = "org.osate.aadl2.errormodel.faulttree.tests/models/PropagationPoints/"

		if (once) {
			once = false
			createProject(projectName)
			setResourceRoot("platform:/resource/" + projectName)
			createFiles(aadlFile -> readFile(modelroot + aadlFile))
			suppressSerialization
			val result = testFile(aadlFile /*, referencedFile1, referencedFile2, etc. */ )
			// get the correct package
			val pkg = result.resource.contents.head as AadlPackage
			val cls = pkg.ownedPublicSection.ownedClassifiers
			assertTrue('', cls.exists[name == 'main.commonsource'])

			// instantiate
			val sysImpl = cls.findFirst[name == 'main.commonsource'] as SystemImplementation

			instance = InstantiateModel::buildInstanceModelFile(sysImpl)
		}
	}

	/**
	 * example with 2 sensors, compute, and one actuator.
	 * we run fault tree, fault trace, cutset, and parts fault tree
	 */
	@Test
	def void propagationpointsfaulttree() {
		val start = "outgoing propagation on observation{ServiceOmission}"
		val ft = CreateFTAModel.createFaultTree(instance, start)
		assertEquals(ft.events.size, 6)
		val andevent = FaultTreeUtils.findEvent(ft, "Intermediate1")
		assertEquals(andevent.subEventLogic, LogicOperation.AND)
		val actual = ft.root.computedProbability
		assertEquals(7.1e-8, actual, 0.1e-8)
	}

	@Test
	def void propagationpointsfaulttrace() {
		val start = "outgoing propagation on observation{ServiceOmission}"
		val ftrace = CreateFTAModel.createFaultTrace(instance, start)
		assertEquals(ftrace.events.size, 15)
	}

	@Test
	def void propagationpointscutsets() {
		val start = "outgoing propagation on observation{ServiceOmission}"
		val cutsets = CreateFTAModel.createMinimalCutSet(instance, start)
		assertEquals(cutsets.events.size, 8)
		// three cutsets
		assertEquals(cutsets.root.subEvents.size, 3)
		val cutset1 = FaultTreeUtils.findEvent(cutsets, "Cutset1")
		assertEquals(6.5e-10, cutset1.computedProbability, 0.1e-10)
		val cutset2 = FaultTreeUtils.findEvent(cutsets, "Cutset2")
		assertEquals(4.9e-15, cutset2.computedProbability, 0.1e-15)
		val cutset3 = FaultTreeUtils.findEvent(cutsets, "Cutset3")
		assertEquals(7.0e-8, cutset3.computedProbability, 0.1e-8)
	}

}
