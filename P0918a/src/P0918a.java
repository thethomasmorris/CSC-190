//course: CSC190
//project: P0918a
//date: 09/18/18
//author: Thomas Morris
//purpose: Notes

import java.util.Scanner;

public class P0918a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //read a circle and a point to decide if the point lies inside outside or on the circle
        double cx, cy, px, py, r;
        
        System.out.print("Enter cx: ");
        cx = in.nextDouble();
        System.out.print("Enter cy: ");
        cy = in.nextDouble();
        System.out.print("Enter r: ");
        r = in.nextDouble();
        System.out.print("Enter px: ");
        px = in.nextDouble();
        System.out.print("Enter py: ");
        py = in.nextDouble();
        
        double d = Math.sqrt((px-cx)*(px-cx) + (py-cy)*(py-cy));
        
        if (d > r)
            System.out.println("out");
        else if (d < r)
            System.out.println("in");
        else
            System.out.println("on");
        
        //read two circles and decide if they disjointed, one circle inside the other, or they overlap
        double c1x, c1y, c2x, c2y, r1, r2;
        
        System.out.print("Enter c1x: ");
        c1x = in.nextDouble();
        System.out.print("Enter c1y: ");
        c1y = in.nextDouble();
        System.out.print("Enter r1: ");
        r1 = in.nextDouble();
        System.out.print("Enter c2x: ");
        c2x = in.nextDouble();
        System.out.print("Enter c2y: ");
        c2y = in.nextDouble();
        System.out.print("Enter r2: ");
        r2 = in.nextDouble();
        
        double d1 = Math.sqrt((c2x-c1x)*(c2x-c1x) + (c2y-c1y)*(c2y-c1y));
        
        if (d1 > r1+r2)
            System.out.println("disjointed");
        else if (d1+r1 <= r2)
            System.out.println("c1 inside c2");
        else if (d1+r2 <= r1)
            System.out.println("c2 inside c1");
        else
            System.out.println("overlap");
        
        //read a rectangle and a point to decide if the point lies inside, outside, or on the rectangle
        double rp1x, rp1y, rp2x, rp2y; //top-left, bottom-right
        
        System.out.print("Enter rp1x: ");
        rp1x = in.nextDouble();
        System.out.print("Enter rp1y: ");
        rp1y = in.nextDouble();
        System.out.print("Enter rp2x: ");
        rp2x = in.nextDouble();
        System.out.print("Enter rp2y: ");
        rp2y = in.nextDouble();
        System.out.print("Enter px: ");
        px = in.nextDouble();
        System.out.print("Enter py: ");
        py = in.nextDouble();

        if (rp1x < px && px < rp2x && rp2y < py && py < rp1y) //can not be split like the statement below
            System.out.println("in");
        else if (px < rp1x || px > rp2x || py < rp2y || py > rp1y)
            System.out.println("out");
        /*Another way to write the above statement
        else if (px < rp1x)
            System.out.println("out");
        else if (px > rp2x)
            System.out.println("out");
        else if (py < rp2y)
            System.out.println("out");
        else if (py > rp1y)
            System.out.println("out");
        */
        else
            System.out.println("on");
        //read two rectangles and decide if they are disjointed, r1 inside r2, r2 inside r1, or they overlap
                
        double r1p1x, r1p1y, r1p2x, r1p2y, r2p1x, r2p1y, r2p2x, r2p2y; //top-left, bottom-right
        
        System.out.print("Enter r1p1x: ");
        r1p1x = in.nextDouble();
        System.out.print("Enter r1p1y: ");
        r1p1y = in.nextDouble();
        System.out.print("Enter r1p2x: ");
        r1p2x = in.nextDouble();
        System.out.print("Enter r1p2y: ");
        r1p2y = in.nextDouble();
        System.out.print("Enter r2p1x: ");
        r2p1x = in.nextDouble();
        System.out.print("Enter r2p1y: ");
        r2p1y = in.nextDouble();
        System.out.print("Enter r2p2x: ");
        r2p2x = in.nextDouble();
        System.out.print("Enter r2p2y: ");
        r2p2y = in.nextDouble();
        
        if (r2p2x < r1p1x || r2p1x > r1p2x || r2p1y < r1p2y || r2p2y > r1p1y)
            System.out.println("disjointed");
        else if (r1p1x >= r2p1x && r1p2x <= r2p2x)
            System.out.println("r1 inside r2");
        else if (r2p1x >= r1p1x && r2p2x <= r1p2x)
            System.out.println("r2 inside r1");
        else
            System.out.println("overlap");
    }
}
