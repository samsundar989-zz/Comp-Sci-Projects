/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem.no.pkg2;

/**
 *
 * @author Samuel
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
        
public class ProblemNo2 {

    /**
     * @param args the command line arguments
     
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner arrayNum = new Scanner(System.in);
        Scanner numbers = new Scanner(System.in);
        Scanner fileName = new Scanner(System.in);
        
        System.out.println("Enter number of spaces to be created in the array:");
        int arraySpace = arrayNum.nextInt();
        int[] array = new int[arraySpace];
        
        
        for(int i=0;i < arraySpace;i++) {
            System.out.println("Enter next number: ");
            array[i] = numbers.nextInt();
        } 
        
        System.out.println("Here are the numbers you have given, in the order you gave them in:\n" + Arrays.toString(array));
        
        int[] sortedArray = new int[array.length];
        for(int i=0;i<array.length;i++) {           
           sortedArray[i] = array[i];
           for (int x=0;x<sortedArray.length;x++) {
               if(sortedArray[x]>sortedArray[i]) {
                   int y = sortedArray[x];
                   sortedArray[x] = sortedArray[i];
                   sortedArray[i] = y;
               }
           }
           }
        
       
        
        System.out.println("Here are the numbers you have given, sorted in ascending numerical order:\n" + Arrays.toString(sortedArray));
        
        
        Integer[] intArray = new Integer[sortedArray.length];
        for (int i = 0; i < sortedArray.length; i++) {
            intArray[i] = sortedArray[i];
        }
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("Here are the numbers you have given, sorted in descending numerical order:\n" + Arrays.toString(intArray));
        
        System.out.println("Enter a file name to be saved to:");
        String filePath = "C:\\Users\\Samuel\\Documents";
        String namefile = fileName.nextLine();
        
        PrintWriter file = new PrintWriter(namefile);
        file.println("Here are the numbers you have given, in the order you gave them in:\n" + Arrays.toString(array));
        file.println("Here are the numbers you have given, sorted in ascending numerical order:\n" + Arrays.toString(sortedArray));
        file.println("Here are the numbers you have given, sorted in descending numerical order:\n" + Arrays.toString(intArray));
        }
    


