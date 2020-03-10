//course: CSC190
//project: P0920a
//date: 09/20/18
//author: Thomas Morris
//purpose: Switch & Methods

import java.util.Scanner;

public class P0920a {
    
    //method to get average
    static double getAvg(double mid1, double mid2, double f, double hw, double lab, double quiz) {
        double avg = (mid1/.8*.1)+(mid2*.15)+(f/2*.2)+(hw/2.4*.25)+(lab/3*.15)+(quiz/1.2*.15);
        return avg;
    }
    
    //method to get grade
    static char getGrade(double avg){
            //letter grading
            char g;

            //multi-way if or extended if
            if (avg>=90)
                g = 'A';
            else if (avg>=80)
                g ='B';
            else if (avg>=70)
                g ='C';
            else if (avg>=60)
                g ='D';
            else
                g = 'F';

            return g;
    }
    
    static char getGrade1(double avg){
            //letter grading
            char g;

            //switch
            switch ((int) avg/10){ //only can be used with int
                case 9: case 10:
                    g = 'A';
                    break;
                case 8:
                    g = 'B';
                    break;
                case 7:
                    g = 'C';
                    break;
                case 6:
                    g = 'D';
                    break;
                default:
                    g = 'F';
            } 
            return g;
    }
    static char getGrade2(double avg){
            switch ((int) avg/10){ //only can be used with int
                case 9: case 10:
                    return 'A';
                case 8:
                    return 'B';
                case 7:
                    return 'C';
                case 6:
                    return 'D';
                default:
                    return 'F';
            } 
    }
    
    //return the full name of each month
    static String getName(int month) {
        switch (month){ //only can be used with int
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
    //return the number of days for each month
    
    //check if a given year is leap or common
    //2018: common
    //2016: leap
    //1900: common
    //2000: leap
    static boolean isLeap(int year){
        if (year%4 != 0)
            return false;
        if (year%100 != 0)
            return true;
        if (year%400 != 0)
            return false;
        return true;
        
    }
    
    //for give state code like "KY", return state name like "Kentucky"
    static String getName(String code) {
        String name;
        switch (code.charAt(0)){
            case 'A': case 'a':
                switch (code.charAt(1)){
                    case 'L': case 'l':
                        name = "Alabama";
                        break;
                    case 'K': case 'k':
                        name = "Alaska";
                        break;
                    case 'Z': case 'z':
                        name = "Arizona";
                        break;
                    case 'R': case 'r':
                        name = "Arkansas";
                        break;
                    default:
                        name = "Unknown";
                }
            break;
            case 'C': case 'c':
                switch (code.charAt(1)){
                    case 'A': case 'a':
                        name = "California";
                        break;
                    case 'O': case 'o':
                        name = "Colorado";
                        break;
                    case 'T': case 't':
                        name = "Connecticut";
                        break;
                    default:
                        name = "Unknown";
                }
            default:
                name = "Unknown";
        }
        return name;
    }
    
    //indentation of if statments 
    
    static void indentation(){
        
        int x = 0;
        int y = 0;
        int z = 0;
        
        if (x == 1) //missing braces
            y = 1;
            z = 1; //improper tabbing
        System.out.println(z); //1 
        
        x = 0;
        y = 0;
        z = 0;
        if (x == 1){
            y = 1;
            z = 1;
        }
        System.out.println(y); //0
        
        x = 0;
        y = 0;
        z = 0;
        if (x == 1){
            if (y == 1)
                z = 1;
            else
                if (y==1)
                    z = 2;
                else z = 3;
        }
        System.out.println(y); //0
    }
    
    public static void main(String[] args) { //read, call, print. Every calculation should be done on it's own.
        Scanner in = new Scanner(System.in);
        
        //find weighted average
        
        double m1, m2, f, hw, lab, q;
        //     10, 15, 20, 25, 15, 15

        System.out.print("Enter m1 (0 - 80): ");
        m1 = in.nextDouble();
        System.out.print("Enter m2 (0 - 100):  ");
        m2 = in.nextDouble();
        System.out.print("Enter f (0 - 200):  ");
        f = in.nextDouble();
        System.out.print("Enter hw (0 - 240):  ");
        hw = in.nextDouble();
        System.out.print("Enter lab (0 - 300):  ");
        lab = in.nextDouble();
        System.out.print("Enter q (0 - 120):  ");
        q = in.nextDouble();
        
        double avg = getAvg(m1, m2, f, hw, lab, q);
        
        //char g = getGrade(avg);
        
        char g = getGrade2(avg); //uses switch
        
        if (g=='A')
            System.out.println("You made an "+g+" in CSC 190");
        else
            System.out.println("You made a "+g+" in CSC 190");  
        
        
    } 
}
