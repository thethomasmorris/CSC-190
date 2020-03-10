//course: CSC190
//project: P0913b
//date: 09/13/18
//author: Thomas Morris
//purpose: Take two different points and decide if they can form a vertical, horizontal, or diagonal line

import java.util.Scanner;

public class P0913b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //read two points
        double p1x, p1y, p2x, p2y;
        
        System.out.print("Enter p1x: ");
        p1x = in.nextDouble();
        System.out.print("Enter p1y: ");
        p1y = in.nextDouble();
        System.out.print("Enter p2x: ");
        p2x = in.nextDouble();
        System.out.print("Enter p2y: ");
        p2y = in.nextDouble();
        
        if (p1x == p2x)
            if (p1y == p2y)
                System.out.println("invalid");
            else
                System.out.println("vertical");
        else 
            if (p1y == p2y)
                System.out.println("horizontal");
            else
                System.out.println("diagonal");
        
        //read two lines and decide if they intersect or parallel
        double l1p1x, l1p1y, l1p2x, l1p2y;
        double l2p1x, l2p1y, l2p2x, l2p2y;
        
        System.out.print("Enter l1p1x: ");
        l1p1x = in.nextDouble();
        System.out.print("Enter l1p1y: ");
        l1p1y = in.nextDouble();
        System.out.print("Enter l1p2x: ");
        l1p2x = in.nextDouble();
        System.out.print("Enter l1p2y: ");
        l1p2y = in.nextDouble();
        
        System.out.print("Enter l2p1x: ");
        l2p1x = in.nextDouble();
        System.out.print("Enter l2p1y: ");
        l2p1y = in.nextDouble();
        System.out.print("Enter l2p2x: ");
        l2p2x = in.nextDouble();
        System.out.print("Enter l2p2y: ");
        l2p2y = in.nextDouble();
        
        //double m1 = (l1p2y - l1p1y)/(l1p2x - l1p1x);
        //double m2 = (l2p2y - l2p1y)/(l2p2x - l2p1x);
        
        if ((l1p2y - l1p1y)*(l2p2x - l2p1x) == (l2p2y - l2p1y)*(l1p2x - l1p1x));
            System.out.println("parallel");
            
        //a/b = c/d
        //(ad)/(bd) = (cb)/(db)
    }
}
