//course: CSC190
//project: P0913a
//date: 09/13/18
//author: Thomas Morris
//purpose: This program reads an equation and finds x.

import java.util.Scanner;

public class P0913a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Ax^2 + Bx + C = 0
        double a, b, c; //input
        
        System.out.print("Enter A: ");
        a = in.nextDouble();
        System.out.print("Enter B: ");
        b = in.nextDouble();
        System.out.print("Enter C: ");
        c = in.nextDouble();
        
        
        if (a==0)
            if (b==0)
                System.out.println("A = 0 and B = 0, therefore C = "+c+".");
            else 
                System.out.println("This is a linear equations, therefore x = "+(-c/b));
        else{
            double dis = b*b-4*a*c;
            if (dis<0)
                System.out.println("Imaginary solutions.");
            else if (dis==0)
                System.out.println("reapeated root, x = "+(-b/(2*a)));
            else{
                System.out.println("x1 = "+((-b+Math.sqrt(dis))/(2*a)));
                System.out.println("x1 = "+((-b-Math.sqrt(dis))/(2*a)));
            } 
        }
        //testing data
        //0 0 1 //invalid
        //0 1 2 //linear x = -2
        //1 1 1 //imaginary solutions
        //1 -2 1 //repeated root x = 1
        //1 3 1 //x1 = -0.3819660112501051 x2 = -2.618033988749895

    }
}
