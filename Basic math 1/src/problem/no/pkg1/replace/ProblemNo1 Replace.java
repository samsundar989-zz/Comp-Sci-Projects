/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem.no.pkg1.replace;

/**
 *
 * @author Samuel
 */
import java.util.Scanner;

public class ProblemNo1Replace {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numbers = new Scanner(System.in);
       
        System.out.println("Enter the first number to be switched:");
        float firstNumber = numbers.nextFloat();
           
        System.out.println("Enter the second number to be switched:");
        float secondNumber = numbers.nextFloat();
       
        
        System.out.println("Here are the numbers switched:\n"+ secondNumber + "\n" + firstNumber );
        
    }
    
}
