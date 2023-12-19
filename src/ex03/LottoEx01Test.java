package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01Test {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int temp[] = new int[6];

        int num;

        num = r.nextInt(3) + 1;
        arr[0] = num;

        num = r.nextInt(3) + 1;
        if(arr[0] != num) {
            arr[1] = num;
        }

        num = r.nextInt(3) + 1;
        if(arr[1] != num) {
            temp[0] = num;
            if(arr[0] != temp[0]){
                arr[2] = temp[0];
            }
        }

//
//        num = r.nextInt(3) + 1;
//        arr[3] = num;
//
//        num = r.nextInt(3) + 1;
//        arr[4] = num;
//
//        num = r.nextInt(3) + 1;
//        arr[5] = num;

        System.out.println(Arrays.toString(arr));

    }
}




