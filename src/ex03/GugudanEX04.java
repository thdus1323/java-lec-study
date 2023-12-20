package ex03;

class GugudanUtil{
    static void gugudan(int x){
        for (int i = 1; i <= 9; i++) {
            System.out.println(x + "*" + i + "=" + (x * i));
        }
        System.out.println();
    }
}

public class GugudanEX04 {

    public static void main(String[] args) {
        //구구단을 출력해주는 메서드
        //GugudanUtil 클래스에 gugudan 정적 메서드를 호출하시오.
        //parameter는 int 한 개가 필요합니다.

        GugudanUtil.gugudan(9);
    }
}

