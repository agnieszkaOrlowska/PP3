package AbstractClasses;

public class Triangle extends Shape{
    
    double a;
    double b;
    double c;
    double h;

    Triangle(double a, double b, double c, double h) {
        this.a = a; 
        this.b = b; 
        this.c = c; 
        this.h = h; 
    }

    // a+b>c
    // a+c>b
    // b+c>a
    public double area() {
        double area_in_cm;
        return area_in_cm = (a*h)/2;
    }

    public double perimeter() {
        return a+b+c;
    }

    public static void main(String[] args) {
        Shape p1 = new Triangle(11,6,9,7);
        System.out.println(p1.perimeter());
        System.out.println(p1.area());
    }
}
