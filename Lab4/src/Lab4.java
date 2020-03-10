//course: CSC190                          
//project: Lab 4
//date: 09/14/2018
//author: Thomas Morris
//purpose: This program reads a sentence consisting of 5 lower-case words and finds the longest word then rearranges them in alphabetical order. 

import java.util.Scanner;
class Lab4 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        
        String s;
        String w1, w2, w3, w4, w5;
        String longest;
        
        System.out.println("Enter a string consisting of 5 words: ");
        s = in.nextLine();
        
        //break s into w1, w2, w3, s4, w5
        
        int firstSpace = s.indexOf(" ");
        w1 = s.substring(0, firstSpace);
        
        int secondSpace = s.indexOf(" ", firstSpace+1);
        w2 = s.substring(firstSpace+1, secondSpace);
        
        int thirdSpace = s.indexOf(" ", secondSpace+1);
        w3 = s.substring(secondSpace+1, thirdSpace);
        
        int fourthSpace = s.indexOf(" ", thirdSpace+1);
        w4 = s.substring(thirdSpace+1, fourthSpace);
        
        w5 = s.substring(fourthSpace+1);
        
        longest = w1;
        if (w2.length() > longest.length())   
            longest = w2;
        if (w3.length() > longest.length()) 
            longest = w3;
        if (w4.length() > longest.length()) 
            longest = w4;
        if (w5.length() > longest.length())
            longest = w5;

        System.out.println(longest);
        
        //sort w1, w2, w3, w4, w5 using .compareTo() method
        
        if (w1.compareTo(w2) > 0){ 
            String t = w1;      
            w1 = w2;            
            w2 = t;
        }
        if (w2.compareTo(w3) > 0){ 
            String t = w2;      
            w2 = w3;            
            w3 = t;
        }
        if (w3.compareTo(w4) > 0){ 
            String t = w3;      
            w3 = w4;            
            w4 = t;
        }
        if (w4.compareTo(w5) > 0){ 
            String t = w4;      
            w4 = w5;            
            w5 = t;
        }
        if (w1.compareTo(w2) > 0){ 
            String t = w1;      
            w1 = w2;            
            w2 = t;
        }
        if (w2.compareTo(w3) > 0){ 
            String t = w2;      
            w2 = w3;            
            w3 = t;
        }
        if (w3.compareTo(w4) > 0){ 
            String t = w3;      
            w3 = w4;            
            w4 = t;
        }
        if (w1.compareTo(w2) > 0){ 
            String t = w1;      
            w1 = w2;            
            w2 = t;
        }
        if (w2.compareTo(w3) > 0){ 
            String t = w2;      
            w2 = w3;            
            w3 = t;
        }
        if (w1.compareTo(w2) > 0){ 
            String t = w1;      
            w1 = w2;            
            w2 = t;
        }
        s = w1+" "+w2+" "+w3+" "+w4+" "+" "+w5;
        System.out.println(s);
    }
    
}
