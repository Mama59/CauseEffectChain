package Processors;

import Methods.CheckMethod;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtMethod;

public class MethodCheckProcessor extends AbstractProcessor<CtMethod<?>> {

	public MethodCheckProcessor() {
	}

	public void process(CtMethod<?> element) {
		new CheckMethod(element).verifier();
	}

}
