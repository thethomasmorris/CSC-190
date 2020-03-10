//course: CSC190
//project: P1025a
//date: 10/25/18
//author: Thomas Morris
//purpose: for statements

import java.util.Scanner;
public class P1025a {
    //evaluate arithmetic expressions.
    //case1: +,- only with single digit numbers, e = 2+4-6+2-8-9+1
    //case2: +,- only with multi-digit numbers, e = 12+4-16+234-8-90+11
    //case3: +,-, *, / only with multi-digit numbers, e = 12*5+4/2-16/2*5+23*4-8/2*4*10-90
    //parenthesis will be covered in 191
    //e = 1+2*3
    
    //case1: +,- only with single digit numbers, e = 2+4-6+2-8-9+1
    static int evalAS1(String e){ //case1
        int r = e.charAt(0)-'0'; //never use ASCII for 0 (48) bc it makes code hard to read by humans
        for (int i = 1; i <= e.length()-2; i+=2){
            if (e.charAt(i) == '+')
                r += e.charAt(i+1)-'0';
            else 
                r -= e.charAt(i+1)-'0';
        }
        return r;           
    }
    
    //case2: +,- only with multi-digit numbers, e = 12+4-16+234-8-90+11
    static int evalAS(String e){ //case2
        int r = 0;
        int n = 0;
        char op = '+';
        
        for (int i = 0; i < e.length(); i++ ){
            if (e.charAt(i) >= '0' && e.charAt(i) <= '9')
                n = (n*10)+e.charAt(i)-'0';
            else {
                if (op == '+')
                    r += n;
                else 
                    r-=n;
                n = 0;
                op = e.charAt(i);
            }
        }
        if (op == '+') //last number has been saved in n but did not get added before for loop ends
            r += n;
        else 
            r-=n;
        
        return r; 
    } 
    
    //handles only multiplication and division to be used in case 3
    static int evalMD(String e){ //case2a
        int r = 1;
        int n = 0;
        char op = '*';
        
        for (int i = 0; i < e.length(); i++ ){
            if (e.charAt(i) >= '0' && e.charAt(i) <= '9')
                n = (n*10)+e.charAt(i)-'0';
            else {
                if (op == '*')
                    r *= n;
                else 
                    r/=n;
                n = 0;
                op = e.charAt(i);
            }
        }
        if (op == '*') 
            r *= n;
        else 
            r/=n;
        
        return r; 
    }  
        
    //case3: +,-, *, / only with multi-digit numbers, e = 12*5+4/2-16/2*5+23*4-8/2*4*10-90
    static int evalE(String e){ //case3
        int r = 0;
        String n = "";
        char op = '+';
        
        for (int i = 0; i < e.length(); i++ ){
            if (e.charAt(i) == '+' || e.charAt(i) == '-'){
                if (op == '+')
                    r += evalMD(n);
                else 
                    r-= evalMD(n);
                n = "";
                op = e.charAt(i);
            }
            else 
                n += e.charAt(i);
        }
        if (op == '+')
            r += evalMD(n);
        else 
            r-= evalMD(n);

        return r; 
    }
    
    public static void main(String[] args) {
        //case 1
        System.out.println(evalAS1("2+4-6+2-8-9+1"));
        System.out.println(2+4-6+2-8-9+1);
        System.out.println(evalAS1("2"));
        System.out.println(2);
        
        //case 2
        System.out.println(12+4-16+234-8-90+11);
        System.out.println(evalAS("12+4-16+234-8-90+11"));
        System.out.println(2+4-6+2-8-9+1);
        System.out.println(evalAS("2+4-6+2-8-9+1"));
        System.out.println(2);
        System.out.println(evalAS("2"));
        
        //case 2a
        System.out.println(12345);
        System.out.println(evalMD("12345"));
        System.out.println(12*4);
        System.out.println(evalMD("12*4"));
        System.out.println(12*4/6*8*2);
        System.out.println(evalMD("12*4/6*8*2"));
        
        //case 3
        System.out.println(12*5+4/2-16/2*5+23*4-8/2*4*10-90);
        System.out.println(evalE("12*5+4/2-16/2*5+23*4-8/2*4*10-90"));
        System.out.println(2);
        System.out.println(evalE("2")); 
    }
}
