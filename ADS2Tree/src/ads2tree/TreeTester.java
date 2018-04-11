/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads2tree;

/**
 *
 * @author Robert Martinu
 */
public class TreeTester {
    Node testMe;
    int counter=0;
    public TreeTester(Node n)
    {
        testMe=n;
                
    }
    
    int findMin()
    {
        return findMin(testMe);
    }
    int findMin(Node in)
    {
        if(in.getLeftChild()!=null)
        {return findMin(in.getLeftChild());}
        return in.getValue();
    }
    
    int findMax()
    {return findMax(testMe);}
    int findMax(Node in)
    {return 0;}
    
    double findAverage()
    {
        counter=0;
        int sum=findAverage(testMe);
        //System.out.println("nodes: " + counter + " sum " + sum + " " + sum/counter);
        return sum/(float)counter;
    }
    int findAverage(Node in)
    {
        counter++;
        int l=0; int r=0;
        if(in.left!=null)
            l=findAverage(in.left);
        if(in.right!=null)
            r=findAverage(in.right);
        return in.getValue()+l+r;}
    boolean checkTree()
    {
        return checkTree(testMe);
    }
    boolean checkTree(Node in)
    {
        return true;
    }
    

    
}
