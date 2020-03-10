//course: CSC190 
//project: Lab 8
//date: 10/19/18
//author: Thomas Morris
//purpose: Implement indexOf(String s) and lastIndexOf(String s) methods without using the built-in ones available in Java String class.

import java.util.Scanner;
class MyString {
    String s;
    
    MyString() {
        s = "";
    }
    
    MyString(String str) {
        s = str;
    }
    
    void setMyString(String str) {
        s = str;
    }
    
    String getMyString() {
        return s;
    }
    
    //return the index within this.s of the first occurrence of s.
    //return -1 when s is not found on this.s.
    //if this.s = "aabababb", s = "aba", return 1
    //if this.s = "aabababb", s = "abaa", return -1
    int indexOf(String s) {
        int cnt = 0;
        for (int i = 0; i < this.s.length() - s.length()+1; i++) 
            for (int j = 0; j < s.length(); j++) {
                if (this.s.charAt(j+i) != s.charAt(j)){
                    cnt = 0;
                    break;
                }
                else
                    cnt++;
            if (cnt == s.length())
                return i;
            }
        return -1;
    }
    
    //return the index within this.s of the last occurrence of s.
    //return -1 when s is not found on this.s.
    //if this.s = "aabababb", s = "aba", return 3
    //if this.s = "aabababb", s = "abaa", return -1
    int lastIndexOf(String s) {
        int i = this.s.length()-1;
        int j = s.length()-1;

        for(; j >= 0; j--) {
            for(; i >= 0; i--) {
                if(this.s.charAt(i) == s.charAt(j)) {
                    if(j == 0)
                        return i;
                    if(i != 0)
                        i--;
                break;
            } 
            else if(j != s.length()) {
                j = s.length()-1;
            }
            }
        }
        return -1;
    }
}
            


class Lab8 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        MyString myS = new MyString();
        
        String s1, s2; //input variables
        
        System.out.print("Enter string 1:");
        s1 = in.nextLine();
        System.out.print("Enter string 2:");
        s2 = in.nextLine();
        
        myS.setMyString(s1);
        
        int p = myS.indexOf(s2);
        if (p == -1)
            System.out.println(s2+" not found on "+myS.getMyString());
        else
            System.out.println(s2+" found at "+p+" on "+myS.getMyString());
        
        p = myS.lastIndexOf(s2);
        if (p == -1)
            System.out.println(s2+" not found on "+myS.getMyString());
        else
            System.out.println(s2+" found at "+p+" on "+myS.getMyString());                 
    }
}
