package fr.univlille1.m2iagl.opl.causechaineffect.main;

import org.junit.Test;

public class LaunchJDBMainTest {
    
    /**
     * Test of main method, of class LaunchJDBMain.
     */
    @Test(expected=NumberFormatException.class)
    public void testMain() {
        LaunchJDBMain launch= new LaunchJDBMain();
        String[] args = new String[1];
        args[0]="1";
        launch.main(args);
    }
    
}
