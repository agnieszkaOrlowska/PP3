package AbstractClasses;

public class Rectangle extends Shape{

    int a;
    int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a*b;
    }

    public double perimeter() {
        return 2*(a+b);
    }

    public static void main(String[] args) {
        Shape r1 = new Rectangle(8, 4);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
    
}
