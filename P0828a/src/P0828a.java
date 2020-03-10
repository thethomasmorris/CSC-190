//course: CSC190
//project: P0828a
//date: 08/28/18
//author: Thomas Morris
//purpose: This program shows how to convert fraction into proper type.

import java.util.Scanner;
public class P0828a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, den;
        int whole, numOut;
                
        System.out.print("Enter numerator: ");
        num = in.nextInt();
        System.out.print("Enter denominator: ");
        den = in.nextInt();
        
        whole = num/den;
        numOut = num%den;
        System.out.println(num+"/"+den+" = "+whole+" "+numOut+"/"+den);
    }
    
}