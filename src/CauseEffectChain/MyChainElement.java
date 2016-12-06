package CauseEffectChain;

public class MyChainElement implements ChainElement {

	private String line;
	private String variable;
	private String description;
	
	public MyChainElement(String line, String variable, String description) {
		this.line = line;
		this.variable = variable;
		this.description = description;
	}
	
	public String getLine() {
		// TODO Auto-generated method stub
		return line;
	}

	public String getVariable() {
		// TODO Auto-generated method stub
		return variable;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

}
