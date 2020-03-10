//course: CSC190
//project: Hw8
//date: 10/25/18
//author: Thomas Morris
//purpose: Write a Java method that prints all lower-case alphabet strings of length n in the alphabetical order.

import java.util.Scanner;

class MyString {
    int n;
    
    void setStringLength(int n){
        this.n = n;
    }
    
    void printAlphaStr(){
        
       if (n < 1)
           System.out.println("Please enter a number greater than 1. Press F6 to try again.");
       
       for (char i = 'a'; i <= 'z'; i++){
           if (n == 1)
            System.out.println(i);
           for (char j = 'a'; j <= 'z'; j++){
                if (n == 2)
                    System.out.println(""+i+j);
                for (char k = 'a'; k <= 'z'; k++){
                    if (n == 3)
                        System.out.println(""+i+j+k);
                    for (char l = 'a'; l <= 'z'; l++){
                        if (n == 4)
                            System.out.println(""+i+j+k+l);
                        for (char m = 'a'; m <= 'z'; m++){
                            if (n == 5)
                                System.out.println(""+i+j+k+l+m);
                        }
                    }
                }
           }
        }   
    }
}
public class Hw8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyString s1 = new MyString();
        
        //input
        System.out.print("Enter the length of string: ");
        int n = in.nextInt();
        
        //output
        s1.setStringLength(n);
        s1.printAlphaStr();
    } 
}
