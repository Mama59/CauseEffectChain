package fr.univlille1.m2iagl.causeeffectchain;

public class MyChallenge<I> implements Challenge<I> {

	private I input1;
	private I input2;
	
	public Class<? extends I> getInputFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	public I getInput1() {
		// TODO Auto-generated method stub
		return input1;
	}

	public I getInput2() {
		// TODO Auto-generated method stub
		return input2;
	}

	public boolean oracle(I input) {
		// TODO Auto-generated method stub
		return false;
	}

	public CauseEffectChain computeTrace(I x, I y) {
		// TODO Auto-generated method stub
		CauseEffectChain cause = new CauseEffectChain();
		return cause;
	}

}
