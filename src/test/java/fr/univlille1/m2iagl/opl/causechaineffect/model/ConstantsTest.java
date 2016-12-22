package fr.univlille1.m2iagl.opl.causechaineffect.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConstantsTest {
        
    /**
     * Test of init method, of class Constants.
     */
    @Test
    public void init_WindowsOs_ShouldReturnDoubleAntiSlash() {
        String result = "\\";
        
        System.setProperty("os.name","windows");

        Constants.init();
        String expResult = Constants.SEPARATOR;
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void init_LinuxOs_ShouldReturnSlash() {
        String result = "/";
        
        System.setProperty("os.name","linux");

        Constants.init();
        String expResult = Constants.SEPARATOR;
        
        assertEquals(expResult, result);
    }
    
}
