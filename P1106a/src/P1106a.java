//course: CSC190
//project: P1106a
//date: 11/6/18
//author: Thomas Morris
//purpose: sentinel 

import java.util.Scanner;
public class P1106a {
    //factorize a given integer n.
    //if n = 600, return 600 = 2*2*2*3*5*5
    //if n = 49, return 49 = 7*7
    //if n = 31, return 31 = 31
    //n: 600 300 150   75       75      25      25      25          25          25          1
    //p: 2    2   2     2       3       3       4       5           5           5           5
    //r: ""   2*  2*2*  2*2*2*  2*2*2*  2*2*2*3 2*2*2*3 2*2*2*3*    2*2*2*3*5   2*2*2*3*5*5 2*2*2*3*5*5*
    static String factorize(int n){ /*STUDY FOR QUIZ*/
        String r = "";
        int p = 2;
        while (n > 1){
            if (n%p == 0){
                r += p+"*";
                n /= p;
            }
            else
                p++;             
        }
        return r.substring(0, r.length()-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        
        System.out.print("Enter a positive integer(-1 to stop): "); //sentinel 
        n = in.nextInt();
        while (n > 0){
            System.out.println(n+" = "+factorize(n));
            System.out.print("Enter another positive integer(-1 to stop): ");
            n = in.nextInt();
        }
        System.out.println("Thanks for using my program!");
    }
}
