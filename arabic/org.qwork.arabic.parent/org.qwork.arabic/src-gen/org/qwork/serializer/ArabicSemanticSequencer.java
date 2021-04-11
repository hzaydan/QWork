/*
 * generated by Xtext 2.25.0
 */
package org.qwork.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.qwork.arabic.ArabicPackage;
import org.qwork.arabic.Model;
import org.qwork.arabic.Phrase;
import org.qwork.services.ArabicGrammarAccess;

@SuppressWarnings("all")
public class ArabicSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ArabicGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ArabicPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ArabicPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ArabicPackage.PHRASE:
				sequence_Phrase(context, (Phrase) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     phrases+=Phrase+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Phrase returns Phrase
	 *
	 * Constraint:
	 *     (basmalah?=BASMALAH? words+=AWORD+)
	 */
	protected void sequence_Phrase(ISerializationContext context, Phrase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
