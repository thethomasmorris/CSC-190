//course: CSC190
//project: Hw 4
//date: 9/20/2018
//author: Thomas Morris
//purpose: This program takes the lengths of four sides and decides if the sides of the given lengths can form a quadrilateral.  If they can, the program will further determine if the quadrilateral can be a rectangle.  Then the program will again, determine if the rectangle can be a square.

import java.util.Scanner;

class Hw4 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        double s1, s2, s3, s4; //input
        
        //collect side lengths from the user
        System.out.print("Enter length of s1: ");
        s1 = in.nextDouble();
        System.out.print("Enter length of s2: ");
        s2 = in.nextDouble();
        System.out.print("Enter length of s3: ");
        s3 = in.nextDouble();
        System.out.print("Enter length of s4: ");
        s4 = in.nextDouble();
        
        //first test if it can form a quadrilateral, then if it is a square or rectangle.
        if (s1+s2+s3 < s4)
            System.out.println("Invalid! Can’t form a quadrilateral.");
        else if (s1+s2+s4 < s3)
            System.out.println("Invalid! Can’t form a quadrilateral.");
        else if (s1+s4+s3 < s2)
            System.out.println("Invalid! Can’t form a quadrilateral.");
        else if (s4+s2+s3 < s1)
            System.out.println("Invalid! Can’t form a quadrilateral.");
        else if (s1==s2 && s2==s3 && s3==s4)
            System.out.println("Square");
        else if (s1==s2 && s3 == s4)
            System.out.println("Rectangle");
        else if (s2==s3 && s1 == s4)
            System.out.println("Rectangle");
        else if (s1==s3 && s2 == s4)
            System.out.println("Rectangle");
        else 
            System.out.println("Quadrilateral");
    }
}
