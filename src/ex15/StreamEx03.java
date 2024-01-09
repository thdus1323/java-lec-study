package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx03 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in); // System.in자리에 상대방 컴퓨터와 통신하는 뭐 그런 것을 적으면 상대방 컴퓨터와 통신할 수 있어.
        //상대방 컴터와 통신을 소켓을 통해서 함. System.in 상대방 컴퓨터 데이터 받는 그 변수? 이런 것을 적으면 된다고 했어.
        //통신은 System은 키보드만?
        //모든 파일 통신은 버퍼-v
        BufferedReader br = new BufferedReader(ir);

        try {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
