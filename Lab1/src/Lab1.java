//course: CSC190                          
//project: Lab 1
//date: 8/24/18
//author: Thomas Morris
//purpose: This program reads a monetary amount in cents and prints the smallest possible number of coins equaling the amount.

import java.util.Scanner;
class Lab1 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in); 
        int amounts; //input variables
        int dollars, quarters, dimes, nickels, pennies; //output variables
        
        System.out.print("Enter an amount in cent:");
        amounts = in.nextInt();
        
        //steps for computing dollars, quarters, dimes, nickels, and pennies go here
        dollars = amounts/100;
        amounts = amounts%100;
        quarters = amounts/25;
        amounts = amounts%25;
        dimes = amounts/10;
        amounts = amounts%10;
        nickels = amounts/5;
        amounts = amounts%5;
        pennies = amounts;
        
        System.out.println("number of coins = "+ (dollars+quarters+dimes+nickels+pennies));    //prints output       
   }
}