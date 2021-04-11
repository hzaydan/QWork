/*
 * generated by Xtext 2.25.0
 */
package org.qwork.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.qwork.OsolQiraaRuntimeModule;
import org.qwork.OsolQiraaStandaloneSetup;
import org.qwork.ide.OsolQiraaIdeModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class OsolQiraaWebSetup extends OsolQiraaStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new OsolQiraaRuntimeModule(), new OsolQiraaIdeModule(), new OsolQiraaWebModule()));
	}
	
}
