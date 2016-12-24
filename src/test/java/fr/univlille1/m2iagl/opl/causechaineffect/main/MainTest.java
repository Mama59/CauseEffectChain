package fr.univlille1.m2iagl.opl.causechaineffect.main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        String[] args = null;
        Main.main(args);

        String out = outContent.toString().trim();
        String exp = "At fr.univlille1.m2iagl.opl.causechaineffect.challenge.MyFirstChallenge:33 : input was \"azerty\" (java.lang.String) - \"1\" (java.lang.String) with a right input,\n" +
"	 inputToParse was \"azerty\" (java.lang.String) - \"1\" (java.lang.String) with a right input,\n" +
"	 \n" +
"Then, the app crashed !";
        assertEquals(exp, out);
    }
    
}
