package ex03.test;

public class BinaryTest02 {
    public static void main(String[] args) {
        //이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 9(갯수)/2=4 =>4번지 정중앙 find -> 8을 찾고자 함

        final int target = 8;
        int mid;
        //mid값 구하기 9/2=4=>값 5
        mid = 5; //5기준으로 타겟값이 커/작아?
        if (5 == 8) {
            System.out.println("target 값은" + mid + "입니다.");
        }
        if (5 < 8) {
            System.out.println(mid + "값보다 오른쪽에 있습니다.");
            //4/2 =2 -> 값 8
        }
        //5번지~8번지 비교
        //mid 4/2 =2 ->8
        mid = 2;
        if (8 == 8) {
            System.out.println("target 값은" + mid + "입니다");
        }
    } // end main
}
