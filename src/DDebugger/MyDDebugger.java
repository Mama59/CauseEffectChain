package DDebugger;

import CauseEffectChain.MyCauseEffectChain;
import Challenge.Challenge;
import spoon.Launcher;

public class MyDDebugger implements DDebugger<String> {
	private Launcher launcher;
	
	public <I> MyCauseEffectChain<I> debug(Challenge<I> challenge) {
		MyCauseEffectChain<I> causeEffect = new MyCauseEffectChain<I>();
		for (I input: challenge.getInputs()) {
			// run 4 times
//			for (int i = 0; i <= 4; i++) {
				// instrument & modify
				internalDebug(challenge.getJavaProgram(), input);
				// reason about execution
				challenge.challenge(input);
//			}
		}
		return causeEffect;
	}

	private <I> void internalDebug(String javaProgram, I input) {
		this.launcher = new Launcher();
		this.launcher.addInputResource("src/Challenge/MyFirstChallenge.java");
		this.launcher.addProcessor(new MethodCheckProcessor());
		this.launcher.run();
	}
}
