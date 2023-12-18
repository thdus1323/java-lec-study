package ex03.test;

public class BinaryTest01 {
    public static void main(String[] args) {
        //이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {1,2,3,4,5,6,7,8,9}; // 9(갯수)/2=4 =>4번지 정중앙 find -> 8을 찾고자 함

        //target =8

        //0~8번지비교
        // mid = N/2= 4(index 위치값) -> arr[4]=값 5
        //if(8 ==5) -> mid 위치에 타겟이 있다.

        //if(8>5) 참->

        // 5번지[mid+1]부터 8번지까지 비교
        //mid = 7=arr[7]->값 8
        //if(8 ==5) -> mid 위치에 타겟이 있다.
        //if(8>8)

    }
}
