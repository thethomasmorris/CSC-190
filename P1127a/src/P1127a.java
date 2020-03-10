//course: CSC190
//project: P1127a
//date: 11/27/18
//author: Thomas Morris
//purpose: get gpa

import java.util.Scanner;
public class P1127a {
    static double getGpa(){
        Scanner in = new Scanner(System.in);
        int hoursTotal = 0, pointsTotal = 0;
        String res;
        /*
        do {
            System.out.print("Enter a credit hour: ");
            int hour = in.nextInt();
            while (hour < 1 || hour > 5){
               System.out.print("Invalid entry. Credit hours must be 1 - 5. Enter a credit hour: ");
               hour = in.nextInt();
            }
            
            System.out.print("Enter grade: ");
            String grade = in.next();
            
            //while ((grade.toUpperCase().charAt(0) - '0') < 65 || (grade.toUpperCase().charAt(0) - '0') > 70 || (grade.toUpperCase().charAt(0) - '0') == 69){
                //System.out.print("Invalid entry. Hour must be a A, B, C, D, or F. Enter grade: ");
                //grade = in.next();
            //}
            
            hoursTotal += hour;
            
            switch (grade.toUpperCase().charAt(0)){
                case 'A':
                   pointsTotal += hour*4;
                   break;
                case 'B':
                   pointsTotal += hour*3;
                   break;
                case 'C':
                   pointsTotal += hour*2;
                   break;
                case 'D':
                   pointsTotal += hour;
                   break;
                default:
            }
            
            System.out.print("more course?: Y/N ");
            res = in.next();
        } while(res.toUpperCase().charAt(0) == 'Y');
        */
        System.out.print("Enter a credit hour(-1 to stop): ");
        int hour = in.nextInt();
        while (hour > 0) {
            System.out.print("Enter grade: ");
            String grade = in.next();
            
            hoursTotal += hour;
            
            switch (grade.toUpperCase().charAt(0)){
                case 'A':
                   pointsTotal += hour*4;
                   break;
                case 'B':
                   pointsTotal += hour*3;
                   break;
                case 'C':
                   pointsTotal += hour*2;
                   break;
                case 'D':
                   pointsTotal += hour;
                   break;
                default:
            }
            
            System.out.print("Enter another credit hour(-1 to stop): ");
            hour = in.nextInt();
        }
        if (hoursTotal > 0)
            return (double)pointsTotal/(double)hoursTotal;
        return 0;
    }
    
    //on break in a l oop

    static void aboutBreak(){
       for (int i = 1; i <= 10; i++)
           for (int j = 1; j <= 10; j++){
               if (i == 5 && j == 5)
                   break; //only inner for loop was broken
               System.out.println(i+", "+j);
           }
               
    }

    public static void main(String[] args) {
        System.out.println(getGpa());
        System.out.println();
        //aboutBreak();
    }
    
}
