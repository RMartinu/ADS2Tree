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
    int Payload;
    Node left=null, right=null;
    
    public Node (int input)
    {
        Payload=input;
    }
    
    public int getValue()
    {
        return Payload;
    }
    
    public Node getLeftChild()
    {
        return left;
    }
    
    public Node getRightChild()
    {
        return right;
    }
    
    
    public void insert(int value)
    {
        if(value>Payload)
        {
            if(right!=null)
                right.insert(value);
            else
                right=new Node(value);
        }
        else
        {
            if(left!=null)
                left.insert(value);
            else
                left=new Node(value);
        }
    }
    
    public int getHeight()
    {
        int leftHeight=1, rightHeight=1;
        if(left!=null)
            leftHeight=left.getHeight()+1;
        if(right!=null)
            rightHeight=right.getHeight()+1;
        
        return Integer.max(leftHeight, rightHeight); 
    }
    
    public int getBalance()
    {
        if(left!=null && right!=null)
        return left.getHeight()-right.getHeight();
        if(left!=null)
            return -(left.getHeight()+1);
        if(right!=null)
            return right.getHeight()+1;
        return 0;
    }
}
