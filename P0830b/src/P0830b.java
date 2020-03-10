//course: CSC190
//project: P0830a
//date: 08/30/18
//author: Thomas Morris
//purpose: 

import java.util.Scanner;
public class P0830b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, den1, num2, den2; //input
        int num3, den3;
        
        // 1/2 + 2/3 = 7/6
        // 1/2 - 2/3 = -1/6
        // 1/2 * 2/3 = 2/6
        // 1/2 / 2/3 = 3/4
        
        System.out.print("Enter num1: ");
        num1 = in.nextInt();
        System.out.print("Enter den1: ");
        den1 = in.nextInt();
        System.out.print("Enter num2: ");
        num2 = in.nextInt();
        System.out.print("Enter den2: ");
        den2 = in.nextInt();
        
        //addition
        num3 = (num1*den2)+(num2*den1);
        den3 = (den1*den2);
        System.out.println(num1+"/"+den1+" + "+num2+"/"+den2+" = "+num3+"/"+den3);
        
        //subtraction
        num3 = (num1*den2)-(num2*den1);
        den3 = (den1*den2);
        System.out.println(num1+"/"+den1+" - "+num2+"/"+den2+" = "+num3+"/"+den3);
        
        //multiplication
        num3 = num1*num2;
        den3 = den1*den2;
        System.out.println(num1+"/"+den1+" * "+num2+"/"+den2+" = "+num3+"/"+den3);
        
        //division
        num3 = num1*den2;
        den3 = den1*num2;
        System.out.println(num1+"/"+den1+" / "+num2+"/"+den2+" = "+num3+"/"+den3);
    }
}