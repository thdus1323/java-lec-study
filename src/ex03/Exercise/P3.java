package ex03.Exercise;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~50까지의 정수 숫자를 입력하시오: ");
        int x = sc.nextInt();

        for(int i =1; i<=16; i++){
            if(x == 3*i){
                System.out.println("짝");
            }
        }

//        if(x == 3){
//            System.out.println("짝");
//        }
//
//        if(x == 3*2){
//            System.out.println("짝");
//        }
//
//        if(x == 3*3){
//            System.out.println("짝");
//        }










    }
}
