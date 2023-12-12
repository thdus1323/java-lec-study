package ex01;

public class VarEx01 {

   // 모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1; // 21억까지 (4Byte)
        double d1 = 1.5; // 숫자는 21억까지, 대신 .뒤의 숫자 표현가능 (8Byte)
        long big1 = 20000000000L; // 경까지(8byte), 문자가 넘어가면 L붙임-V
        boolean b1 = true; //true, false // 1비트지만 한 칸 차지하여 1byte로 생각-v
        char c1 = '가'; // (한글/영어)문자1개 저장

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
    } // 자바 프로그램 종료
}
