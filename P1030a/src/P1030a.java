//course: CSC190
//project: P1030a
//date: 10/30/18
//author: Thomas Morris
//purpose: Calendar 

import java.util.Scanner;
class Calendar {
    
    static int getLeap(int year){
        if (year%4 != 0)
            return 0;
        if (year%100 != 0)
            return 1;
        if (year%400 != 0)
            return 0;
        return 1;  
    }
    
    static String getName(int month) {
        switch (month){ 
                case 1:
                    return "January";
                case 2:
                    return "February";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";
                default:
                    return "Invalid entry.";
        }
    }
     
    int getDW(int year, int month){
       int totalDays = 0;
       for (int y = 1900; y < year; y++)
           totalDays += 365+getLeap(y);
       
       switch (month){
            case 12:
               totalDays += 30;
            case 11:      
                totalDays += 31;
            case 10:
                totalDays += 30;
            case 9:
                totalDays += 31;
            case 8:      
                totalDays += 31;
            case 7:
                totalDays += 30;
            case 6:
                totalDays += 31;
            case 5:      
                totalDays += 30;
            case 4:
                totalDays += 31;
            case 3:
                totalDays += (28+getLeap(year));
            case 2:      
                totalDays += 31;
            default:    
       }
       
       return (totalDays+1)%7;
    }
    
    int getDays(int year, int month){
        
        switch(month){
            case 2:
                return 28+getLeap(year);
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
                
        }
    }
    void printCal(int year, int month){
        System.out.println(getName(month)+" "+year);
        System.out.println(" Su Mo Tu We Th Fr Sa");
        
        int dayofWeek = getDW(year, month); //0-6
        for (int skip = 1; skip <= dayofWeek; skip++)
            System.out.print("   ");
        int cnt  = dayofWeek;
        for (int d = 1; d <= getDays(year, month); d++){
            System.out.printf("%3d", d); //d is integer % starts format specifier, 3 is number of columns
            cnt++;
            if (cnt%7 == 0)
                System.out.println();
        }
        System.out.println();
    }
}
public class P1030a {
    
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         Calendar  myCal = new Calendar();
         int year, month;
         
         //input
         System.out.print("Enter a year(1900 or after): ");
         year = in.nextInt();
         while (year < 1900){
            System.out.print("Invalid entry. Enter a year(1900 or after): ");
            year = in.nextInt();
         }
         System.out.print("Enter a month(1-12): ");
         month = in.nextInt();
         while (month < 1 || month > 12){
            System.out.print("Invalid entry. Enter a month(1-12): ");
            month = in.nextInt(); 
         }
         
         //output    
         myCal.printCal(year, month);
    }  
}

//on hw9
//n = 8176
//for multiply by 2 using for loop scanning starting with last digit
//make sure you get the carry using mod n%10 = carry/ div
//get ASCII code by - '0'
//2*n = 16352
//add last carry bit after the for loop completes - scanning starting with first digit
//n = 8176 - need to keep the remainder each time mod/div
//n/2 = 4088
//n = 18175
//n/2 = 0 - if first digit is 1 don't put zero you need to move to the next digit with the first 
//n/2 = 9087 - integer division by two so no need to worry about remainder