package ex03;

//2~9단까지 출력되는 프로그램을 만드시오.
public class GugudanEx03 {
    public static void main(String[] args) {

        for (int i =1; i<=9; i++){
            for (int x =2; x <=9; x++){
                System.out.print(x + "*" + i + "=" + x * i + "  ");
            }
            System.out.println();
        }

    }

}
