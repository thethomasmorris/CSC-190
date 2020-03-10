//course CSC190
//project: P0821a
//date: 8/21/2018
//author: Thomas Morris
//purpose: This program shows how to use arithmetic operations.

public class P0821a {
    public static void main(String[] args) {
        System.out.println(7);
        System.out.println(7.5);
        System.out.println(-7);
        System.out.println(-7.5);
        System.out.println("EKU CSC 190"); //use " " for strings
        
        System.out.println(5+2); //7
        System.out.println(5-2); //3
        System.out.println(5*2); //10
        System.out.println(5/2); //2 - integer div
        System.out.println(5%2); //1 - mod
        
        System.out.println(5.0/2.0); //2.5
        System.out.println(5.0/2);
        System.out.println(5/2.0);
        
        //more on /, %
        System.out.println(7/2); //3
        System.out.println(-7/2); //-3
        System.out.println(7/-2); //-3
        System.out.println(-7/-2); //3
        System.out.println(7%2); //1
        System.out.println(-7%2); //-1
        System.out.println(7%-2); //1
        System.out.println(-7%-2); //-1
        
        //exercise
        System.out.println(1+2*3); //7, not 9 PEMDAS
        System.out.println(8/2*2); //8 , not 2
        System.out.println(1/3); //0, not .333333...
        System.out.println(1%3); //1
        System.out.println(1/2*3); //0
        
        //more on +
        System.out.println(190+191); //381
        System.out.println("190"+"191"); //"190191"
        System.out.println("190"+191); //"190191"
        System.out.println(190+"191"); //"190191"
        System.out.println(190+191+"195"); //"381195"
        
        //built-in methods (functions)
        System.out.println(Math.sqrt(5)); //2.23606797749979
        System.out.println(Math.sqrt(2+3*4)); //3.7416573867739413
        System.out.println(Math.sqrt(-5)); //NaN - invalid
        System.out.println(Math.pow(2,3)); //8.0
        System.out.println(Math.pow(-2,3)); //-8.0
        System.out.println(Math.pow(2,-3)); //0.125
        System.out.println(Math.pow(-2,-3)); //-0.125
        
        //floor, ciel, round
        System.out.println(Math.ceil(1.7)); //2.0 - round up
        System.out.println(Math.ceil(1.4)); //2.0
        System.out.println(Math.ceil(1.5)); //2.0
        System.out.println(Math.ceil(1.0)); //1.0
        System.out.println(Math.ceil(-1.7)); //-1.0 - round up
        System.out.println(Math.ceil(-1.4)); //-1.0
        System.out.println(Math.ceil(-1.5)); //-1.0
        System.out.println(Math.ceil(-1.0)); //-1.0
        
        System.out.println(Math.floor(1.7)); //1.0 - round down
        System.out.println(Math.floor(1.4)); //1.0
        System.out.println(Math.floor(1.5)); //1.0
        System.out.println(Math.floor(1.0)); //1.0
        System.out.println(Math.floor(-1.7)); //-2.0 - round down
        System.out.println(Math.floor(-1.4)); //-2.0
        System.out.println(Math.floor(-1.5)); //-2.0
        System.out.println(Math.floor(-1.0)); //-1.0
        
        System.out.println(Math.round(1.7)); //2 - round up
        System.out.println(Math.round(1.4)); //1- round down
        System.out.println(Math.round(1.5)); //2 - round up
        System.out.println(Math.round(1.0)); //1 - round up
        System.out.println(Math.round(-1.7)); //-2 - round down
        System.out.println(Math.round(-1.4)); //-1 - round up
        System.out.println(Math.round(-1.5)); //-1 - round up
        System.out.println(Math.round(-1.0)); //-1 - stays the same
        
        System.out.println(Math.max(1,2)); //2
        System.out.println(Math.max(Math.max(2,3),1)); //find max of 2,3,1 - 3
        System.out.println(Math.min(1,2)); //1
    }    
}