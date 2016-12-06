package DDebugger;

import CauseEffectChain.CauseEffectChain;
import Challenge.Challenge;

public interface DDebugger<I> {
	<I> CauseEffectChain debug(Challenge<I> c);
}

