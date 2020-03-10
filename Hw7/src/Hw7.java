  //course: CSC190
//project: Hw7
//date: 10/18/18
//author: Thomas Morris
//purpose: Pull out each word in a quote and print it on a seperate line.

import java.util.Scanner;

class MyQuote{
    String quote = "";
    
    void setMyQuote(String q){
        quote = q + "."; //make sure there is punctuation at the end of a sentence
    }
    
    void split(){
        String w = "";
        for (int i = 0; i<quote.length(); i++){
            if (quote.toLowerCase().charAt(i) >= 'a' && quote.toLowerCase().charAt(i) <= 'z') //convert charAt i to lower case and then make sure it falls between a-z
                w += quote.charAt(i); //add that character to w
            else{
                if (!"".equals(w)) //do not print blank lines
                    System.out.println(w); //print the full word
                w = ""; //reset w to an empty string
            }
        } 
    }
}
public class Hw7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyQuote q1 = new MyQuote();
        
        //input
        System.out.println("Enter a quote: ");
        String q = in.nextLine();
        
        //output
        q1.setMyQuote(q);
        q1.split();
    }    
}
