//course: CSC190
//project: P0823a
//date: 08/28/18
//author: Thomas Morris
//purpose: This program shows how to read inputs.

import java.util.Scanner;
public class P0823a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        
        System.out.print("Enter an integer n1: ");
        n1 = in.nextInt();
        System.out.print("Enter an integer n2: ");
        n2 = in.nextInt();
        
        System.out.println(n1+" + "+n2+" = "+(n1+n2));
        System.out.println(n1+" - "+n2+" = "+(n1-n2));
        System.out.println(n1+" * "+n2+" = "+(n1*n2));
        System.out.println(n1+" / "+n2+" = "+(n1/n2));
        System.out.println(n1+" % "+n2+" = "+(n1%n2)); //only for integers
        
        double r1, r2;
        
        System.out.print("Enter a real r1: ");
        r1 = in.nextDouble();
        System.out.print("Enter a real r2: ");
        r2 = in.nextInt();
        
        System.out.println(r1+" + "+r2+" = "+(r1+r2));
        System.out.println(r1+" - "+r2+" = "+(r1-r2));
        System.out.println(r1+" * "+r2+" = "+(r1*r2));
        System.out.println(r1+" / "+r2+" = "+(r1/r2));
    }
    
}
