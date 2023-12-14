package ex03;

//2~9단까지 출력되는 프로그램을 만드시오.
public class GugudanEx01 {
    public static void main(String[] args) {

        int i;
        int x;
        for (x=2; x<10; x++) {
            for (i = 1; i < 10; i++) {
                System.out.println(x + "*" + i + "=" + (x * i));
            }
        }

    }

}

//2. 스캐너를 이용하여 입력받은 단만 출력하시오.
