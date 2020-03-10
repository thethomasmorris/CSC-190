//course: CSC190
//project: Lab14
//date: 12/7/2018
//author: Thomas Morris
//purpose: To read a sentence and store each word in an array, print a list of those stored words, and sort the words in alapbetical order.

import java.util.Scanner;
import java.util.Random;

class WordList {
    final int MAXSIZE = 20;
    String list[];
    int n;
    
    WordList() {
        list = new String[MAXSIZE];        
        n = 0;
    }
    
    void read() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String s = in.nextLine(); 
        n = 0;
        String word = "";
        for(int i = 0; i < s.length(); i++){
            if(s.toLowerCase().charAt(i) >= 'a' && 'z' >= s.toLowerCase().charAt(i))
                word += s.charAt(i);
            else{
                if(!word.equals("")){
                    list[n] = word;
                    n++;
                    word = "";
                }
            }
        }
        if(!word.equals("")){
            list[n] = word;
            n++;
            word = "";
        }
    }
    
    void print() {
        for (int i = 0; i < n; i++)
            System.out.println(list[i]);
    }
    
    void sort() {
        for (int i = 1; i < n; i++){
            String t = list[i];
            int j;
            for (j = i-1; j >= 0; j--)
                if (list[j].toLowerCase().compareTo(t) >= 0)
                    list[j+1] = list[j];
                else 
                    break;
            list[j+1] = t;
        }
        
    } 
}

public class Lab14 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordList myL = new WordList();
        String res;
        
        do {
            System.out.println("r. read words");
            System.out.println("p. print words");
            System.out.println("s. sort words");

            System.out.println("q. quit");
            
            System.out.print("select: ");
            res = in.next(); 
            in.nextLine(); 
            
            switch (res.toLowerCase().charAt(0)) {
                case 'r':
                    myL.read();
                    break;
                case 'p':
                    myL.print();
                    break;
                case 's':
                    myL.sort();
                    break;
                case 'q':
                    System.out.println("Thanks for using my program");
                    break;
                default:
                    System.out.println("invalid!");       
            }          
        } while (res.toLowerCase().charAt(0) != 'q');  
    }
}