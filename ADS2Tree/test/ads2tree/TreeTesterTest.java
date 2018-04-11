/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads2tree;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robert Martinu
 */
public class TreeTesterTest {

     Node Instance = null;

    public TreeTesterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
//         int input[] = {5, 3, 17, 9, 23, 54, 11, 79, 30, 12};
//        Instance = new Node(5);
//        for (int i = 1; i < input.length; ++i) {
//            Instance.insert(input[i]);
//        }

        
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        int input[] = {5, 3, 17, 9, 23, 54, 11, 79, 30, 12};
        Instance = new Node(5);
        for (int i = 1; i < input.length; ++i) {
            Instance.insert(input[i]);
        }

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of findMin method, of class TreeTester.
     */
    @Test
    public void testFindMin() {
        System.out.println("findMin");
        Node in = null;
        TreeTester instance = new TreeTester(this.Instance);
        int expResult = 3;
        int result = instance.findMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of findMax method, of class TreeTester.
     */
    @Test
    public void testFindMax() {
        System.out.println("findMax");
        fail();
        Node in = null;
        TreeTester instance = null;
        int expResult = 0;
        int result = instance.findMax(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAverage method, of class TreeTester.
     */
    @Test
    public void testFindAverage() {
        System.out.println("findAverage");
        
        Node in = null;
        TreeTester instance = new TreeTester(this.Instance);
        double expResult = 24.3;
        double result = instance.findAverage();
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkTree method, of class TreeTester.
     */
    @Test
    public void testCheckTree() {
        System.out.println("checkTree");
        fail();
        Node in = null;
        TreeTester instance = null;
        boolean expResult = false;
        boolean result = instance.checkTree(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
