/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class StackVectorTest {
    
    public StackVectorTest() {
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
     * Test of push method, of class StackVector.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = 1;
        StackVector instance = new StackVector();
        instance.push(item);
        assertTrue(instance.size()==1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackVector.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackVector instance = new StackVector();
        instance.push(1);
        Object expResult = 1;
        Object result = instance.pop();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class StackVector.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackVector instance = new StackVector();
        instance.push(15);
        Object expResult = 15;
        Object result = instance.peek();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackVector.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackVector instance = new StackVector();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class StackVector.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackVector instance = new StackVector();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
