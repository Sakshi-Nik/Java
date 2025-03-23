//Ass 3,Q.3

import java.util.Scanner;

abstract class Shape {
    protected double diml;  
    protected double dim2;  

    
    public Shape(double diml, double dim2) {
        this.diml = diml;
        this.dim2 = dim2;
    }

    
    public abstract double area();
}
class Rectangle extends Shape {
  
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double area() {
        return diml * dim2;  
    }
}

class Triangle extends Shape {

    public Triangle(double height, double base) {
        super(height, base);
    }

    @Override
    public double area() {
        return  0.5*diml * dim2;  
    }
}
public class AbstractShape {
    public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter length and width of Rectangle :");
		int l=input.nextInt();
		int w=input.nextInt();
		
		System.out.println("Enter length and width of Triangle :");
		int h=input.nextInt();
		int b=input.nextInt();
		
		
        Shape rectangle = new Rectangle(l, w);
        System.out.println("Area of rectangle: " + rectangle.area());
		
		Shape triangle = new Triangle(h,b);
        System.out.println("Area of triangle: " + triangle.area());
    }
}
/*Output
Enter length and width of Rectangle :
3 6
Enter length and width of Triangle :
5 8
Area of rectangle: 18.0
Area of triangle: 20.0*/