/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nabiya Fatima
 */
public class EquationsIT {
    
    public EquationsIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkRoots method, of class Equations.
     */
    @Test
    public void testCheckRoots() {
        System.out.println("checkRoots");
        int a = 0;
        int b = 0;
        int c = 0;
        Equations e = new Equations();
        
        
        assertSame("Equal Roots with shape of parabola open upwards",e.checkRoots(1, 0, 0) );
        assertSame("Equal Roots with shape of parabola open downwards",e.checkRoots(-1, 0, 0) );
        assertSame("Real Roots with shape of parabola open upwards",e.checkRoots(1, 1, 0) );
        assertSame("Real Roots with shape of parabola open downwards",e.checkRoots(-1, 1, 0) );
        assertSame("Imaginary Roots with shape of parabola open upwards",e.checkRoots(1, 1, 1) );
      assertSame("Imaginary Roots with shape of parabola open downwards",e.checkRoots(-1, -4, -5) );
        assertSame("Not a Quadratic Equation",e.checkRoots(0, 1, 0) );
        
        
    }

    /**
     * Test of main method, of class Equations.
     */
   
    
}
