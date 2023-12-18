package ex03;

public class SelectedEx01 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};
        final int N = arr.length;
        int rep;
        int min;

        for(int j=0; j< N-1; j++){
            //1회전
            rep = j; //0
            min = rep; //0

            for(int i =rep +1; i< N; i++){
                if(arr[min] > arr[i]){ //5,8,2,4,3 // i = 1
                    min=i;
                }
            }

            if(rep !=min){
                int temp = arr[rep];
                arr[rep] = arr[min];
                arr[min] = temp;
            }
        }
        for(int v : arr){
            System.out.println(v+" ");
        }

    } // end main
}
