//course: CSC190
//project: P1002a
//date: 10/02/18
//author: Thomas Morris
//purpose: for statement

import java.util.Scanner;
public class P1002a {
    static void forLoop(int j){
        //print "I love Java programming" j times
        for (int i = 1; i <= j; i++) //i++ same as i += 1; and i=i+1;
            System.out.println("I love Java programming!");
        
        //add 1+2+3+4+...+100
        int sum = 0;
        for (int i = 1; i <=100; i++)
            sum += i;
        System.out.println(sum);
        
        //add 1^2+2^2+3^2+4^2...+100^2
        int pow = 0;
        for (int i = 1; i <=100; i++)
            pow += i*i;
        System.out.println(pow);
        
        //add 1+3+5+...+99 : odd numbers
        int odd = 0;
        for (int i = 1; i <=100; i+=2)
            odd += i;
        System.out.println(odd);
        
        //add 1/1+1/2+1/3+1/4+...+1/100
        double frac= 0;
        for (int i = 1; i <=100; i++)
            frac += 1.0/i;
        System.out.println(frac);
        
        //count loop
        int cnt = 0;
        for (int i = 1; i <=100; i++)
            cnt++;
        System.out.println(cnt++); //100
        
        cnt = 0;
        for (int i = 10; i <=100; i++)
            cnt++;
        System.out.println(cnt++); //91
        
        cnt = 0;
        for (int i = 100; i <=100; i++)
            cnt++;
        System.out.println(cnt++); //1
        
        cnt = 0;
        for (int i = 101; i <=100; i++)
            cnt++;
        System.out.println(cnt++); //0
        
        //decrement loop
        cnt = 0;
        for (int i = 100; i >=1; i--)
            cnt++;
        System.out.println(cnt++); //100
        
        cnt = 0;
        for (int i = 1; i <= 100; i++)
            for (j = 1; j <= 100; j++)
                cnt++;
        System.out.println(cnt++); //10000
        
        cnt = 0;
        for (int i = 1; i <= 100; i++)
            for (j = 1; j <= i; j++)
                cnt++;
        System.out.println(cnt++); //1+2+3+...+100 = 5050
        
        cnt = 0;
        for (int i = 1; i <= 100; i++)
            for (j = 1; j <= 100; j++)
                for (int k = 1; k <= 100; k++)
                    cnt++;
        System.out.println(cnt++); //100*100*100 = 1000000
        
        //study this
        cnt = 0;
        for (int i = 1; i <= 100; i++)
            for (j = 1; j <= i; j++)
                for (int k = 1; k <= j; k++)
                    cnt++;
        System.out.println(cnt++); //171700
        
        int n = 10;
        for (int i = 1; i <= n; i++){ // 5 reps
            System.out.println(i+", "+n);
            n--;
        } 
        
        /*
        n = 10;
        for (int i = 1; i <= n; i++){ // infinite loop
            System.out.println(i+", "+n);
            n++;
        } 
        */
    }
    
//print balance for n years - deposit interest rate
static void printBal(double dep, double rate, int n){
        double bal = dep;
        for (int i = 1; i <= n; i++){
            bal += bal*rate/100;
            System.out.println(bal);
        }
    }
//reverse a string. If s = "abcde", return "edcba"
//s = "abcde", r = ""
//s = "abcde", r = "a"
//s = "abcde", r = "ba"
//s = "abcde", r = "cba"
//s = "abcde", r = "dcba" 
//s = "abcde", r = "edcba"

static String reverse(String s){
    String r = "";
    for (int i = 0; i  < s.length(); i++)
        r = s.charAt(i) + r;
    return r;
}

//plot a triangle of height n
//if n = 5, print
//*
//**
//***
//****
//*****

static void printTri1(int n){
    for (int i = 1; i <= n; i++){
        for (int j = 1; j <= i; j++)
            System.out.print("*");
        System.out.println();
    }
}

//plot a triangle of height n
//if n = 5, print
//    *
//   **
//  ***
// ****
//*****

static void printTri2(int n){
    for (int i = 1; i <= n; i++){
        /*
        for (int j = n; j > i; j--)
            System.out.print(" ");
        */
        for (int j = 1; j <= n-i; j++)
            System.out.print(" ");
        for (int j = 1; j <= i; j++)
            System.out.print("*");
        System.out.println();
    }
}

//plot a triangle of height n
//if n = 5, print
//    *
//   ***
//  *****
// *******
//*********
static void printTri3(int n){
    for (int i = 1; i <= n; i++){
        for (int j = 1; j <= n-i; j++)
            System.out.print(" ");
        for (int j = 0; j < 2*i-1; j++)
            System.out.print("*");
        System.out.println();
    }
}

//formatted outputs
static void printF(){
    int n = 123;
    double d = -1234.6749;
    String s = "test line";
    
    //right justified
    System.out.println("123456789012345678901234567890");
    System.out.printf("%5d %10.2f %10s", n, d, s); //format specifier
    System.out.println();
    System.out.printf("%5d %10.2f %10s", -12, 10.5, "Java: "); 
    System.out.println();
    System.out.printf("%5d %10.2f %10s", 1234567, 101111111111.5, "Java: "); 
    System.out.println();
    
    //left justified
    System.out.println("123456789012345678901234567890");
    System.out.printf("%-5d %-10.2f %-10s", n, d, s); //format specifier
    System.out.println();
    System.out.printf("%-5d %-10.2f %-10s", -12, 10.5, "Java: "); 
    System.out.println();
}

//print multiplication table
//1*1 = 1
//1*2 = 2
//.
//1*9 = 9
//2*1 = 2
//.
//9*9 = 81
static void printM() {
    for (int i = 1; i <= 9; i++)
        for (int j = 1; j <= 9; j++)
            System.out.println(i+" * "+j+" = "+i*j);
}

//for a given string s and a character c, count how many times c appears on s
//if s = "good morning!", c = 'o', return 3, if c = 'k', return 0
static int getCount(String s, char c){
    int cnt = 0;
    for (int i = 0; i  < s.length(); i++)
        if (s.charAt(i) == c)
            cnt++;
    return cnt;
}

//remove all duplicate letters from s
//if s = "good morning!", return "god mrni!"
static String removeDup(String s){
    String r = "";
    for (int i = 0; i  < s.length(); i++)
        if (s.indexOf(s.charAt(i)) == i)
            r += s.charAt(i);
    return r;
}            

//remove all duplicate letters from s
//if s = "good morning!", return "god mrni!"
static String removeDup2(String s){
    String r = "";
    for (int i = 0; i  < s.length(); i++)
        if (r.indexOf(s.charAt(i)) == -1)
            r += s.charAt(i);
    return r;
}

//find the character that appears on s the most times (mode)
//if s = "good morning!", return 'o'
static char getMode(String s){
    char c = '\0'; //escape symbol null character c = 00000000
    int maxCnt = 0;
    for (int i = 0; i < s.length(); i++){
        //count s.charAt(i)
        int cnt = 1;
        for (int j = i+1; j < s.length(); j++)
            if (s.charAt(i) == s.charAt(j))
                cnt++;
        if (cnt > maxCnt){
            maxCnt = cnt;
            c = s.charAt(i);
        }
    }
    return c;
}


//how many characters appear multiple times on s
//if s = "good morning!", return 3 (g, o, n)
static int multiple(String s){
    int cnt = 0;
    for (int i = 0; i < s.length(); i++){
        int j; //global j control variable
        for (j = i+1; j < s.length(); j++)
             if (s.indexOf(s.charAt(i)) == i && s.charAt(i) == s.charAt(j))
                 break; //break only one loop
        if (j < s.length())
            cnt++; 
    }
    return cnt;
}

//determine if s is a palindrome ***THIS WILL BE ON TEST***
//if s = "madam", return true
static boolean isPalin(String s){ 
    //return s.equals(reverse(s)); - very slow
    for (int i = 0; i < s.length()/2; i++)
        if (s.charAt(i) != s.charAt(s.length()-1-i))
            return false;
    return true;
}

//determine if n is prime
//2, 3, 5, 7, 11, 13, 17, 19, 23...
static boolean isPrime(int n){
    int sq = (int)Math.sqrt(n);
    for (int f = 2; f <= sq; f++)
        if (n%f == 0)
            return false;
    return true;
}

//1,1,2,3,5,8,13,21,34,55,... //Fibonacci numbers
//find n-th Fibonacci number
static int getFibo(int n){
    int f1 = 1, f2 = 1;
    for (int i = 1; i <= n-2; i++){
        int t = f1+f2;
        f1 = f2;
        f2 = t;
    }
    return f2;
}

//options - which salary option is better for 20 days of work?
//option 1: $400 per day 
//option 2: 1 cent day 1, 2 cents day 2, 4 cents day 3, 8 cents day 4
static void options(){
    //option 1
    System.out.println("Option 1: $"+400*20);
    
    //option 2
    double wage = 0;
    int dpay = 1;
    for (int i = 1; i <= 20; i++){
        wage += dpay;
        dpay *= 2;
    }
    System.out.println("Option 2: $"+wage/100);
}


//QUIZ
//How many ways can 10 apples be divided into 3 kits?
//p1  p2  p3
//0   0   10
//0   1    9
//0   2    8
//0   3    7
//0   4    6
//
//0   10   0
//1   0    9
//1   1    8
//
//1   9    0
//
//10  0    0

static void combinations(){
    int cnt = 0;
    for (int p1 = 0; p1 <= 10; p1++)
        for (int p2 = 0; p2 <= 10-p1; p2++){
                System.out.println(p1+" "+p2+" "+(10-p1-p2));
                cnt++;
        }
    System.out.println(cnt);
}
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
/*
    System.out.print("On a scale of 1-100 how much do you love programming in Java? ");
    int j = in.nextInt();
    forLoop(j);
        
    printBal(1000, 2, 10);
    System.out.print("Enter a word: ");
    String word = in.next();
    System.out.println(reverse(word));
    
    System.out.println();    
    printTri1(5);
    System.out.println();
    printTri2(5);
    System.out.println();
    printTri3(5);
    System.out.println();
    printF();
    System.out.println();
    printM();
    System.out.println(getCount(word, 'o'));
    System.out.println(getCount(word, 'k'));
    System.out.println(removeDup(word));
    System.out.println(removeDup(word));
    System.out.println(removeDup(word));
    System.out.println(removeDup(word));
    System.out.println(removeDup2(word));
    System.out.println(removeDup2(word));
    System.out.println(removeDup2(word));
    System.out.println(removeDup2(word));
    
    //hw 7 help - if (s.toLowerCase().charAt(0) >= 'a' && s.toLowerCase().charAt(0) >= 'z')
    
    System.out.println(getMode(word));
    System.out.println(multiple(word));

    System.out.println(isPalin(word));
*/
/*
    //ASCII code in Java - HW Help
    System.out.println('a'); //a
    System.out.println('a'+1); //98
    System.out.println('a'-1); //96
    System.out.println((char)('a'+1)); //cast to char type - add 1 to it
    int n = in.nextInt();
    String str = "";
    char chr = 'a';
    for (int i = 0; i<26; i++)
        System.out.println(str += (char)(chr+i));
        if (str.charAt(str.length()-1) == 'z'){
            for (int j = 0; j<26; j++){
                chr = 'a';
                System.out.println(str += (char)(chr+j));
            } 
        }
*/
//System.out.println(isPrime(1000000000));
//System.out.println(getFibo(46));
//options();
combinations();
    }  
}
