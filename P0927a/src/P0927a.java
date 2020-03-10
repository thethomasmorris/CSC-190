//course: CSC190
//project: P0927a
//date: 09/27/18
//author: Thomas Morris
//purpose: Setting up classes

import java.util.Scanner;

class Circle {
    double cx, cy, r; //global variable within this class
    
    //default constructor
    Circle(){

    }
    
    //constructor
    Circle(double x, double y, double r){
        cx = x;
        cy = y;
        this.r = r;
    }
    
    Circle(double r){
        this.r = r;
    }
    
    //can use multiple methods with the same name as long as parimeters are different
    void setCircle(double r){
        this.r = r;
    }
    void setCircle(double x, double y, double r){
        cx = x;
        cy = y;
        this.r = r;
    }
    double getArea() {
        return Math.PI*r*r;
    }
    double getCircumference() {
        return 2*Math.PI*r;
    }
    void plot() {
        System.out.println("Under construction!");
    }
}
class Triangle {
    double p1x, p1y, p2x, p2y, p3x, p3y;
    
    void setTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        p1x = x1;
        p1y = y1;
        p2x = x2;
        p2y = y2;
        p3x = x3;
        p3y = y3;
    }
    
    double getArea() {
        double d12 = Math.sqrt((p2x-p1x)*(p2x-p1x) + (p2y-p1y)*(p2y-p1y));
        double d23 = Math.sqrt((p3x-p2x)*(p3x-p2x) + (p3y-p2y)*(p3y-p2y));
        double d31 = Math.sqrt((p1x-p3x)*(p1x-p3x) + (p1y-p3y)*(p1y-p3y));
        
        double s = (d12+d23+d31)/2;
        
        return Math.sqrt(s*(s-d12)*(s-d23)*(s-d31));
    }
    
    double getPerimeter(){
        double d12 = Math.sqrt((p2x-p1x)*(p2x-p1x));
        double d23 = Math.sqrt((p3x-p2x)*(p3x-p2x));
        double d31 = Math.sqrt((p1x-p3x)*(p1x-p3x));
        
        return d12+d23+d31;
    }
}
public class P0927a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Circle c1 = new Circle(); //object
        c1.setCircle(0,0,1);
        System.out.println("Area = "+c1.getArea());
        
        Circle c2 = new Circle();
        c2.setCircle(10,10,10);
        System.out.println("Area = "+c2.getArea());
        
        Circle c3 = new Circle(0,0,1);
        System.out.println("Area = "+c3.getArea());
        
        Triangle t1 = new Triangle();
        t1.setTriangle(0, 0, 1, 0, 0, 1);
        
        System.out.println("Perimeter = "+t1.getPerimeter());
        
        /*
        int n;
        n = 0;
        
        int nn = 0;
        
        */
    }  
}
