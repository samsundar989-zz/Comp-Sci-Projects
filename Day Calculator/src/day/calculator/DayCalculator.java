/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package day.calculator;

/**
 *
 * @author Samuel
 */
import java.util.Scanner;

public class DayCalculator {

    /**
     * @param args the command line arguments
     */
    private int day;
    private int month;
    private int year;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is a program that will calculate the number of days between days.");
        Scanner programstart = new Scanner(System.in);
        System.out.println("If you would like to use the program, enter 'Yes' in the console. Otherwise, enter 'No'.");
        String start = programstart.nextLine();
        if ("Yes".equals(start)) {
            System.out.println("Very well. Enter the first date in the console in the form of mm/dd/yyyy.");
            
            
        }
        else if ("No".equals(start)) {
            System.out.println("Very well. Now closing program.");
            System.exit(0);
        }
        else {
        System.out.println("Please restart program, and this time, please enter a valid input.");
        }
        
        
    
}
