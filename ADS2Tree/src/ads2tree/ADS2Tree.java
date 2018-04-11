/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads2tree;

import java.util.Scanner;

/**
 *
 * @author Robert Martinu
 */
public class ADS2Tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Node TreeToTest=BuildTree(args[0]);
        TreeTester TestThisTree=new TreeTester(BuildTree(args[0]));
    }
    
    static Node BuildTree(String filename)
    {
        Node h=null;
        Scanner sc=new Scanner(filename);
        if(sc.hasNextInt())
        {
            h=new Node(sc.nextInt());
            {
                while(sc.hasNextInt())
                    h.insert(sc.nextInt());
            }
        }   
        return h;
    }
    
}