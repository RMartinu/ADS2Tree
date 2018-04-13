/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads2tree;

/**
 *
 * @author Robert Martinu
 * @author Julia Pichler
 */
public class TreeTester {

    Node testMe;
    int counter = 0; //counts visited nodes during average calculation

    //constructor
    public TreeTester(Node n) {
        //Checking to see if we got data to work with
        if (n == null) {
            //not nice, but effective
            System.err.println("Can't work wihtout data");
            System.exit(-1);
        }
        testMe = n;

    }

    /**
     * triggers a recursive find min operation
     *
     * @return smallest value in tree
     */
    int findMin() {
        return findMin(testMe);
    }

    private int findMin(Node in) {
        //search smallest value recursively

        if (in.getLeftChild() != null) {
            //the left child has a smaller value, return that one
            return findMin(in.getLeftChild());
        }
        //I have the smallest value, returning it
        return in.getValue();
    }

    /**
     * triggers a recursive find max operation
     *
     * @return biggest value in tree
     */
    int findMax() {
        return findMax(testMe);
    }

    private int findMax(Node in) {
        if (in.getRightChild() != null) {
            //the right child has a bigger value, return that one
            return findMax(in.getRightChild());
        }
        //I have the bigger value, returning it
        return in.getValue();
    }

    /**
     * triggers a recursive operation, that finds the sum and counts the nodes
     * calculates average
     *
     * @return average number of all numbers
     */
    double findAverage() {
        counter = 0;
        //
        int sum = findAverage(testMe);
        //System.out.println("nodes: " + counter + " sum " + sum + " " + sum/counter);
        return sum / (float) counter;
    }

    /**
     * recursive calculation of total sum, sideeffect: increasing the node
     * counter
     *
     * @param in
     * @return the sum of this node and its children
     */
    private int findAverage(Node in) {
        //I'm a node thus I increase the counter
        counter++;
        int leftSubSum = 0;
        int rightSubSum = 0;

        //calculate sum of left subtree
        if (in.getLeftChild() != null) {
            leftSubSum = findAverage(in.getLeftChild());
        }
        //calculate sum of right subtree
        if (in.getRightChild() != null) {
            rightSubSum = findAverage(in.getRightChild());
        }
        //calculate sum of left + right subtree and own value
        return in.getValue() + leftSubSum + rightSubSum;
    }

    /**
     * triggers a recursive AVL check
     *
     * @return AVL status
     */
    boolean checkTree() {
        return checkTree(testMe);
    }

    private boolean checkTree(Node in) {
        int leftHeight = 0, rightHeight = 0, balance;
        //AVL Status of SubTrees
        boolean leftAVL = true, rightAVL = true;

        //calculates height of right subtree
        if (in.getRightChild() != null) {
            rightHeight = in.getRightChild().getHeight();
            rightAVL = checkTree(in.getRightChild());
        }

        //calculates height of left subtree
        if (in.getLeftChild() != null) {
            leftHeight = in.getLeftChild().getHeight();
            leftAVL = checkTree(in.getLeftChild());
        }
        //calculates difference of right and left subtrees
        balance = rightHeight - leftHeight;
        //print balance factor of node
        System.out.print("bal (" + in.getValue() + ") = " + balance);
        //check if balance factor is within AVL limits
        if (balance < -1 || balance > 1) {
            System.out.print(" (AVL violation!)");
        }
        System.out.println("");
        //return AVL status
        return ((balance >= -1) && (balance <= 1) && leftAVL && rightAVL);
    }

}
