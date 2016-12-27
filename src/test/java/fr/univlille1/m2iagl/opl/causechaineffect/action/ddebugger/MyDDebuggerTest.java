package fr.univlille1.m2iagl.opl.causechaineffect.action.ddebugger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.univlille1.m2iagl.opl.causechaineffect.challenge.MyFirstChallenge;
import fr.univlille1.m2iagl.opl.causechaineffect.model.CauseEffectChain;

public class MyDDebuggerTest {
	@Test
    public void testDebugChallenge() {
		MyDDebugger mdebugger = new MyDDebugger();
		MyFirstChallenge myfirstChallenge = new MyFirstChallenge();
		
		String expResult = "At fr.univlille1.m2iagl.opl.causechaineffect.challenge.MyFirstChallenge:33 : \nThen, the app crashed !";
		CauseEffectChain result = mdebugger.debug(myfirstChallenge);
        
        assertEquals(expResult, result.toString().trim());
    }
}
