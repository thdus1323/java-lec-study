package ex04;

public class OverloadEx01 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(1.0);
        System.out.println("1");
    } //오버로딩 덕에 위의 식 가능 // 자료형 다르면 다른 메서드로 인식
      // printlnint, printdouble, printString 이렇게 안 써도
}
