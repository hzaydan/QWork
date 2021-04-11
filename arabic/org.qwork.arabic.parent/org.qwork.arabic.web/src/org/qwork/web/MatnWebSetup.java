/*
 * generated by Xtext 2.25.0
 */
package org.qwork.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.qwork.MatnRuntimeModule;
import org.qwork.MatnStandaloneSetup;
import org.qwork.ide.MatnIdeModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class MatnWebSetup extends MatnStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MatnRuntimeModule(), new MatnIdeModule(), new MatnWebModule()));
	}
	
}