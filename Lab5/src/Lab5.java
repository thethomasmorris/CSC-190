// course: CSC190
// project: lab project 5
// date: 9/21/18
// author: Thomas Morris
// purpose:  This program randomly generates a three-digit lottery number and prompts the user to enter a three-digit number and depending on how close the user matches their number to the randomly generated one they win a specific prize.

import java.util.Scanner;
import java.util.Random;

class Lab5 {
    static String getPrize(int g1, int g2, int g3, int u1, int u2, int u3) {
        //code to determine the prize goes here
        int prize;
        String str;
        
        //prize 1
        if (g1 == u1 && g2 == u2 && g3 == u3)
            prize = 1;
        //prize 2
        else if (g1 == u1 && g2 == u3 && g3 == u2)
            prize = 2;
        else if (g1 == u2 && g2 == u1 && g3 == u3)
            prize = 2;
        else if (g1 == u2 && g2 == u3 && g3 == u1)
            prize = 2;
        else if (g1 == u3 && g2 == u2 && g3 == u1)
            prize = 2;
        else if (g1 == u3 && g2 == u1 && g3 == u2)
            prize = 2;
        //prize 3
        else if (g1 == u1 && g2 == u2)
            prize = 3;
        else if (g1 == u1 && g3 == u3)
            prize = 3;
        else if (g2 == u2 && g3 == u3)
            prize = 3;
        //prize 4
        else if (g1 == u1 && g3 == u2)
            prize = 4;
        else if (g1 == u2 && g3 == u3)
            prize = 4;
        else if (g1 == u3 && g3 == u2)
            prize = 4;
        else if (g1 == u2 && g3 == u1)
            prize = 4;
        else if (g1 == u3 && g3 == u1)
            prize = 4;
        else if (g1 == u1 && g3 == u3)
            prize = 4;
        else if (g2 == u1 && g3 == u2)
            prize = 4;
        else if (g2 == u1 && g3 == u3)
            prize = 4;
        else if (g2 == u2 && g3 == u1)
            prize = 4;
        else if (g2 == u2 && g3 == u3)
            prize = 4;
        else if (g2 == u3 && g3 == u1)
            prize = 4;
        else if (g2 == u3 && g3 == u2)
            prize = 4;
        else if (g1 == u1 && g2 == u2)
            prize = 4;
        else if (g1 == u1 && g2 == u3)
            prize = 4;
        else if (g1 == u2 && g2 == u1)
            prize = 4;
        else if (g1 == u2 && g2 == u3)
            prize = 4;
        else if (g1 == u3 && g2 == u1)
            prize = 4;
        else if (g1 == u3 && g2 == u2)
            prize = 4;
        //prize 5
        else if (g1 == u1 || g2 == u2 || g3 == u3)
            prize = 5;
        //prize 6
        else if (g1 == u1)
            prize = 6;
        else if (g1 == u3)
            prize = 6;
        else if (g2 == u1)
            prize = 6;
        else if (g2 == u3)
            prize = 6;
        else if (g3 == u1)
            prize = 6;
        else if (g3 == u2)
            prize = 6;
        else 
            prize = 0;
        
        if (prize > 0)
            str = "You get prize "+prize+".";
        else
            str = "You get no prize.";
        
        return str;
   }

   public static void main(String [] args) {

      Scanner in = new Scanner(System.in);

      Random rand = new Random();
       
      int g1, g2, g3; //3 digits generated
      int u1, u2, u3; //3 digits entered by user

      g1 = rand.nextInt(10); //generate an integer between 0 and 9
      g2 = rand.nextInt(10);
      g3 = rand.nextInt(10);
      
      System.out.println(g1+" "+g2+" "+g3);
      
      System.out.print("Enter the first digit(0-9): ");
      u1 = in.nextInt();
      System.out.print("Enter the second digit(0-9): ");
      u2 = in.nextInt();      
      System.out.print("Enter the third digit(0-9): ");
      u3 = in.nextInt();
      
      //call getPrize method and print the result.
      System.out.println(getPrize(g1, g2, g3, u1, u2, u3));
   }
}
