package ex06;

class Shape {
    int x, y;

    public Shape() {
        System.out.println("Shape 생성됨");
    }
}

class Circle extends Shape {
    int radius; // 반지름

    public Circle(int radius) {
        System.out.println("Circle 생성됨");
        this.radius = radius;
        System.out.println("1");
        super.x = 1;
        super.y = 2;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}


public class CircleTest {
    public static void main(String[] args) {
        Circle a = new Circle(10);
        //커스텀 자료형(Circle) 변수(a) = heap에 Circle을 띄운다.쓰기위해
        System.out.println(a.getArea());
        //그래서 circle의 getArea을 쓴다.

    }
}
