//course: CSC190
//project: P0828b
//date: 08/28/18
//author: Thomas Morris
//purpose: This program reads a 5-digit integer like 12345 and finds its reverse, 54321.

import java.util.Scanner;
public class P0828b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n; //input
        int r; //output
                
        System.out.print("Enter a 5-digit integer: ");
        n = in.nextInt();
        
        //n = 12345
        //r = 
        //n = 1234
        //r = 5
        //n = 123
        //r = 54
        //n = 12
        //r = 543
        //n = 1
        //r = 5432
        //n = 
        //r = 54321
        
        r = n%10;
        n /= 10;
        r = (r*10)+(n%10);
        n /= 10;
        r = (r*10)+(n%10);
        n /= 10;
        r = (r*10)+(n%10);
        n /= 10;
        r = (r*10)+(n%10);
        System.out.println("The reversed 5-digit number is "+r+".");
    }
    
}
