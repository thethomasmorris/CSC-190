//course: CSC190                          
//project: Lab 3
//date: 09/07/2018
//author: Thomas Morris
//purpose: This program reads two diagonal points of an up-right rectangle and finds both the smallest circle containing the rectangle and the largest circle that can be contained in the rectangle.

import java.util.Scanner;
class Lab3 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        double p1x, p1y, p2x, p2y; //input
        double c1x, c1y, c1r, c2x, c2y, c2r; //output
        
        System.out.print("Enter p1x: ");
        p1x = in.nextDouble();
        System.out.print("Enter p1y: ");
        p1y = in.nextDouble();
        System.out.print("Enter p2x: ");
        p2x = in.nextDouble();
        System.out.print("Enter p2y: ");
        p2y = in.nextDouble();
        
        //find ((c1x, c1y), c1r), the smallest circle
        //containing ((p1x, p1y), p2x, p2y)).
        
        c1x = (p1x+p2x)/2;
        c1y = (p1y+p2y)/2;
        c1r = Math.sqrt((p2x-p1x)*(p2x-p1x)+(p2y-p1y)*(p2y-p1y))/2; //distance formula
        
        //output answer
        System.out.println("cSmall = "+"("+c1x+", "+c1y+"), "+c1r);
 
        //find ((c2x, c2y), c2r), the largest circle
        //containing ((p1x, p1y), p2x, p2y)).
        
        c2x = (p1x+p2x)/2;
        c2y = (p1y+p2y)/2;
        if (Math.sqrt((p2x-p1x)*(p2x-p1x))<Math.sqrt((p2y-p1y)*(p2y-p1y))) //compare the width and height using distance formula
            c2r = Math.sqrt((c2x-p1x)*(c2x-p1x)); //calculate distance with only x values (width)
        else
            c2r = Math.sqrt((c2y-c1y)*(c2y-c1y)); //calculate distance with only y values (height)
        
        //output answer
        System.out.println("cLarge = "+"("+c2x+", "+c2y+"), "+c2r);
    }  
}

