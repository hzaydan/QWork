/*
 * generated by Xtext 2.25.0
 */
package org.qwork.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractQiraaValidator extends MatnValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(org.qwork.qiraa.QiraaPackage.eINSTANCE);
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.qwork.org/Matn"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.qwork.org/OsolQiraa"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.qwork.org/QAyahStart"));
		return result;
	}
}
