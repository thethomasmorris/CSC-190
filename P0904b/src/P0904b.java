//course: CSC190
//project: 0904b
//date: 09/04/2018
//author: Thomas Morris
//purpose: Additional notes for 09/04/18 cover data types int, long, double, float, String.

import java.util.Scanner;
public class P0904b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int, long, double, float, String
        //int, long for integers
        //double, float for reals

        int ni;
        long nl; //uses more memory to store long integers
        float nf;
        double nd;

        ni = 2147483647; //largest number that can be stored in an int - when increased to 2147483648 it must be stored in a long
        nl = 2147483648L; //add L to the end of the number to make the computer treat it as a long type in Java after you have declared the variable as a long type
        
        //float is less accurate than double
        nd = 3.141592653589793; //double stores all the values while float would not 
        nf = 3.141592653589793F; //by adding an F to the end you can store a double in a float but the computer will cut off part of the number since it can not store long decimals in float

        System.out.println("ni = "+ni);
        System.out.println("nl = "+nl);
        System.out.println("nf = "+nd);
        System.out.println("nd = "+nf);
        
        nf = (float)3.141592653589793; //do this instead of adding F to the end - either way is fine it converts the type but this way is better for variables
        System.out.println("nd = "+nf);
        
        nf = (float)nd;
        System.out.println("nd = "+nf);
    } 
}
