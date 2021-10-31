/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinPro;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class FinPro {

/*at FinPro.getMaxIndex.setIndex(getMaxIndex.java:29)
	at FinPro.getValue.getRealVal(getValue.java:36)
	at FinPro.FinPro.main(FinPro.java:33) */    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instancing the objects for both getMaxIndex and getValue
        getIndex gmi = new getIndex();
        getValue gv = new getValue();
        
        //Making a scanner to input 3 important variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of items: ");
        int numSize = scanner.nextInt();
        System.out.println("Insert capacity: ");
        int setCap = scanner.nextInt();
        System.out.println("");
        //Declaring the capacity of the Knapsack
        gv.setCapVal(setCap);
        int[] values = new int[numSize];
        int[] weight = new int[numSize];
        //Inserting variables values and weight into an array
        for (int i = 0; i < numSize; i++) {
            System.out.println("Insert " + (i+1) + "th objects' value and weight");
            values[i] = scanner.nextInt();
            weight[i] = scanner.nextInt();
        }
        //Inserting the previously made array into gv's array
        gv.setValWei(values, weight);
        System.out.println("Max Value achieved: " + gv.getRealVal());
    }
    
}
