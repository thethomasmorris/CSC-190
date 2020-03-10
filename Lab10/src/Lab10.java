//course: CSC190
//project: Lab10
//date: 11/02/18
//author: Thomas Morris
//purpose: compress plain text to cipher text and decompress cipher text to plain text

import java.util.Scanner;
class RunLengthCode{
    String compress(String p){
        String c = "";
        char ch = p.charAt(0);
        int cnt = 1;
            for (int i = 1; i  < p.length(); i++){
                if (p.charAt(i) == ch)
                    cnt++;
                else{
                    if (cnt > 2){
                        c = c+ch+cnt;
                        ch = p.charAt(i);
                        cnt = 1;
                    }
                    else if (cnt == 2) {
                        c = c+ch+ch; 
                        ch = p.charAt(i);
                        cnt = 1;
                    }
                    else{
                        c = c+ch; 
                        ch = p.charAt(i);
                    }
                }
            }
            if (cnt > 2)
                c = c+ch+cnt;
            else if (cnt == 2) 
                c = c+ch+ch; 
            else
                c = c+ch;       
        return c;
    } 
    
    String decompress(String c){
        String p = "";
        int cnt = 1;
        char ch = c.charAt(0);
        for (int i = 1; i < c.length(); i++){
            if (cnt > 9 && i >= c.length()-1)
                break;
            if (c.charAt(i) >= '0' && c.charAt(i) <= '9'){
                cnt = (int)(c.charAt(i) - '0');
                for (int j = i+1; j < c.length(); j++)
                    if (c.charAt(j) >= '0' && c.charAt(j) <= '9'){
                        cnt = ((int)(c.charAt(j) - '0')) + (cnt*10);
                    }
                    else{
                        while (cnt >= 1){
                        p += ""+ch;
                        cnt--;
                        }
                        break;
                    }
            } 
            else{
                while (cnt >= 1){
                    p += ""+ch;
                    cnt--;
                }
                cnt = 1;
                ch = c.charAt(i);
            }
        }
        while (cnt >= 1){
            p += ""+ch;
            cnt--;
        }
        return p;  
    }
}
public class Lab10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RunLengthCode rlc = new RunLengthCode();
        
        System.out.print("Enter a string: ");
        String p = in.nextLine();
        String c = rlc.compress(p);
        
        System.out.println(rlc.compress(p));
        System.out.println(rlc.decompress(c));
    }  
}
