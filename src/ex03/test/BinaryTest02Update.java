package ex03.test;

public class BinaryTest02Update {
    public static void main(String[] args) {
        //이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 9(갯수)/2=4 =>4번지 정중앙 find -> 8을 찾고자 함

        final int target = 8;
        int mid = arr.length / 2;
        int N = arr.length;
        //mid값 구하기 n/2 = 4=>값 5
        //mid = N/2; //5기준으로 타겟값이 커/작아?
        mid =
        if (mid == 8) {
            System.out.println("target 값은" + arr[mid] + "입니다.");
        }
        if (mid < 8) {
            System.out.println(arr[mid] + "값보다 오른쪽에 있습니다.");
            //4/2 =2 -> 값 8
        } //오른쪽 칸 갯수 세어보면
        //5번지(mid+1)~8번지(N-1) 비교
        //mid +1번지~N-1번지 비교
        //(8-5+1) / 2 = 두번째 mid
        //{N-mid-1)} / 2 = 2 ->값 8
        //mid 4/2 =2 ->8
        mid = 2;
        if (8 == 8) {
            System.out.println("target 값은" + arr[mid] + "입니다");
        }
        if (mid < 8) {
            System.out.println(arr[mid] + "값보다 오른쪽에 있습니다.");
        }
        if(mid > 8) {
            System.out.println(arr[mid] + "값");
        }
    } // end main
}
