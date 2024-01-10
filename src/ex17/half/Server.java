package ex17.half;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept();
            //소켓 연결 완료됨

            //버퍼 만들기(recevied)
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String requestMsg = br.readLine();
            System.out.println("클라이언트로부터 받은 메세지 : " + requestMsg);

            //send 버퍼 만들기~동기적 실행 / 응답을 받아야 실행-v
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, Charset.forName("UTF-8"));
            // 자동 플러쉬-v

            if (requestMsg.equals("1")) {
                pw.println("영화"); // println 쓰면 \n안해도 됨?

            } else if (requestMsg.equals("2")) {
                pw.println("드라마");
            } else {
                pw.println("프로토콜을 확인하세요 : 1은 영화, 2는 드라마");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
