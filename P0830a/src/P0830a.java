//course: CSC190
//project: P0830a
//date: 08/30/18
//author: Thomas Morris
//purpose: Study strings.

import java.util.Scanner;
public class P0830a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, lname, fname; //input
                
        System.out.print("Enter your name(fname lname): ");
        // name = in.next(); //read only the first word
        name = in.nextLine();
        
        System.out.println(name);
        //print the name in format (lname, fname)
        int p = name.indexOf(" ");
        lname = name.substring(p+1);
        fname = name.substring(0, p);
        System.out.println(lname+", "+fname);
                
        String s = "abcd ab 1234 $%&"; //first character index is 0
        System.out.println(s.length()); //counts the number of characters in a string // 16
        System.out.println(s.charAt(0)); //a always give you the beginning of a string
        System.out.println(s.charAt(1)); //b provides the character at selected index value
        System.out.println(s.charAt(15)); //& //not a good way to find last character
        System.out.println(s.charAt(s.length()-1)); //& will give you the last character of any string
        System.out.println(s.substring(8, 12)); //1234 - must go 1 past the ending index you want stops early
        System.out.println(s.substring(13)); //$%& //prints everything after and including selected index value
        System.out.println(s.substring(8)); //1234 $%&
        System.out.println(s.indexOf("cd")); //2
        System.out.println(s.indexOf("b")); //1 just gives you the index position of the first matching character 
        System.out.println(s.indexOf("$%")); //13
        System.out.println(s.indexOf("bb")); //-1 not found provides -1
        System.out.println(s.indexOf("b", 2)); //second occurance of character provided
        //look up lastIndexof()
        System.out.println(s.lastIndexOf("b")); //6
    }  
}
