//course: CSC190                          
//project: Lab 2
//date: 8/31/18
//author: Thomas Morris
//purpose: This program reads a sentence consiting of four words and prings all of the 4! permutation of the four words in order.

import java.util.Scanner;
class Lab2 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String s, firstWord, secondWord, thirdWord, fourthWord;
        System.out.print("Enter a four word sentence: ");
        s = in.nextLine(); //input
        
        //find the first word
        int firstSpace = s.indexOf(" "); 
        firstWord = s.substring(0, firstSpace); 

        //find the second word
        int secondSpace = s.indexOf(" ", firstSpace+1);
        secondWord = s.substring(firstSpace+1, secondSpace);
        
        //find the third word
        int thirdSpace = s.indexOf(" ", secondSpace+1);
        thirdWord = s.substring(secondSpace+1, thirdSpace);
        
        //find the fourth word
        fourthWord = s.substring(thirdSpace+1);
        
        //print out each combination of the words
        System.out.println(firstWord+" "+secondWord+" "+thirdWord+" "+fourthWord);
        System.out.println(firstWord+" "+secondWord+" "+fourthWord+" "+thirdWord);
        System.out.println(firstWord+" "+thirdWord+" "+secondWord+" "+fourthWord);
        System.out.println(firstWord+" "+thirdWord+" "+fourthWord+" "+secondWord);
        System.out.println(firstWord+" "+fourthWord+" "+secondWord+" "+thirdWord);
        System.out.println(firstWord+" "+fourthWord+" "+thirdWord+" "+secondWord);
        
        System.out.println(secondWord+" "+firstWord+" "+thirdWord+" "+fourthWord);
        System.out.println(secondWord+" "+firstWord+" "+fourthWord+" "+thirdWord);
        System.out.println(secondWord+" "+thirdWord+" "+firstWord+" "+fourthWord);
        System.out.println(secondWord+" "+thirdWord+" "+fourthWord+" "+firstWord);
        System.out.println(secondWord+" "+fourthWord+" "+firstWord+" "+thirdWord);
        System.out.println(secondWord+" "+fourthWord+" "+thirdWord+" "+firstWord);
        
        System.out.println(thirdWord+" "+firstWord+" "+secondWord+" "+fourthWord);
        System.out.println(thirdWord+" "+firstWord+" "+fourthWord+" "+secondWord);
        System.out.println(thirdWord+" "+secondWord+" "+firstWord+" "+fourthWord);
        System.out.println(thirdWord+" "+secondWord+" "+fourthWord+" "+firstWord);
        System.out.println(thirdWord+" "+fourthWord+" "+firstWord+" "+secondWord);
        System.out.println(thirdWord+" "+fourthWord+" "+secondWord+" "+firstWord);
        
        System.out.println(fourthWord+" "+firstWord+" "+secondWord+" "+thirdWord);
        System.out.println(fourthWord+" "+firstWord+" "+thirdWord+" "+secondWord);
        System.out.println(fourthWord+" "+secondWord+" "+firstWord+" "+thirdWord);
        System.out.println(fourthWord+" "+secondWord+" "+thirdWord+" "+firstWord);
        System.out.println(fourthWord+" "+thirdWord+" "+firstWord+" "+secondWord);
        System.out.println(fourthWord+" "+thirdWord+" "+secondWord+" "+firstWord);
    }
}