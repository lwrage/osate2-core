/*
 * generated by Xtext
 */
package org.osate.alisa.common;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CommonStandaloneSetup extends CommonStandaloneSetupGenerated {

	public static void doSetup() {
		new CommonStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
