package fr.univlille1.m2iagl.opl.causechaineffect.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BreakpointArrayTest {
    
    /**
     * Test of get method, of class BreakpointArray.
     */
    @Test
    public void get_SecondeBreakpointInArray_ShouldReturnSecondTestFileName() {
        Breakpoint[] br;
        br = new Breakpoint[2];
        br[0]= new Breakpoint(7,"firstTestFileName");
        br[1]= new Breakpoint(4,"secondTestFileName");
        BreakpointArray breakPointArray = new BreakpointArray(br);
        int i = 1;
        Breakpoint expResult = new Breakpoint(4,"secondTestFileName");
        Breakpoint result = breakPointArray.get(i);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of getLineAt method, of class BreakpointArray.
     */
    @Test
    public void getLineAt_BreakPointWithLineNumber7_ShouldReturn7() {
        Breakpoint[] br;
        br = new Breakpoint[2];
        br[0]= new Breakpoint(7,"firstTestFileName");
        br[1]= new Breakpoint(4,"secondTestFileName");
        BreakpointArray breakPointArray = new BreakpointArray(br);
        int i = 0;
        int expResult = 7;
        int result = breakPointArray.getLineAt(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of getFilenameAt method, of class BreakpointArray.
     */
    @Test
    public void getFilenameAt_BreakpointWithFileNameFirstTest_ShoudReturnFirstTestFileName() {
        Breakpoint[] br;
        br = new Breakpoint[2];
        br[0]= new Breakpoint(7,"firstTestFileName");
        br[1]= new Breakpoint(4,"secondTestFileName");
        BreakpointArray breakPointArray = new BreakpointArray(br);
        int i = 0;
        String expResult = "firstTestFileName";
        String result = breakPointArray.getFilenameAt(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class BreakpointArray.
     */
    @Test
    public void toString_ValideFileNameAndLineNumber_ShouldReturnFileNameAndLineNumber() {
        Breakpoint[] br;
        br = new Breakpoint[1];
        br[0]= new Breakpoint(7,"firstTestFileName");
        BreakpointArray breakPointArray = new BreakpointArray(br);
        String result = breakPointArray.toString();
        String expResult = "[firstTestFileName:7]";
        
        assertEquals(expResult, result);
    }

    /**
     * Test of length method, of class BreakpointArray.
     */
    @Test
    public void length_TwoBreakpoints_ShouldReturnTwo() {
        Breakpoint[] br;
        br = new Breakpoint[2];
        br[0]= new Breakpoint(7,"firstTestFileName");
        br[1]= new Breakpoint(4,"secondTestFileName");
        BreakpointArray breakPointArray = new BreakpointArray(br);
        int expResult = 2;
        int result = breakPointArray.length();
        assertEquals(expResult, result);
    }
    
}
