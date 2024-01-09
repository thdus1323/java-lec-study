package ex15;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        //hdd입장에서 input생각.
        InputStream input = System.in; //키보드
        try {
            //밑의 value 값은 아스키코드가 온다..-v
            int value = input.read();
            System.out.println("받은 값: " + (char) value); // 인풋스트림으로 데이터를 받으면 바이트 단위로 데이터를 처리하기 때문에 (char)을 해서 문자로 변형? 변경? 해주어야 한다.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
