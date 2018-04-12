/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads2tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
       if(args.length<1)
       {
           System.err.println("Please specifiy file");
           return;
       }
       System.out.println("Parsin: "+args[0]);
        TreeTester TestThisTree=new TreeTester(BuildTree(args[0]));
        boolean isAVL=TestThisTree.checkTree();
        int min, max; 
        double avg;
        min=TestThisTree.findMin();
        max=TestThisTree.findMax();
        avg=TestThisTree.findAverage();
        
        System.out.println("AVL: " + ((isAVL)?"Yes":"No"));
        //System.out.println("min: " + min + "max: " + max + "avg: "+ avg);
        
        System.out.format(Locale.US,"min: %d max: %d avg: %.1f ", min, max, avg);
    }
    
    static Node BuildTree(String filename)
    {
        Node h=null;
        File f=new File(filename);
        Scanner sc=null;
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ADS2Tree.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(sc.hasNextInt())
           
        {
            
            h=new Node(sc.nextInt());
            {
                while(sc.hasNextInt())
                    h.insert(sc.nextInt());
            }
        } 
        if(h==null)
            System.err.println("PArsing Error");
        return h;
    }
    
}