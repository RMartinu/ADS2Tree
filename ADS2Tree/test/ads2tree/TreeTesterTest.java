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
 * @author Julia Pichler
 */
public class TreeTesterTest {

    Node nonAVL = null;
    Node AVL = null;

    public TreeTesterTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        int input[] = {5, 3, 17, 9, 23, 54, 11, 79, 30, 12};
        nonAVL = new Node(5);
        for (int i = 1; i < input.length; ++i) {
            nonAVL.insert(input[i]);
        }
        int input1[] = {/*25,*/20, 36, 10, 22, 30, 40, 12, 28, 38, 48};
        AVL = new Node(25);
        for (int i : input1) {
            AVL.insert(i);
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
        TreeTester instance = new TreeTester(this.nonAVL);
        int expResult = 3;
        int result = instance.findMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

        expResult = 10;
        instance = new TreeTester(AVL);
        result = instance.findMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of findMax method, of class TreeTester.
     */
    @Test
    public void testFindMax() {
        System.out.println("findMax");

        //Node in = null;
        TreeTester instance = new TreeTester(nonAVL);
        int expResult = 79;
        int result = instance.findMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        instance = new TreeTester(AVL);
        expResult = 48;
        result = instance.findMax();
        assertEquals(expResult, result);
    }

    /**
     * Test of findAverage method, of class TreeTester.
     */
    @Test
    public void testFindAverage() {
        System.out.println("findAverage");

        Node in = null;
        TreeTester instance = new TreeTester(this.nonAVL);
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
        //fail();
        Node in = null;
        TreeTester instance = new TreeTester(this.nonAVL);
        boolean expResult = false;
        boolean result = instance.checkTree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("");

        instance = new TreeTester(AVL);
        expResult = true;
        result = instance.checkTree();
        assertEquals(expResult, result);

    }

}
