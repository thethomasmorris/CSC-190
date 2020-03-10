//course: CSC190
//project: P1120b
//date: 11/20/18
//author: Thomas Morris
//purpose: palindrome with spaces

import java.util.Scanner;
public class P1120b {
    //ignore blanks
    //madam, dennis sinned, race car, r   ac    ec   a  r
    static boolean isPalindrome(String s){
        int l = 0, r = s.length()-1;
        
        while (l < r){
            if (s.charAt(l) == ' '){
                l++;
                continue; //go back to the beginning of loop
            }
            if (s.charAt(r) == ' '){
                r--;
                continue;
            }            
            if (s.charAt(l) != s.charAt(l)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    //between decimal and binary, use multiply2() and divide2() methods
    //from decimal to hexa, first convert to binary, and then convert binary to hexa
    //1111110101 = 1765 binary to octal, scan backwards every three digits and convert it
    //1111110101 = 3F5 binary to hexa 
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string to check if palindrome: ");
        String s = in.next();
        System.out.println(isPalindrome(s));
    } 
}
