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
public class Node {

    private final int Payload; //contains data of node
    private Node left = null, right = null;

    //constructor
    public Node(int input) {
        Payload = input;
    }

    //getter
    public int getValue() {
        return Payload;
    }

    public Node getLeftChild() {
        return left;
    }

    public Node getRightChild() {
        return right;
    }

    public void insert(int value) {
        //if input is greater then insert right
        if (value > Payload) {
            //if right is occupied then delegate else create new node
            if (right != null) {
                right.insert(value);
            } else {
                right = new Node(value);
            }
        } //if input is smaller then insert left
        else {
            //if left is occupied then delegate else create new node
            if (left != null) {
                left.insert(value);
            } else {
                left = new Node(value);
            }
        }
    }

    public int getHeight() {
        int leftHeight = 1, rightHeight = 1;
        //ask for each childs' height (recursive)
        if (left != null) {
            leftHeight = left.getHeight() + 1;
        }
        if (right != null) {
            rightHeight = right.getHeight() + 1;
        }
        //return largest height
        return Integer.max(leftHeight, rightHeight);
    }

    public int getBalance() {
        //if both children exist calculate their height difference
        if (left != null && right != null) {
            return left.getHeight() - right.getHeight();
        }
        //else return existing height
        if (left != null) {
            return -(left.getHeight());
        }
        if (right != null) {
            return right.getHeight();
        }
        return 0;
    }
}
