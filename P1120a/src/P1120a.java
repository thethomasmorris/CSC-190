//course: CSC190
//project: P1120a
//date: 11/20/18
//author: Thomas Morris
//purpose: Rational Numbers 

import java.util.Scanner;
class Rational {
    int num, den;
    
    int getGcd(int n1, int n2){ //Euclid method of getting greatest common divisor
        while (n2 > 0){
            int r = n1%n2;
            n1 = n2;
            n2 = r;
        }
        return n1;    
    }
    
    Rational(int n, int d){ // one time constructor
        if (d < 0){
            d *= -1;
            n *= -1;
        }
        num = n;
        den = d;
        
        normalize();      
    }
    
    Rational(){
        num = 0;
        den = 1;
    }
    
    void setRational(int n, int d){
        if (d < 0){
            d *= -1;
            n *= -1;
        }
        num = n;
        den = d;
        
        normalize();
    }
    
    void normalize(){
        int gcd = getGcd(Math.abs(num), den);
        num = num/gcd;
        den = den/gcd;
    }
  
    Rational add(Rational r1, Rational r2){
        Rational r3 = new Rational();
        r3.num = r1.num*r2.den + r2.num*r1.den;
        r3.den = r1.den*r2.den;
        
        r3.normalize();
        return r3;
    }
    
    Rational subtract(Rational r1, Rational r2){
        Rational r3 = new Rational();
        r3.num = r1.num*r2.den - r2.num*r1.den;
        r3.den = r1.den*r2.den;
        
        r3.normalize();
        return r3;
    }  
    
    Rational multiply(Rational r1, Rational r2){
        Rational r3 = new Rational();
        r3.num = r1.num*r2.num;
        r3.den = r1.den*r2.den;
        
        r3.normalize();
        return r3;
    }
    
    Rational divide(Rational r1, Rational r2){
        Rational r3 = new Rational();
        r3.num = r1.num*r2.den;
        r3.den = r1.den*r2.num;
        
        r3.normalize();
        return r3;
    }      
    
    void readR(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = in.nextInt();
        System.out.print("Enter den: ");
        int d = in.nextInt();
        
        while (d == 0){
            System.out.println("The denominator can not be zero! Please try again.");
            System.out.print("Enter den: ");
            d = in.nextInt();
        }
        
        setRational(n,d);
    }
    
    void printR(){
        if (den == 1)
            System.out.print(num);
        else
            System.out.print(num+"/"+den);
    }
}
public class P1120a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rational r1, r2, r3;
        r1 = new Rational();
        r2 = new Rational();
        String res;
 
        do {
            System.out.println("1. add");
            System.out.println("2. subtract");
            System.out.println("3. multiply");
            System.out.println("4. divide");
            
            System.out.println("q. quit");
            
            System.out.print("select: ");
            res = in.next();
            
            switch (res.toLowerCase().charAt(0)){
                case '1':
                    r1.readR();
                    r2.readR();
                    r3 = r1.add(r1, r2);
                    r1.printR();
                    System.out.print(" + ");
                    r2.printR();
                    System.out.print(" = ");
                    r3.printR();
                    System.out.println();
                    break;
                case '2':
                    r1.readR();
                    r2.readR();
                    r3 = r1.subtract(r1, r2);
                    r1.printR();
                    System.out.print(" - ");
                    r2.printR();
                    System.out.print(" = ");
                    r3.printR();
                    System.out.println();
                    break;
                case '3':
                    r1.readR();
                    r2.readR();
                    r3 = r1.multiply(r1, r2);
                    r1.printR();
                    System.out.print(" * ");
                    r2.printR();
                    System.out.print(" = ");                    
                    r3.printR();
                    System.out.println();
                    break;
                case '4':
                    r1.readR();
                    r2.readR();
                    r3 = r1.divide(r1, r2);
                    r1.printR();
                    System.out.print(" / ");
                    r2.printR();
                    System.out.print(" = ");
                    r3.printR();
                    System.out.println();
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
