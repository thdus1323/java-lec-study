package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(System.out)
        );
        try {
            bw.write("안녕\n"); // readline 2번읽음?? 통신 시) 한번에 읽을 때(소비할 때) \n까지 읽는다.
            // readline enter키까지 읽음.
            // \n이 없으면 자료가 안 가는 것이 아니라 못 읽음?
            //둘 다 \n을 붙이던지 마지막 애에게 \n을 넣어줌-v(ex) 이 경우 반가워\n)
            bw.write("반가워\n");//보낸 것들 구분하고 싶으면 끝에\n(내려쓰기)
            //버퍼드라이트
            bw.flush();//8192byte가 아직 안차서..-v
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
