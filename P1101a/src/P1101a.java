//course: CSC190
//project: P1101a
//date: 11/01/18
//author: Thomas Morris
//purpose: While 

import java.util.Scanner;
public class P1101a {
    static int getSumFor(int n){
        //add 1+2+3+4+...+n
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }
    
    static int getSum(int n){
        int sum = 0;
        int i = 1;
        while (i <= n){
            sum += i;
            i++;
        }
        return sum;
    }
    
    //digitSum
    // if n = 12345, return 15
    static int getDigitSum(int n){
        int sum = 0;
        
        while (n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    
    //be a millionaire
    //given deposit and rate, find the number of years you have to survive.
    static int beMillion(double dep, double rate){
        int years = 0;
        double bal = dep;
        while (bal < 1000000){
            years++;
            bal += bal*rate/100;
        }
        return years;
    }
    
    //reverse number
    //if n = 12345, return 54321
    //exercise 
    
    //given number n, determine if n is a 2's power
    //return true for n = 1, n = 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
    static boolean isPow2Slower(int n){
        int p = 1;
        while (p < n)
            p *= 2;
        /*
        WRONG - boolean already returns true or false 
        if (p == n)
            return true;
        else
            return false;
        */
        return (p == n);
    }
    
        static boolean isPow2(int n){
        while (n%2 == 0)
            n /= 2;
        return (n == 1);
    }
        
        //for given integer n, find the largest 2's power < n
        //n = 100, return 512. if n = 512, return 256
        static int getLargest(int n){
            int p = 1;
            while (p < n)
                p *= 2;
            return p/2;
        }
        
        //for given integer n, find the largest 2's power <= n
        //n = 100, return 512. if n = 512, return 256
        
        //for given integer n, find the smallest 2's power > n
        //n = 1000, return 1024. if n = 512, return 1024
        
        //for given integer n, find the smallest 2's power >= n
        //n = 1000, return 1024. if n = 512, return 512
        
        //determine if n is a Fibonacci number (1 1 2 3 5 8 13...)
        
        static boolean isFibo(int n){
            int f1 = 1, f2 = 1;
            while (f2 < n){
                int t = f1 + f2;
                f1 = f2;
                f2 = t;
            }
            return f2 == n;
        }
        
        
        
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = in.nextInt();
        /*
        System.out.println(getSumFor(n));
        System.out.println(getSum(n));
        System.out.println(getDigitSum(n));
        System.out.println(beMillion(900000,5));
        System.out.println(isPow2(n));
        System.out.println(getLargest(n));
*/
        if (isFibo(n))
            System.out.println("Your number is fibo");
        else
            System.out.println("Your number is not fibo");
    }  
}
