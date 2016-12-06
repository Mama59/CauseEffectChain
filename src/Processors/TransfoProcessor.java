package Processors;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtStatement;

public class TransfoProcessor extends AbstractProcessor<CtStatement> {

	public TransfoProcessor() {
	}

	public void process(CtStatement element) {
		// declaration d'un bout de code à ajouter
		CtCodeSnippetStatement snippetBegin = getFactory().Core().createCodeSnippetStatement();
		snippetBegin.setValue("debug(");

		//	CtCodeSnippetStatement snippetEnd = getFactory().Core().createCodeSnippetStatement();

		//	snippetEnd.setValue(")");
		if( element.getLabel() == null || ! element.getLabel().equals("super()")) {
		System.out.println(element);
		// NOT WORK !!!!!!! 
			element.insertBefore(snippetBegin);
		}
	}

}
