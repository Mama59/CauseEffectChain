package fr.univlille1.m2iagl.causeeffectchain;
import spoon.Launcher;

public class MyDDebugger implements DDebugger<String> {
	private Launcher launcher;
	
	public MyDDebugger() {
		this.launcher = new Launcher();
	}
	
	public MyCauseEffectChain debug(Challenge<String> c) {
		for (String input: c.getInputs()) {
			// run 4 times
			for (int i = 0; i<4; i++) {
				// instrument & modify
				internalDebug(c.getJavaProgram(), input);
				// reason about execution
				c.oracle(input);
			}
		}
		return new MyCauseEffectChain();
	}

	private void internalDebug(String javaProgram, String input) {
		// a dummy debugger do thing
	}
}
