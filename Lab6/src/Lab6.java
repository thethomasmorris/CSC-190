//course: CSC190
//project: Lab 6
//date: 10/05/18
//author: Thomas Morris
//purpose: Implement the 5 classes Triangle, Sphere, Cylinder, RectangularCuboid, and RegularTetrahedron along with a main class and test every method in each class.

class Triangle {
    double p1x, p1y, p2x, p2y, p3x, p3y;
    
    //constructor
    Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        p1x = x1;
        p1y = y1;
        p2x = x2;
        p2y = y2;
        p3x = x3;
        p3y = y3;
    }
    
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

class Sphere{
    double r;
    
    //constructor
    Sphere(double radius){
        r = radius;
    }
    
    void setSphere(double radius){
       r = radius; 
    }
    
    double getVolume(){
        return (4.0/3.0)*Math.PI*(r*r*r);
    }
    
    double getSurfaceArea(){
        return 4*Math.PI*(r*r);
    }
}

class Cylinder{
    double r, h;
    
    //constructor
    Cylinder(double radius, double height){
        r = radius;
        h = height;   
    }
    
    void setCylinder(double radius, double height){
        r = radius;
        h = height;   
    }
    
    double getVolume(){
        return Math.PI*(r*r)*h;
    }
    
    double getSurfaceArea(){
        return (2*Math.PI*r*h)+(2*Math.PI*(r*r));
    }
}

class RectangularCuboid{
    double l, d, h;
    
    //constructor
    RectangularCuboid(double length, double depth, double height){
        l = length;
        d = depth;
        h = height; 
    }
    
    void setRectangularCuboid(double length, double depth, double height){
        l = length;
        d = depth;
        h = height; 
    }
    
    double getVolume(){
        return l*d*h;
    }
    
    double getSurfaceArea(){
       return 2*((l*d)+(l*h)+(d*h)); 
    }
}

class RegularTetrahedron{
    double edgeLength;
    
    //constructor
    RegularTetrahedron(double edge){
        edgeLength = edge;
    }
    
    void setRegularTetrahedron(double edge){
        edgeLength = edge;
    }
    
    double getVolume(){
        return (edgeLength*edgeLength*edgeLength)/(6*Math.sqrt(2));
    }
    
    double getSurfaceArea(){
        return Math.sqrt(3)*(edgeLength*edgeLength);
    }
}

public class Lab6 {
    public static void main(String[] args) {
        
        System.out.println("Triangle"); //to help with reading output
        Triangle t1 = new Triangle(0, 0, 1, 0, 0, 1);
        System.out.println("Area = "+t1.getArea());
        System.out.println("Perimeter = "+t1.getPerimeter());
        
        t1.setTriangle(1,1,4,6,0,8);
        System.out.println("Area = "+t1.getArea());
        System.out.println("Perimeter = "+t1.getPerimeter());
        
        System.out.println(" ");
        System.out.println("Sphere");
        Sphere s1 = new Sphere(10); //to help with reading output
        System.out.println("Volume = "+s1.getVolume());
        System.out.println("Surface Area = "+s1.getSurfaceArea());
        
        s1.setSphere(8);
        System.out.println("Volume = "+s1.getVolume());
        System.out.println("Surface Area = "+s1.getSurfaceArea());
        
        System.out.println(" ");
        System.out.println("Cylinder"); //to help with reading output
        Cylinder c1 = new Cylinder(10, 20);
        System.out.println("Volume = "+c1.getVolume());
        System.out.println("Surface Area = "+c1.getSurfaceArea());
        
        c1.setCylinder(8, 18);
        System.out.println("Volume = "+c1.getVolume());
        System.out.println("Surface Area = "+c1.getSurfaceArea());
        
        System.out.println(" ");
        System.out.println("Rectangular Cuboid"); //to help with reading output
        RectangularCuboid r1 = new RectangularCuboid(10, 10, 20);
        System.out.println("Volume = "+r1.getVolume());
        System.out.println("Surface Area = "+r1.getSurfaceArea()); 
        
        r1.setRectangularCuboid(12, 18, 22);
        System.out.println("Volume = "+r1.getVolume());
        System.out.println("Surface Area = "+r1.getSurfaceArea());
        
        System.out.println(" ");
        System.out.println("Regular Tetrahedron"); //to help with reading output
        RegularTetrahedron rt1 = new RegularTetrahedron(10);
        System.out.println("Volume = "+rt1.getVolume());
        System.out.println("Surface Area = "+rt1.getSurfaceArea());
        
        rt1.setRegularTetrahedron(12);
        System.out.println("Volume = "+rt1.getVolume());
        System.out.println("Surface Area = "+rt1.getSurfaceArea());
    } 
}