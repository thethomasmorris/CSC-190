//course: CSC190
//project: Hw11
//date: 11/29/18
//author: Thomas Morris
//purpose: Methods to convert between the binary, octal, decimal and hexadecimal number systems.     

import java.util.Scanner;
class Conversion {
    
    String multiply2(String n) { //return 2*n
        String r = "";
        int c = 0;
        for (int i = n.length()-1; i >= 0; i--) {
            int p = (n.charAt(i)-'0')*2+c;
            c = p/10;
            r = p%10+r;
        }
        if (c > 0)
            r = c+r;
        return r;
    }

    String divide2(String n) { //return n/2
        String r = "";
        int b = 0;
        int i = 0;
        if (n.charAt(0) < '2') {
            b = 1;
            i = 1;
        }
        for (; i < n.length(); i++) {
            int p = (n.charAt(i)-'0')+b*10;
            b = p%2;
            r += p/2;
        }
        if (r.length() == 0)
            r = "0";
        return r;
    }
    
    String add(String d1, String d2){
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
    
    String bToD(String b){
        String r = "0";
        for (int i = 0; i < b.length(); i++){
            r = multiply2(r);
            String c = ""+(b.charAt(i)-'0');
            r = add(r, c);
        }
        return r;
    }
    
    String bToO(String b){
        String r = "";
        String c = "";
        for (int i = b.length()-1; i >= 0; i--){
            c = (b.charAt(i)-'0')+c;
            if (c.length() == 3){
                r = bToD(c)+r;
                c = "";
            }
        }
        if (c.length() > 0)
            r = bToD(c)+r;
        return r;
    }
    
    String bToH(String b){
        String r = "";
        String c = "";
        for (int i = b.length()-1; i >= 0; i--){
            c = (b.charAt(i)-'0')+c;
            if (c.length() == 4){
                switch (c) {
                    case "1010":
                        r = "A"+r;
                        break;
                    case "1011":
                        r = "B"+r;
                        break;
                    case "1100":
                        r = "C"+r;
                        break;
                    case "1101":
                        r = "D"+r;
                        break;
                    case "1110":
                        r = "E"+r;
                        break;
                    case "1111":
                        r = "F"+r;
                        break;
                    default:
                        r = bToD(c)+r;
                        break;
                }
                c = "";
            }
        }
        if (c.length() > 0)
               switch (c) {
                    case "1010":
                        r = "A"+r;
                        break;
                    case "1011":
                        r = "B"+r;
                        break;
                    case "1100":
                        r = "C"+r;
                        break;
                    case "1101":
                        r = "D"+r;
                        break;
                    case "1110":
                        r = "E"+r;
                        break;
                    case "1111":
                        r = "F"+r;
                        break;
                    default:
                        r = bToD(c)+r;
                        break;
               }
        return r;
    }
    
    String dToB(String d){
        String r = "";
        while (!d.equals("0")){
            switch (d.charAt(d.length()-1)){
                case '1':
                case '3':
                case '5':
                case '7':
                case '9':
                    r = 1+r;
                    break;
                default:
                    r = 0+r;
                    break;
            }
            d = divide2(d);
        }
        if (r.equals(""))
            r = "0";
        return r;
    }
    
    String oToB(String o){
        String r = "";
        String c = "";
        for (int i = o.length()-1; i >= 0; i--){
            c = (o.charAt(i)-'0')+c;
            c = dToB(c);
            while (c.length() < 3)
                c = 0+c;
            r = c+r;    
            c = "";
        }
        int j = 0;
        if (r.equals("")){
            for (; j < r.length(); j++)
                if (r.charAt(j) != '0') {
                    break;
                }
        }
        r = r.substring(j);
        return r;
    }
    
    String hToB(String h){
        String r = "";
        String c = "";
        for (int i = 0; i < h.length(); i++){
            c = h.charAt(i)+c;
            switch(c.toUpperCase().charAt(0)){
                case 'A':
                    c = "1010";
                    break;
                case 'B':
                    c = "1011";
                    break;
                case 'C':
                    c = "1100";
                    break;
                case 'D':
                    c = "1101";
                    break;
                case 'E':
                    c = "1110";
                    break;
                case 'F':
                    c = "1111";
                    break;
                default:
                    c = dToB(c);
                    while (c.length() < 4)
                        c = 0+c;                    
            }
            r = r+c;
            c = "";
        }
        int j = 0;
        for (; j < r.length(); j++)
            if (r.charAt(j) != '0') {
                break;
            }
        r = r.substring(j);
        return r;        
    }
    void convert(int baseFrom, int baseTo, String n){
        String r = "";
        if (baseTo == baseFrom){
            r = n;
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 2 && baseTo == 10){
            r = bToD(n);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 2 && baseTo == 8){
            r = bToO(n);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 2 && baseTo == 16){
            r = bToH(n);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 10 && baseTo == 2){
            r = dToB(n);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 10 && baseTo == 8){
            r = dToB(n);
            r = bToO(r);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 10 && baseTo == 16){
            r = dToB(n);
            r = bToH(r);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 8 && baseTo == 10){
            r = oToB(n);
            r = bToD(r);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 8 && baseTo == 2){
            r = oToB(n);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 8 && baseTo == 16){
            r = oToB(n);
            r = bToH(r);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 16 && baseTo == 10){
            r = hToB(n);
            r = bToD(r);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 16 && baseTo == 2){
            r = hToB(n);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else if (baseFrom == 16 && baseTo == 8){
            r = hToB(n);
            r = bToO(r);
            System.out.println(n+" in base "+baseFrom+" = "+r+" in base "+baseTo+".");
        }
        else
            System.out.println("Invalid entry. Please try again.");
    }
    
}

public class Hw11 {    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Conversion c = new Conversion();
        
        String res;
 
        do { //menu
            System.out.println("1. conversion ");

            System.out.println("q. quit");
            
            System.out.print("select: ");
            res = in.next();
            
            switch (res.toLowerCase().charAt(0)){
                case '1':
                    System.out.print("Enter base from (2,8,10 or 16): "); 
                    int baseFrom = in.nextInt();
                    System.out.print("Enter base to (2,8,10 or 16): ");
                    int baseTo = in.nextInt();
                    System.out.print("Enter number to convert: ");
                    String n = in.next();
                    c.convert(baseFrom, baseTo, n);
                    break;
                case 'q':
                    System.out.println("Thanks for using my program!");
                    break;
                default:
                    System.out.println("Invalid!");                                
            }
        } while (res.toLowerCase().charAt(0) != 'q'); //posttest condition 
    }
}
