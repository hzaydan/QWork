/*
 * generated by Xtext 2.25.0
 */
package org.qwork.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractAbjadValidator extends QAyahStartValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(org.qwork.abjad.AbjadPackage.eINSTANCE);
		return result;
	}
}
