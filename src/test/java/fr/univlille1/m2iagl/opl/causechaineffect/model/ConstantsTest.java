package fr.univlille1.m2iagl.opl.causechaineffect.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConstantsTest {

    /**
     * Test of init method, of class Constants.
     */
    @Test
    public void testInit() {
        String expResult = Constants.SEPARATOR;
        String result = "/";
        
        Constants.init();
        
        assertEquals(expResult, result);
    }
}
