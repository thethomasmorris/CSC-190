//course: CSC190
//project: 0904a
//date: 09/04/2018
//author: Thomas Morris
//purpose: Review and notes for 09/04/18.

import java.util.Scanner;
public class P0904a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //******* REVIEW *******//

        //quiz2 - answer to question 2
        int num = 123456;
        int numCopy = num; //make a copy to dislay starting value
        num /= 10; //num = 12345
        int r = num%10; // r = 5
        num /= 100; //num = 123
        r = (r*10) + (num%10); // r = 53
        num /= 100; //num = 1
        r = (r*10) + num;

        System.out.println("The odd reverse of "+numCopy+" is "+r+"."); //print answer to user

        String s = "abcd ab 1234 $%&";
        //look up lastIndexOf()
        System.out.println(s.lastIndexOf("b")); //6 
        System.out.println(s.lastIndexOf("b", 5)); //1
        System.out.println(s.lastIndexOf("b", 0)); //-1

        //hw1 answer
        int km, m, cm, mm, mmCopy; //input variables
        int miles, yards, feet, inches; //output variables

        System.out.print("Enter kilometer part of input: ");
        km = in.nextInt();
        System.out.print("Enter meter part of input: ");
        m = in.nextInt();
        System.out.print("Enter centimeter part of input: ");
        cm = in.nextInt();
        System.out.print("Enter millimeter part of input: ");
        mm = in.nextInt();
        mmCopy = mm; //create a copy of mm so we can output the original value since original value will be used to convert

        //steps for computing miles, yards, feet, inches go here
        mm += (km*1000000)+(m*1000)+(cm*10); //change the user input to only mm
        inches = (int)(mm*0.0393701); //convert mm to inches
        feet = inches/12; //divide by 12 to get number of feet
        inches %= 12; //remainder is inches left over
        yards = feet/3; //divide by 3 to get number of yards
        feet %= 3; //remainder is feet left over after dividing
        miles = yards/1760; //divide by 1760 to get miles
        yards %= 1760; //remainder is yards left over after dividing

        System.out.println("("+km+" km, "+m+" m, "+cm+" cm, "+mmCopy+" mm) = "+"("+miles+" miles, "+yards+" yards, "+feet+" feet, "+inches+" inches)"); //print answer to user

        //make sure you are naming your files in the format uppercase first letter and lowercase everything else (ex. Hw1 not HW1)

        //******* NOTES *******//
        //final double PI = 3.14159; //define Pi so you don't have to type it and that you can make it more precise if it is needed
        //final makes it so that PI can not be changed later in the program, constant

        double rad; //input
        double area, circum; //output

        System.out.print("Enter radius: ");
        rad = in.nextDouble();

        area = Math.PI*rad*rad; //do not use Math.pow because it makes program slower
        circum = 2*Math.PI*rad; //if you have to use a number multiple times define it and give it symbolic name
        //can use either the PI we defined or the more accurate Math.PI built in library 
        System.out.println("The circumference of a circle with a radius of "+rad+" is "+circum+" and the area equals "+area+".");

        double p1x, p1y, p2x, p2y, p3x, p3y; //input
        double areaTri; //output

        System.out.print("Enter p1x: ");
        p1x = in.nextDouble();
        System.out.print("Enter p1y: ");
        p1y = in.nextDouble();
        System.out.print("Enter p2x: ");
        p2x = in.nextDouble();
        System.out.print("Enter p2y: ");
        p2y = in.nextDouble();
        System.out.print("Enter p3x: ");
        p3x = in.nextDouble();
        System.out.print("Enter p3y: ");
        p3y = in.nextDouble();

        //Heron's formula

        //1st gather the distance between each point using distance formulat
        double d12 = Math.sqrt((p2x-p1x)*(p2x-p1x)+(p2y-p1y)*(p2y-p1y));
        double d23 = Math.sqrt((p3x-p2x)*(p3x-p2x)+(p3y-p2y)*(p3y-p2y));
        double d13 = Math.sqrt((p3x-p1x)*(p3x-p1x)+(p3y-p1y)*(p3y-p1y));

        double s1 = (d12+d23+d13)/2;
        areaTri = Math.sqrt((s1*(s1-d12))*(s1-d23)*(s1-d13));
        System.out.print("Trainagle area: "+areaTri);
    }
}
