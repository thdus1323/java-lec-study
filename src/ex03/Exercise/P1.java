package ex03.Exercise;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오: ");
        int x = sc.nextInt();

        if(0<x && x<11) {

            if (x == 1) {
                System.out.println("ONE");
            }
            if (x == 2) {
                System.out.println("TWO");
            }
            if (x == 3) {
                System.out.println("THREE");
            }
            if (x == 4) {
                System.out.println("FOUR");
            }
            if (x == 5) {
                System.out.println("FIVE");
            }
            if (x == 6) {
                System.out.println("SIX");
            }
            if (x == 7) {
                System.out.println("SEVEN");
            }
            if (x == 8) {
                System.out.println("EIGHT");
            }
            if (x == 9) {
                System.out.println("NINE");
            }
            if (x == 10) {
                System.out.println("TEN");
            }
        } else {
            System.out.println("OTHER");
        }





    }
}
