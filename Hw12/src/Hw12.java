//course: CSC190
//project: P1127b
//date: 11/27/18
//author: Thomas Morris
//purpose: expand binomial in (ax+by)^n format

import java.util.Scanner;
class Expand{
    int a, b, n, max;
    int p[]; //array to hold pascals triangle
    
    Expand(){
        
    }
    
    void setExpand(int a, int b, int n){
        this.a = a;
        this.b = b;
        this.n = n;
        this.max = n+1;
        final int MAXSIZE = this.max;
        p = new int[MAXSIZE];
        for(int i = 0; i < MAXSIZE; i++) //set p with the number of zeros needed to be replaced with pascal number
            p[i] = 0;
    }
    
    void print(){
        p[0] = 1;
        for(int i = 1; i < max; i++){
            double frac = ((double)n-(i-1))/((double)i);
            p[i] = (int) (p[i-1]*frac);
        }
        
        String r = "";
        for(int j = 0; j < max; j++){
            int num = (int) (Math.pow(a, n-j)*Math.pow(b, j)*p[j]);
            r = r+num+"x^"+(n-j)+"y^"+j+" + ";
        }
        System.out.println(r.substring(0, r.length()-3));
    }  
}
public class Hw12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Expand e = new Expand();
        String res;
        
        do {
            System.out.println("1. expand binomial");          
            System.out.println("q. quit");
            
            System.out.print("select: ");
            res = in.next();
            
            switch (res.toLowerCase().charAt(0)){
                case '1':
                    System.out.print("Enter a (ax+by)^n: ");
                    int a = in.nextInt();
                    System.out.print("Enter b (ax+by)^n: ");
                    int b = in.nextInt();
                    System.out.print("Enter n (ax+by)^n: ");
                    int n = in.nextInt();
                    e.setExpand(a, b, n);
                    e.print();
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
