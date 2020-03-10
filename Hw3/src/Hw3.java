//course: CSC190
//project: Hw 3
//date: 9/13/2018
//author: Thomas Morris
//purpose: This program reads a string of length 5 and prints all substrings of the string. This program also reads an integer of 5 digits and print all “sub-numbers” of the integer.

import java.util.Scanner;

class Hw3 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String str; //input 
        int x, y; //output
        
        System.out.print("Enter a string of length 5: ");
        str = in.next();
        
        x = 0;
        y = 0;
        
        while (y<=5){
            System.out.println(str.substring(x, y));
            y++;
        }
        y=1;
        while (y<=5){
            x=1;
            System.out.println(str.substring(x, y));
            y++;
        } 
        y=2;
        while (y<=5){
            x=2;
            System.out.println(str.substring(x, y));
            y++;
        } 
        y=3;
        while (y<=5){
            x=3;
            System.out.println(str.substring(x, y));
            y++;
        } 
        y=4;
        while (y<=5){
            x=4;
            System.out.println(str.substring(x, y));
            y++;
        } 
        
        System.out.println("Enter an integer of length 5: ");
        int num = in.nextInt();
        
        System.out.println(num/10000);
        System.out.println(num/1000);
        System.out.println(num/100);
        System.out.println(num/10);
        System.out.println(num/1);   
        
        num -= (num/10000)*10000;
        System.out.println(num/1000);
        System.out.println(num/100);
        System.out.println(num/10);
        System.out.println(num/1);  
        
        num -= (num/1000)*1000;
        System.out.println(num/100);
        System.out.println(num/10);
        System.out.println(num/1); 
        
        num -= (num/100)*100;
        System.out.println(num/10);
        System.out.println(num/1); 
        
        num -= (num/10)*10;
        System.out.println(num/1); 
    }
}