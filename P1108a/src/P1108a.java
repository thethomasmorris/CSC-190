//course: CSC190
//project: P1108a
//date: 11/8/18
//author: Thomas Morris
//purpose: Graphic Interface  

import java.util.Scanner;
public class P1108a {
    //convert decimal to binary 
    //base 10 base 2 base 16 base 8
    //0       0      0       0
    //1       1      1       1
    //2       10     2       2
    //3       11     3       3
    //4       100    4       4
    //5       101    5       5
    //6       110    6       6
    //7       111    7       7
    //8       1000   8       10
    //9       1001   9       11
    //10      1010   A       12
    //11      1011   B       13
    //12      1100   C       14
    //13      1101   D       15
    //14      1110   E       16
    //15      1111   F       17
    //16     10000   10      20
    
           // 128 64 32 16 8 4 2 1 
    //190     1   0  1  1  1 1 1 0
    
    //n(/2)     b
    //190   ""
    //95    "0"
    //47    "10"
    //23    "110"
    //11    "1110"
    //5     "11110"
    //2     "111110"
    //1     "0111110"
    //0     "10111110"
    static String dToB(int n){
        String b = "";
        while (n > 0){
            b = n%2 + b;
            n /= 2;     
        }
        return b;
    }
    //b             n
    //"10111110"    0
    //              2 = 0+2
    //              6 = 2+4
    //              14 = 6+8
    //              30 = 14+16
    //              62 = 30+32
    //              62 = 62+0
    //              190 = 62+128
    
    //better way - scan b forward
    //              0 initial
    //              1 = 2*0+1
    //              2 = 2*1+0
    //              5 = 2*2+1
    //              11 = 2*5+1
    //              23 = 2*11+1
    //              47 = 2*11+1
    //              95 = 2*47+1
    //              190 = 2*95+0           
    
    
    static int bToD(String b){
        int n = 0;
        for (int i = 0; i < b.length(); i++)
            n = n*2 + (b.charAt(i)-'0');
        return n;
    }
    //c    001111000
    //b1 =  10101101
    //b2 =    110110
    //b3 =  11100011
    static String addB(String b1, String b2){
        String b3 = "";
        int i1 = b1.length()-1;
        int i2 = b2.length()-1;
        int c = 0; //carry
        
        while (i2 >= 0 && i1 >= 0){
            int p = (b1.charAt(i1)-'0')+(b2.charAt(i2)-'0') + c;
            //p   b3  c
            //0   0   0
            //1   1   0
            //2   0   1
            //3   1   1
            //    %2  /2
            
            b3 = p%2 + b3;
            c = p/2;
            i1--;
            i2--;
        }
        while (i1 >= 0){
            int p = (b1.charAt(i1)-'0')+(b2.charAt(i2)-'0') + c;
            b3 = p%2 + b3;
            c = p/2;
            i1--;
        }
        while (i2 >= 0){
            int p = (b1.charAt(i1)-'0')+(b2.charAt(i2)-'0') + c;
            b3 = p%2 + b3;
            c = p/2;
            i2--;
        }
        if (c > 0)
            b3 = c+b3;
        return b3;
    }
    
    //b1 =  10101101
    //b2 =    110110
    //      00000000
    //     101011010
    //    1010110100
    
    //b3 = 
    
    static String mulB(String b1, String b2){
        String b3 = "";
        String pad = "";
        
        for (int i = b2.length()-1; i >=0; i--){
            if (b2.charAt(i) == 1)
                b3 = addB(b1, b1+pad);
            pad += 0;
        }
        return b3;       
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;
 
        do { //menu
            System.out.println("1. decimal to binary: ");
            System.out.println("2. binary to decimal: ");
            System.out.println("3. add binary: ");
            System.out.println("4. multiply binary: ");
            //System.out.println("5. divide binary: ");
            System.out.println("q. quit");
            
            System.out.print("select: ");
            res = in.next();
            
            switch (res.toLowerCase().charAt(0)){
                case '1':
                    System.out.print("Enter n: "); 
                    int n = in.nextInt();
                    System.out.println(n+" = "+dToB(n));
                    break;
                case '2':
                    System.out.print("Enter b: "); 
                    String b = in.next();
                    System.out.println(b+" = "+bToD(b));
                    break;
                case '3':
                    System.out.print("Enter b1: "); 
                    String b1 = in.next();
                    System.out.print("Enter b2: "); 
                    String b2 = in.next();
                    System.out.println(b1+" + "+b2+" = "+addB(b1,b2));
                    break;
                case '4':
                    System.out.print("Enter b1: "); 
                    b1 = in.next();
                    System.out.print("Enter b2: "); 
                    b2 = in.next();
                    System.out.println(bToD(b1)+" + "+bToD(b2)+" = "+bToD(mulB(b1,b2)));
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

