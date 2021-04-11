/*
 * generated by Xtext 2.25.0
 */
package org.qwork.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.qwork.MatnRuntimeModule;
import org.qwork.MatnStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MatnIdeSetup extends MatnStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MatnRuntimeModule(), new MatnIdeModule()));
	}
	
}
