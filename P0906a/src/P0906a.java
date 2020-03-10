//course: CSC190
//project: P00906a
//date: 09/06/18
//author: Thomas Morris
//purpose: Excerises with different data types, math review. One of these problems will be on quiz tomorrow.

import java.util.Scanner;
public class P0906a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double amount;
        int d, c, iamount;
        
        System.out.print("Enter amount($8.50): ");
        amount = in.nextDouble();
        
        iamount = (int)(amount*100);
        d = iamount/100;
        c = iamount%100;
        
        System.out.println(d+" dollars and "+c+" cents.");
        
        //exercise 1
        int mAge, wAge;
        
        System.out.print("Enter a man's age: ");
        mAge = in.nextInt();
        wAge = (mAge/2) + 7;
        System.out.println("Your ideal wife's age is "+wAge+" according to Plato.");
        
        //exercise 2
        int weight, height, bmi;
        
        System.out.print("Enter your weight in pounds: ");
        weight = in.nextInt();
        System.out.print("Enter your height in inches: ");
        height = in.nextInt();
        bmi = (int)Math.round((weight*703.0)/(height*height));
        System.out.println("Your bmi is "+bmi+"."); 
        
        //exercise 3
        double ounce, cost;
        
        System.out.print("Enter the weight of your letter in ounces: ");
        ounce = in.nextDouble();
        cost = Math.ceil((ounce-1))*30 + 25;
        System.out.println("The cost of your letter is "+cost+" cents.");
    }
}
