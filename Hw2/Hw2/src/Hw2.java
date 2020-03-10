//course: CSC190
//project: Hw 2
//date: 9/06/2018
//author: Thomas Morris
//purpose: This program reads three points that can form a triangle and then finds the smallest upright rectangle contained in the triangle.

import java.util.Scanner;
public class Hw2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int p1x, p1y, p2x, p2y, p3x, p3y, r1x, r1y, r2x, r2y;
        
        //collect input from user
        System.out.print("Enter p1x: ");
        p1x = in.nextInt();
        System.out.print("Enter p1y: ");
        p1y = in.nextInt();
        System.out.print("Enter p2x: ");
        p2x = in.nextInt();
        System.out.print("Enter p2y: ");
        p2y = in.nextInt();
        System.out.print("Enter p3x: ");
        p3x = in.nextInt();
        System.out.print("Enter p3y: ");
        p3y = in.nextInt();
        
        //find the lowest x value
        r1x = Math.min(p1x, p2x);
        r1x = Math.min(r1x, p3x);
        //find the highest y value
        r1y = Math.max(p1y, p2y);
        r1y = Math.max(r1y, p3y);
        
        //find the highest x value
        r2x = Math.max(p1x, p2x);
        r2x = Math.max(r2x, p3x);
        //find the lowest y value
        r2y = Math.min(p1y, p2y);
        r2y = Math.min(r2y, p3y);
        
        //print answer to the user
        System.out.println("R = (("+r1x+","+r1y+"),("+r2x+","+r2y+"))");
    } 
}
