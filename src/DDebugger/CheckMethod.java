package DDebugger;

import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;

public class CheckMethod {
	private CtMethod<?> method;

	public CheckMethod(CtMethod<?> method) {
		this.method = method;
	}

	//if (this.method.getSimpleName().length() <= 3) {

	//		if (method.getBody().getStatements().size() > ConstantesMethod.NBLIGNE) {
	//		if (method.getParameters().size() > 7) {
	//		System.out.println(this.method.isShadow());
	//		CtCodeSnippetStatement stmt = method.getFactory().Core().createCodeSnippetStatement();

	public void verifier() {
		if(method.getSimpleName().equals("doIt")){
			System.out.println("Method : " + method);
			
			System.out.println("Name : " + method.getSimpleName());
			
			System.out.println("Parameters :");
			for(CtParameter<?> parameter : method.getParameters()) {
				System.out.println("\t" + parameter);
			}
			
			System.out.println("Statements " + method.getBody().getStatements().size());
			for (CtStatement statement : method.getBody().getStatements()) {
				System.out.println("\t" + statement);
			}
		}
	}
}
