//course: CSC190
//project: Hw 1
//date: 8/30/2018
//author: Thomas
//purpose: This program reads a length in (km, m, cm, mm) and converts it to (miles, yards, feet, inches).

import java.util.Scanner;
class Hw1 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int km, m, cm, mm, mmCopy; //input variables
        int miles, yards, feet, inches; //output variables

        System.out.print("Enter kilometer part of input: ");
        km = in.nextInt();
        System.out.print("Enter meter part of input: ");
        m = in.nextInt();
        System.out.print("Enter centimeter part of input: ");
        cm = in.nextInt();
        System.out.print("Enter millimeter part of input: ");
        mm = in.nextInt();
        mmCopy = mm; //create a copy of mm so we can output the original value since original value will be used to convert
        
        //steps for computing miles, yards, feet, inches go here
        mm += (km*1000000)+(m*1000)+(cm*10); //change the user input to only mm
        inches = (int)(mm*0.0393701); //convert mm to inches
        feet = inches/12; //divide by 12 to get number of feet
        inches %= 12; //remainder is inches left over
        yards = feet/3; //divide by 3 to get number of yards
        feet %= 3; //remainder is feet left over after dividing
        miles = yards/1760; //divide by 1760 to get miles
        yards %= 1760; //remainder is yards left over after dividing
        
        System.out.println("("+km+" km, "+m+" m, "+cm+" cm, "+mmCopy+" mm) = "+"("+miles+" miles, "+yards+" yards, "+feet+" feet, "+inches+" inches)"); //print answer to user          
   }
}