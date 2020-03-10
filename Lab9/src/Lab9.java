//course: CSC190 
//project: Lab 9
//date: 10/26/18
//author: Thomas Morris
//purpose: Print all Pythagorean triples, quadruples, quintuples, hextuples, and septuples for a given number n.

import java.util.Scanner;
class Pythagorean {
    void getTriples(int n){ 
       for (int a = 1; a <= n; a++)
           for (int b = a;  b <= n; b++)
               for (int c = b;  c <= n; c++)
                    if (a*a + b*b == c*c && 0 < a && a <= b && b <= c && c <= n)
                        System.out.println(a+","+b+","+c);
    }
    
    void getQuadruples(int n){ 
       for (int a = 1; a <= n; a++)
           for (int b = a;  b <= n; b++)
               for (int c = b;  c <= n; c++)
                   for (int d = c; d <= n; d++)
                        if (a*a + b*b + c*c == d*d && 0 < a && a <= b && b <= c && c <= d && d <= n)
                            System.out.println(a+","+b+","+c+","+d);
    }
    
    void getQuintuples(int n){ 
       for (int a = 1; a <= n; a++)
           for (int b = a;  b <= n; b++)
               for (int c = b;  c <= n; c++)
                   for (int d = c; d <= n; d++)
                       for(int e = d; e <= n; e++)
                            if (a*a + b*b + c*c + d*d == e*e && 0 < a && a <= b && b <= c && c <= d && d <= e && e <= n)
                                System.out.println(a+","+b+","+c+","+d+","+e);
    }
    void getHextuples(int n){ 
       for (int a = 1; a <= n; a++)
           for (int b = a;  b <= n; b++)
               for (int c = b;  c <= n; c++)
                   for (int d = c; d <= n; d++)
                       for(int e = d; e <= n; e++)
                           for(int f = e; f <= n; f++)
                                if (a*a + b*b + c*c + d*d + e*e == f*f && 0 < a && a <= b && b <= c && c <= d && d <= e && e <= f && f <= n)
                                    System.out.println(a+","+b+","+c+","+d+","+e+","+f);
    }
    
    void getSeptuples(int n){ 
       for (int a = 1; a <= n; a++)
           for (int b = a;  b <= n; b++)
               for (int c = b;  c <= n; c++)
                   for (int d = c; d <= n; d++)
                       for(int e = d; e <= n; e++)
                           for(int f = e; f <= n; f++)
                               for (int g = f; g <= n; g++)
                                    if (a*a + b*b + c*c + d*d + e*e+  f*f == g*g && 0 < a && a <= b && b <= c && c <= d && d <= e && e <= f && f <= g && g <= n)
                                        System.out.println(a+","+b+","+c+","+d+","+e+","+f+","+g);
    }
    
}
public class Lab9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pythagorean p = new Pythagorean();
        
        //input
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.println();
        
        //output
        System.out.println("Triples");
        p.getTriples(n);
        System.out.println();
        System.out.println("Quadruples");
        p.getQuadruples(n);
        System.out.println();
        System.out.println("Quintuples");
        p.getQuintuples(n);
        System.out.println();
        System.out.println("Hextuples");
        p.getHextuples(n);
        System.out.println();
        System.out.println("Septuples");
        p.getSeptuples(n);
    }
}
