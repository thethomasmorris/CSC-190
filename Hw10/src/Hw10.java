//course: CSC190
//project: Hw10
//date: 11/8/18
//author: Thomas Morris
//purpose:  Implement the method plotTriangle to plot a triangle that counts up vertically.

import java.util.Scanner;

public class Hw10 {
    static void plotTriangle(int size, int seed){
        String seed1 = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {    
                System.out.print(" ");
                seed++;
            }
            for (int j = i; j < size; j++) {
                seed += j;
                seed += seed/10;
                seed %= 10; 
                switch (seed){
                    case 0:
                        seed =1;
                        break;
                    default:
                        break;
                }    
                System.out.print(seed);
                seed1 += seed;
            }
            System.out.println();
            seed = seed1.charAt(i)-'0';

        }
    }
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int size, seed;
        String res;
        
        do {
            System.out.print("Enter a positive integer for size: ");  
            size = in.nextInt();
            System.out.print("Enter a positive integer 1-9 for seed: ");  
            seed = in.nextInt();
            plotTriangle(size, seed);
            
            System.out.print("Continue?(y or n): ");
            res = in.next();
        } while (res.toLowerCase().charAt(0) == 'y');
        
        System.out.println("Thanks for using my program!");
    }
    
}
