//course: CSC190
//project: Lab7
//date: 10/11/18
//author: Thomas Morris
/*purpose: Declare and implement a class named Substrings that will contain methods to print all substrings of S in the following patterns:
If S = "abcd":
printSub1 will print "a", "ab", "abc", "abcd", "b", "bc", "bcd", "c", "cd", "d",
printSub2 will print "a", "ab", "b", "abc", "bc", "c", "abcd", "bcd", "cd", "d",
printSub3 will print "d", "c", "b", "a", "cd", "bc", "ab", "bcd", "abc", "abcd", and
printSub4 will print "abcd", "bcd", "abc", "cd", "bc", "ab", "d", "c", "b", "a". 
*/

import java.util.Scanner;

class Substring {
    
    //print "a", "ab", "abc", "abcd", "b", "bc", "bcd", "c", "cd", "d"
    void printSub1(String s){
        for (int i = 0; i  < s.length(); i++)
            for (int j = i+1; j <= s.length(); j++)
                System.out.println(s.substring(i,j));
    }
    
    //print "a", "ab", "b", "abc", "bc", "c", "abcd", "bcd", "cd", "d"
    void printSub2(String s){
        for (int j = 1; j  <= s.length(); j++)
            for (int i = 0; i < j; i++)
                System.out.println(s.substring(i,j));
    }
    
    //print "d", "c", "b", "a", "cd", "bc", "ab", "bcd", "abc", "abcd"
    void printSub3(String s){
        for (int len = 1; len > 0; len++)
            for (int i = s.length()-len; i >= 0; i--)
                System.out.println(s.substring(i,i+len));
    } 
    
    //print "abcd", "bcd", "abc", "cd", "bc", "ab", "d", "c", "b", "a"
    void printSub4(String s){
        for (int len = s.length(); len > 0; len--)
            for (int i = s.length()-len; i >= 0; i--)
                System.out.println(s.substring(i,i+len));
    }
}

public class Lab7 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Substring s1 = new Substring();
    
    //input
    System.out.println("Enter a string: ");
    String q = in.next();
    
    //output
    System.out.println(); //added blank lines and headings for readability
    System.out.println("printSub1");
    s1.printSub1(q);
    System.out.println();
    System.out.println("printSub2");
    s1.printSub2(q);
    System.out.println();
    System.out.println("printSub3");
    s1.printSub3(q);
    System.out.println();
    System.out.println("printSub4");
    s1.printSub4(q);
    
        
    }    
}
