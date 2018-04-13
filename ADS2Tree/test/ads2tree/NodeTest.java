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
public class NodeTest {

    public NodeTest() {
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

    @Test
    public void testConstructor() {
        // TODO review the generated test code and remove the default call to fail.
        Node n = new Node(17);
        assertEquals(17, n.getValue());
        assertEquals(1, n.getHeight());

        // fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class Node.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int value = 5;
        Node i = new Node(15);
        assertEquals(1, i.getHeight());
        assertEquals(0, i.getBalance());
        i.insert(value);
        assertEquals(2, i.getHeight());
        assertEquals(-1, i.getBalance());

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getBalance method, of class Node.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Node instance = new Node(13);
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
