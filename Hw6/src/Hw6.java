//course: CSC190
//project: Hw 6
//date: 10/11/2018
//author: Thomas Morris
//purpose: This program reads 5 integers, each of which is in the range of 1 and 13 representing a simplified poker card with no suit. It then prints the ranking of the hand with card number(s) besides the ranking.

import java.util.Scanner;

class Poker{
    int n1, n2, n3, n4, n5;
    
    void getRank(){
        //sort them n1 <= n2 <= n3 <= n4 <= n5
        if (n1 > n2) {
            int t = n1;
            n1 = n2;
            n2 = t;
        } 
        if (n2 > n3) {
            int t = n2;
            n2 = n3;
            n3 = t;
        }
        if (n3 > n4) {
            int t = n3;
            n3 = n4;
            n4 = t;
        }
	if (n4 > n5) {
            int t = n4;
            n4 = n5;
            n5 = t;
        }
        if (n1 > n2) {
            int t = n1;
            n1 = n2;
            n2 = t;
        } 
        if (n2 > n3) {
            int t = n2;
            n2 = n3;
            n3 = t;
        }
	if (n3 > n4) {
            int t = n3;
            n3 = n4;
            n4 = t;
        }
	if (n1 > n2) {
            int t = n1;
            n1 = n2;
            n2 = t;
        } 
        if (n2 > n3) {
            int t = n2;
            n2 = n3;
            n3 = t;
        }
        if (n1 > n2) {
            int t = n1;
            n1 = n2;
            n2 = t;
        } 
        
        
        if (n1 == n2 && n1 == n3 && n1 == n4)
            System.out.println("Four of a Kind ("+n1+")");
        else if (n2 == n3 && n2 == n4 && n2 == n5)
            System.out.println("Four of a Kind ("+n2+")");
        else if (n1 == n2 && n3 == n4 && n4 == n5)
            System.out.println("Full House ("+n1+", "+n3+")");
        else if (n1 == n2 && n2 == n3 && n4 == n5)
            System.out.println("Full House ("+n1+", "+n4+")");
        else if (n2 == n1+1 && n3 == n2+1 && n4 == n3+1 && n5 == n4+1)
            System.out.println("Straight ("+n5+")");
        else if (n1 == 1 && n2 == 10 && n3 == 11 && n4 == 12 && n5 == 13)
            System.out.println("Straight ("+n1+")");
        else if (n1 == 1 && n2 == 2 && n3 == 11 && n4 == 12 && n5 == 13)
            System.out.println("Straight ("+n1+")");
        else if (n1 == 1 && n2 == 2 && n3 == 3 && n4 == 12 && n5 == 13)
            System.out.println("Straight ("+n1+")");
        else if (n1 == 1 && n2 == 2 && n3 == 3 && n4 == 4 && n5 == 13)
            System.out.println("Straight ("+n1+")");
        else if (n1 == n2 && n2 == n3)
            System.out.println("Three of a Kind ("+n1+")");
        else if (n2 == n3 && n3 == n4)
            System.out.println("Three of a Kind ("+n2+")");
        else if (n3 == n4 && n4 == n5)
            System.out.println("Three of a Kind ("+n3+")");
        else if (n1 == n2 && n3 == n4)
            System.out.println("Two Pair ("+n1+", "+n3+")");
        else if (n2 == n3 && n4 == n5)
            System.out.println("Two Pair ("+n2+", "+n4+")");
        else if (n1 == n2 && n4 == n5)
            System.out.println("Two Pair ("+n1+", "+n4+")");
        else if (n1 == n2)
            System.out.println("One Pair ("+n1+")");
        else if (n2 == n3)
            System.out.println("One Pair ("+n2+")");
        else if (n3 == n4)
            System.out.println("One Pair ("+n3+")");
        else if (n4 == n5)
            System.out.println("One Pair ("+n4+")");
        else if (n1 == 1)
            System.out.println("High Card ("+n1+")");
        else
            System.out.println("High Card ("+n5+")");
    }
}

public class Hw6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Poker p1 = new Poker();
        
        //collect input
        System.out.print("Enter n1: ");
        p1.n1 = in.nextInt();
        System.out.print("Enter n2: ");
        p1.n2 = in.nextInt();
        System.out.print("Enter n3: ");
        p1.n3 = in.nextInt();
        System.out.print("Enter n4: ");
        p1.n4 = in.nextInt();
        System.out.print("Enter n5: ");
        p1.n5 = in.nextInt();
        
        //ouput
        p1.getRank();
    }  
}