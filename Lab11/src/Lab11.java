//course: CSC190
//project: Lab11
//date: 11/9/18
//author: Thomas Morris
//purpose: Let a user guess a secret word.

import java.util.Scanner;
import java.util.Random;

class Lab11 {
   static void play() {
      Scanner in = new Scanner(System.in);
      Random rnd = new Random();
      String dictionary = "Bling Bromance Chillax Crunk Droolworthy Frankenfood Hater Illiterati Infomania Locavore Mankini Muggle Noob Obvs OMG Screenager Textspeak Totes Truthiness Twitterati Unfriend Upcycle Whatevs Whovian Woot";
      String word = dictionary.split(" ")[rnd.nextInt(25)].toLowerCase();
      
      //code to allow the user to guess the secret word repeatedly
      String r = "";
      for(int i = word.length(); i > 0; i--)
          r += "*";
      System.out.println(r);
      int cnt = 0;
      while (!r.equals(word)) {
        String input = "";
        System.out.print("Enter a character (a-z): ");
        input = in.next();
        cnt++;
        char chr;
        chr = input.toLowerCase().charAt(0);

        for (int i = 0; i < word.length(); i++)
            if (word.toLowerCase().charAt(i) == chr)
                r = r.substring(0, i)+chr+r.substring(i+1);
        System.out.println(r);
      }
      System.out.println("You guessed the word "+word+" correctly! It took you "+cnt+" tries.");
   }

   public static void main(String[] args) {          
       Scanner in = new Scanner(System.in);
       
       String res;
       //a loop to allow the user to play the game multiple times
       do{
           System.out.println("Guess the secret word!");
           play();
           
           System.out.print("Would you like to play again? (y or n) ");
           res = in.next();
       } while (res.toLowerCase().charAt(0) == 'y');
       System.out.println("Thank you for playing!");

   }
}

