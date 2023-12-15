//package ex03;
//
//import java.util.Scanner;
//
//public class GuessNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력하시오.: ");
//
//        int rd_num;
//        int answer;
//        int count = 1;
//        int i;
//
//        while (true) {
//            answer = sc.nextInt();
//            rd_num = (int) (Math.random() * 100) + 1;
//            if (rd_num > answer) {
//                System.out.println("더 큰 수를 입력하시오. ");
//                System.out.println("정수를 입력하시오.");
//                answer = sc.nextInt();
//
//            } else if (rd_num < answer) {
//                System.out.println("더 작은 수를 입력하시오. ");
//
//            } else{
//                System.out.println("정답입니다.");
//                break;
//            }
//
//        }
//
//
//    }
//}
