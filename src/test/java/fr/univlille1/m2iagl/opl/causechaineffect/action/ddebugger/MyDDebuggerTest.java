package fr.univlille1.m2iagl.opl.causechaineffect.action.ddebugger;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.univlille1.m2iagl.opl.causechaineffect.challenge.MyFirstChallenge;
import fr.univlille1.m2iagl.opl.causechaineffect.model.CauseEffectChain;

public class MyDDebuggerTest {
	@Test
    public void testDebugChallenge() {
		MyDDebugger mdebugger = new MyDDebugger();
		MyFirstChallenge myfirstChallenge = new MyFirstChallenge();
		
		String expResult = "At fr.univlille1.m2iagl.opl.causechaineffect.challenge.MyFirstChallenge:33 :";
		CauseEffectChain result = mdebugger.debug(myfirstChallenge);
        
        assertTrue(result.toString().trim().startsWith(expResult));
    }
}
