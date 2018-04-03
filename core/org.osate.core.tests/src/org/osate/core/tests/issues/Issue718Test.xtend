package org.osate.core.tests.issues

import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.Test
import org.junit.runner.RunWith
import org.osate.aadl2.AadlPackage
import org.osate.aadl2.SystemImplementation
import org.osate.aadl2.instantiation.InstantiateModel
import org.osate.core.test.Aadl2UiInjectorProvider
import org.osate.core.test.OsateTest

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(Aadl2UiInjectorProvider))
class Issue718Test extends OsateTest {
	override getProjectName() {
		"issue718"
	}

	@Test
	def void issue718() {
		val psFile = "ps718.aadl"
		val aadlFile = "issue718.aadl"
		createFiles(psFile -> ps718Text, aadlFile -> aadlText)
		suppressSerialization
		val result = testFile(aadlFile, psFile)
		assertTrue('Unexpected error', result.empty)
	}

	val ps718Text = '''
		property set ps718 is
			cltype: type classifier;
			reftype: type reference;
			cl: ps718::cltype applies to (all);
			ref: ps718::reftype applies to (all);
		end ps718;
	'''
	val aadlText = '''
		package issue718
		public
			with ps718;
			
			system S	
			end S;
			
			system implementation S.i
				subcomponents
					s: system;
				properties
					ps718::cl => classifier(S);
					ps718::ref => reference(s);
			end S.i;
		
		end issue718;
	'''
}
