package ex06;

class Animal01{
    void speak(){
        System.out.println("Animal 클래스의 sound()");
    }
}

class Dog01 extends Animal01{
    void speak(){
        System.out.println("멍멍");
    }
}

class Cat01 extends Animal01{
    void speak(){
        System.out.println("야옹");
    }
}

public class DyanmicCallTest {
    public static void main(String[] args) {
        Animal01 a1 = new Dog01();
        Animal01 a2 = new Cat01();

        a1.speak();
        a2.speak();

    }
}
