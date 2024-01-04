package ex13;

import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector();
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        //크기
        System.out.println(vec.size());

        //인덱스 접근
        System.out.println(vec.get(1));

        //정렬(오름차순)
        Collections.sort(vec);
        for (String s : vec) {
            System.out.print(s + " ");
        }

        System.out.println();

        //정렬(내림차순)
        Collections.sort(vec, Collections.reverseOrder());

        for (String s : vec) {
            System.out.print(s + " ");
        }

        System.out.println();

        //정렬 다른 방법
//        Arrays.sort(); // 애는 컬렉션 할 수 없음.?-v

        //삭제_보통 인덱스번호로 씀
        String result = vec.remove(2);
        System.out.println(result);
        System.out.println(vec.size());

        //값 찾기 (대소문자따짐. 그래서 mango하면 false)
        boolean search = vec.contains("Mango");
        System.out.println(search);

        //대소문자를 상관없이 할려고 하면 equlasingnore 쓰면 됨.
        //그럼 대소문자 섞은 거 넣었을 때 true면 있는 거임.
        String a = "Mango";
        boolean check = a.equalsIgnoreCase("mAngo");
        System.out.println(check);

    }
}
