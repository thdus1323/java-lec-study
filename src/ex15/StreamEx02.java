package ex15;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
//        InputStream in = System.in;
        InputStreamReader ir = new InputStreamReader(System.in);
        // 배열을 만들 수 있다고 그랬습니다.
        char[] ch = new char[4];//보조 스트림

        try {//ch가 보조 스트림으로 읽는다고?
            ir.read(ch);

            for (char c : ch) {
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
