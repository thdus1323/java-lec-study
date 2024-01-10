package ex17.oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        //localhost = 127.0.0.1(루프백)_본인 것?
        // => 현재 프로그램이 실행되는 로컬 호스트의 이름
        try {
            Socket socket = new Socket("127.0.0.1", 10000);
            //버퍼의 타겟이 소캣?? 키보드

            //스캐너는 중요x

//            Scanner sc = new Scanner(System.in);
//            String msg = sc.nextLine();

            BufferedWriter bw = new BufferedWriter(
                    //글자를 몇 바이트로 교환할 건지 정할 수 있음. 한글3 영어1byte로 됨.
                    //그래야 가나다라abc 15byte로 받을 수 있음. 1byte씩 읽으면 한글 다깨짐.
                    //인코딩 utf8이야 끊어 읽어. os에도 알려줌-v 프로세스가 버퍼에 메세지 가나다라,utf 쓰고 os가 세그먼트로 쪼갤때 몇 바이트인지 알아야 의미있게 쪼갤 수 있다. os도 버퍼드라이드한걸 리드함. 3바이트로 끊어..-v
                    new OutputStreamWriter(socket.getOutputStream(), "UTF-8")
            );

            bw.write("msg1" + "\n");
            bw.write("msg2" + "\n");
            bw.flush();

        } catch (IOException e) {

            e.printStackTrace(); //에러를 자세하게 볼 수 있음
        }//반응 없어 단방향

    }
}
