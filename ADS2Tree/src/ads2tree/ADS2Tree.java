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
 * @author Julia Pichler
 */
public class ADS2Tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Node TreeToTest=BuildTree(args[0]);

        //checks if file is selected
        if (args.length < 1) {
            System.err.println("Please specifiy file");
            return;
        }
        //System.out.println("Parsin': "+args[0]);

        //creates tree from file and creates new TreeTester to test it
        TreeTester TestThisTree = new TreeTester(BuildTree(args[0]));
        boolean isAVL = TestThisTree.checkTree();
        int min, max;
        double avg;
        min = TestThisTree.findMin();
        max = TestThisTree.findMax();
        avg = TestThisTree.findAverage();

        //prints AVL status
        System.out.println("AVL: " + ((isAVL) ? "Yes" : "No"));
        //System.out.println("min: " + min + "max: " + max + "avg: "+ avg);
        //prints statistics
        System.out.format(Locale.US, "min: %d max: %d avg: %.1f ", min, max, avg);
    }

    static Node BuildTree(String filename) {
        Node h = null;

        //tries to open file
        File f = new File(filename);
        Scanner sc = null;
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ADS2Tree.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (sc == null) {
            System.err.println("Couldn't open file: " + filename);
            return null;
        }

        //if file contains int 
        if (sc.hasNextInt()) {
            //create root node
            h = new Node(sc.nextInt());
            //insert remaining ints
            while (sc.hasNextInt()) {
                h.insert(sc.nextInt());
            }
        }
        //check if creating node failed
        if (h == null) {
            System.err.println("Parsing Error");
        }
        return h;
    }

}
