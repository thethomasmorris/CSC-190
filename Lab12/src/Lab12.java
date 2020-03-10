//course: CSC190
//project: Lab 12
//date: 11/16/18
//author: Thomas Morris
//purpose: Implement two methods, one to add two long integer strings and one to multiply them.

import java.util.Scanner;
public class Lab12 {
    static String addL(String d1, String d2){
        String d3 = "";
        int i1 = d1.length()-1;
        int i2 = d2.length()-1;
        int c = 0;
        
        while (i2 >= 0 && i1 >= 0){
            int p = (d1.charAt(i1)-'0')+(d2.charAt(i2)-'0') + c;

            d3 = p%10 + d3;
            c = p/10;
            i1--;
            i2--;
        }
        while (i1 >= 0){
            int p = (d1.charAt(i1)-'0')+ c;
            d3 = p%10 + d3;
            c = p/10;
            i1--;
        }
        while (i2 >= 0){
            int p = (d2.charAt(i2)-'0') + c;
            d3 = p%10 + d3;
            c = p/10;
            i2--;
        }
        if (c > 0)
            d3 = c+d3;
        return d3;
    }
    static String mulL(String d1, String d2){
        String d3 = "";
        String pad = "";
        String d4 = "0";
        int c = 0;
        
        for (int i = d2.length()-1; i >= 0; i--){
                for (int j = d1.length()-1; j >= 0; j--){
                    int p = (d2.charAt(i)-'0')*(d1.charAt(j)-'0')+c;
                    d3 = p%10+d3;
                    c = p/10;   
                }
            if (c > 0)
                d3 = c+d3;
            c = 0;
            d3 = addL(d4, d3+pad);
            d4 = d3;
            d3 = "";
            pad += "0";
        }
        return d4;        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res, n1, n2;
        
        do { //menu
            System.out.println("a. add: ");
            System.out.println("m. multiply: ");
            System.out.println("q. quit: ");
            
            System.out.print("select: ");
            res = in.next();
            
            switch (res.toLowerCase().charAt(0)){
                case 'a':
                    System.out.print("Enter n1: "); 
                    n1 = in.next();
                    System.out.print("Enter n2: "); 
                    n2 = in.next();
                    System.out.println(n1+" + "+n2+" = "+addL(n1, n2));
                    break;
                case 'm':
                    System.out.print("Enter n1: "); 
                    n1 = in.next();
                    System.out.print("Enter n2: "); 
                    n2 = in.next();
                    System.out.println(n1+" * "+n2+" = "+mulL(n1, n2));
                    break;
                case 'q':
                    System.out.println("Thanks for using my program!");
                    break;
                default:
                    System.out.println("Invalid!");                                
            }
        } while (res.toLowerCase().charAt(0) != 'q'); 
    }   
}
