package ex03.test;

public class BubbleTest02 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length;

        //세 번째 도전 4바퀴 돌고, 내부적으로 (4,3,2,1)바퀴 돌기
        for (int i = 0; i < N - 1; i++) {

            for (int j = 0; j < N - 1 - i; j++) {
                System.out.println("몇 바퀴 돌까?");
            }
            System.out.println();
        }
    }
}