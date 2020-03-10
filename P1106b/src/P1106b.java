//course: CSC190
//project: P1106a
//date: 11/6/18
//author: Thomas Morris
//purpose: Euclid's GCD & Do While Loop  

import java.util.Scanner;
public class P1106b {
    //greatest common divisor by Euclid
    //n1 = 105 = 3*5*7
    //n2 = 90 = 2*3*3*5
    //gcd(n1, n2) = 3*5 = 15
    //    n1,  n2        n1  n2        n1 n2
    //gcd(105, 90) = gcd(90, 15) = gcd(15, 0) = 15
    static int gcd(int n1, int n2){ /*STUDY FOR QUIZ OR TEST*/
        while (n2 > 0){ //pretest
            int r = n1%n2;
            n1 = n2;
            n2 = r;   
        }
        return (n1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        String res;
 
        do { //does not need a condition at the top - minimum # of repetitions is 1
            System.out.print("Enter n1: "); 
            n1 = in.nextInt();
            System.out.print("Enter n2: ");
            n2 = in.nextInt();
            
            System.out.println("GCD("+n1+","+n2+") = "+gcd(n1, n2));
            
            System.out.print("Continue?(y or n): ");
            res = in.next();
        } while (res.toLowerCase().charAt(0) == 'y'); //posttest condition 
        
        System.out.println("Thanks for using my program!");
    }
}
