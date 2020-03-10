//course: CSC190
//project: P00906b
//date: 09/06/18
//author: Thomas Morris
//purpose: if statments

import java.util.Scanner;

public class P0906b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1, n2, n3, n4, n5, max;
        
        System.out.print("Enter n1: ");
        n1 = in.nextInt();
        System.out.print("Enter n2: ");
        n2 = in.nextInt();
        System.out.print("Enter n3: ");
        n3 = in.nextInt();
        System.out.print("Enter n4: ");
        n4 = in.nextInt();
        System.out.print("Enter n5: ");
        n5 = in.nextInt();
        
        //max - find largest of n1, n2, n3, n4, n5
        
        //two way if
        /*if (n1 > n2)
            max = n1;
        else
            max = n2;*/
        
        //It is better to use all 1 way ifs
        max = n1;
        if (n2 > max)   
            max = n2;
        if (n3 > max) //1 way if
            max = n3;
        if (n4 > max) 
            max = n4;
        if (n5 > max) 
            max = n5;
        System.out.println("The max number is "+max+".");
        
        //check if n1 is even or odd
        if (n1%2 == 0)
            System.out.println("n1 is even.");
        else
            System.out.println("n1 is odd.");
        
        //>, >=, <, <=. ==, != : 6 relational operators
        //+, -, *, /, % : 5 arithmetic operators
        
        //wage caluclation
        double rate, hours; 
        double wage;
        
        System.out.print("Enter hourly rate: ");
        rate = in.nextDouble();
        System.out.print("Enter hours worked: ");
        hours = in.nextDouble();
        
        if (hours<=40)
            wage = hours*rate;
        else
            wage = (40*rate) + ((hours-40)*(rate*1.5));
        
        System.out.println("Your wage is "+wage+".");
        
        //tip - 25% tip with with minimum of $1
        
        double tip, price, percent;
        
        System.out.print("Enter meal price: ");
        price = in.nextDouble();
        System.out.print("Enter percent tip: (%)");
        percent = in.nextDouble();
        
        percent /= 100;
        tip = price*percent;
        
        if (tip<1)
            tip = 1;
        
        System.out.println("Your meal cost "+price+" so you should tip "+tip+".");
        
        //determine if integer n is a square - 1, 4, 9, 16
        int n;
        System.out.print("Enter a number: ");
        n = in.nextInt();
        
        int sq = (int)Math.sqrt(n);
        if ((sq*sq) == n)
            System.out.println(n+" is a square.");
        else
            System.out.println(n+" is not a square.");
        
        //sort2 - reaarange n1 and n2 such that n1 <= n2
        if (n1>n2){
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        System.out.println("Sorted = ["+n1+" , "+n2+"]");
        
        //sort3 - reaarange n1, n2, and n3 such that n1 <= n2 <=n3
        if (n1>n2){
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        if (n2>n3){
            int t = n2;
            n2 = n3;
            n3 = t;
        }
        if (n1>n2){
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        System.out.println("Sorted = ["+n1+" , "+n2+" , "+n3+"]");
        
        //sort4 - reaarange n1, n2, n3, and n4 such that n1 <= n2 <=n3 <= n4
        if (n1>n2){
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        if (n2>n3){
            int t = n2;
            n2 = n3;
            n3 = t;
        }
        if (n3>n4){
            int t = n3;
            n3 = n4;
            n4 = t;
        }
        if (n1>n2){
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        if (n2>n3){
            int t = n2;
            n2 = n3;
            n3 = t;
        }
        if (n1>n2){
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        System.out.println("Sorted = ["+n1+" , "+n2+" , "+n3+" , "+n4+"]");
        
        //sort5 - reaarange n1, n2, n3, n4, and n5 such that n1 <= n2 <=n3 <= n4 <= n5
        if (n1>n2){
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        if (n2>n3){
            int t = n2;
            n2 = n3;
            n3 = t;
        }
        if (n3>n4){
            int t = n3;
            n3 = n4;
            n4 = t;
        }
        if (n4>n5){
            int t = n4;
            n4 = n5;
            n5 = t;
        }
        if (n1>n2){
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        if (n2>n3){
            int t = n2;
            n2 = n3;
            n3 = t;
        }
        if (n3>n4){
            int t = n3;
            n3 = n4;
            n4 = t;
        }
        if (n1>n2){
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        if (n2>n3){
            int t = n2;
            n2 = n3;
            n3 = t;
        }
        if (n1>n2){
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        System.out.println("Sorted = ["+n1+" , "+n2+" , "+n3+" , "+n4+" , "+n5+"]");
        
        //letter grading
        double avg;
        
        System.out.print("Enter your course average (0-100): ");
        avg = in.nextDouble();
        
        char g;
        
        //multi-way if or extended if
        if (avg>=90)
            g = 'A';
        else if (avg>=80)
            g ='B';
        else if (avg>=70)
            g ='C';
        else if (avg>=60)
            g ='D';
        else
            g = 'F';
        
        if (g=='A')
            System.out.println("You made an "+g+" in CSC 190");
        else
            System.out.println("You made a "+g+" in CSC 190");
        
        //exercise
        //quan        unit price
        //1 - 100     $6.00
        //101 - 200   $5.50
        //201 - 400   $5.00
        //401 - 700   $4.50
        //701 or more $4.00
        
        //read quantity and calculate total cost
        
        //max3 again
        //method1 - using 1-way if (best way)
        max = n1;
        if (n2 > max)   
            max = n2;
        if (n3 > max) //1 way if
            max = n3;
        System.out.println(max);
        
        //method2 - using a nested if (don't do that)
        if (n1 > n2)
            if (n1 > n3)
                max = n1;
            else 
                max = n3;
        else
            if (n2 > n3)
                max = n2;
            else 
                max = n3;
        System.out.println(max);
        
        //method3 - using compound conditions (don't do that)
        if (n1 >= n2 && n1 >= n3)
            max = n1;
        if (n2 >= n1 && n2 >= n3)
            max = n2;
        if (n3 >= n1 && n1 >= n2)
            max = n3;
        System.out.println(max);
        
        //3 logical operators - &&(and) ||(or), !(not) 
    }
}
