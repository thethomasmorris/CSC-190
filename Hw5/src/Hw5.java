//course: CSC190
//project: Hw 5
//date: 9/27/2018
//author: Thomas Morris
//purpose: This reads a line and a circle and then determines whether they intersect or not. If they do interest it will print out the point(s) in which they meet.

import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        //variables to store the center, radius, and two points of circle
        double cx, cy, r; 
        double p1x, p1y, p2x, p2y; 
        Scanner in = new Scanner(System.in);
        
        //collect input for circle
        System.out.print("Enter cx: ");
        cx = in.nextDouble();
        System.out.print("Enter cy: ");
        cy = in.nextDouble();
        System.out.print("Enter r: ");
        r = in.nextDouble();
        
        //collect input for line
        System.out.print("Enter p1x: ");
        p1x = in.nextDouble();
        System.out.print("Enter p1y: ");
        p1y = in.nextDouble();
        System.out.print("Enter p2x: ");
        p2x = in.nextDouble();
        System.out.print("Enter p2y: ");
        p2y = in.nextDouble();
        
        double d1 = Math.sqrt((p1x-cx)*(p1x-cx) + (p1y-cy)*(p1y-cy));
        double d2 = Math.sqrt((p2x-cx)*(p2x-cx) + (p2y-cy)*(p2y-cy));
        
        if (p1x==p2x) //vertical
            if (p1x>cx-r && p2x<cx+r && p1x<cx+r && p2x>cx-r)
                System.out.println("Two intersections.");
            else if (p1x==cx-r || p2x == cx+r || p1x==cx+r || p2x == cx-r)
                System.out.println("One intersection.");
            else
                System.out.println("No intersection.");
        else if (p1y==p2y) //horizontal
            if (p1y>cy-r && p2y<cy+r && p1y<cy+r && p2y>cy-r)
                System.out.println("Two intersections.");
            else if (p1y==cy-r || p2y == cy+r || p1y==cy+r || p2y == cy-r)
                System.out.println("One intersection.");
            else
                System.out.println("No intersection.");
        else //diagonal
            if (d1 > r && d2 > r)
                System.out.println("No intersection.");
            else if (d1 < r && d2 < r)
                System.out.println("Two intersections.");
            else
                System.out.println("One intersection.");
                
    }
}
