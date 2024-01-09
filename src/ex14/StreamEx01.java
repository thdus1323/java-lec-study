package ex14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamEx01 {
    public static void main(String[] args) {
        //인덱스만 하면 개발자 외에는 어떤 건지 모름 ex)20
        // 표시하려고 hash로 표현, 혹은 클래스로 표현.
        //그냥 data는 map도 가능하지만 클래스로 만듦. 왜냐면..
        // 맵은 오타가능(컴파일은 못찾음),
        // 오브젝트 때문에 다운캐스팅해야 되서 귀찮.
        // 맵으로 해야 사용자 아무 타이을 받음. (제네릭은 길이 변경x & 갯수를 모르니까),
        // 다 클래스로 만듦-v,꺼내서 쓸때는 다운(보통은 오브젝트로 해서)
        //무조건 arraylist로 만듦? 연속된 데이터를 벡터타입(같은 타입)으로 저장하고 싶어
        //ooo를 클래스? 2개만 기억.
        Map<String, Object> data = new HashMap<>();
        data.put("name", "홍길동");
        data.put("age", 20);

        Map<String, Object> data2 = new HashMap<>();
        data2.put("name", "장보고");
        data2.put("age", 15);

        Map<String, Object> data3 = new HashMap<>();
        data3.put("name", "이순신");
        data3.put("age", 30);

        List<Map<String, Object>> arr = Arrays.asList(data, data2, data3);
        //위의 자료를 만나이로 바꾸고 싶어
        //물길 만듦, MAP 가공, 해시?해서 다운캐스팅, 오브젝트로 해서?
        List<Map<String, Object>> newArr = arr.stream().map(d -> {
            int newAge = (Integer) d.get("age") - 1;
            //덮어씌우기
            d.put("age", newAge);
            return d;
        }).toList();

        newArr.stream().forEach(d -> {
            System.out.println(d.get("age"));
        });

    }
}
