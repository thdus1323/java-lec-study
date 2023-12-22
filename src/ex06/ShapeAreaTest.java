package ex06;

class Shape01{
    public double getArea(){ return  0; }
    public Shape01(){ super(); }
}

class Rectangle extends Shape01{
    private double width, height;
    public Rectangle(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }
    public double getArea(){ return width*height; }
}

class Triangle extends Shape01{
    private double base, height;
    public double getArea(){ return 0.5*base*height; }
    public Triangle(double base, double height){
        super();
        this.base = base;
        this.height = height;
    }
}

public class ShapeAreaTest {
    public static void main(String[] args) {
        Shape01 obj1 = new Rectangle(10.0, 20.0);
        Shape01 obj2 = new Triangle(10.0, 20.0);

        System.out.println("Rectangle: " + obj1.getArea());
        System.out.println("Triangle: " + obj2.getArea());
    }
}
