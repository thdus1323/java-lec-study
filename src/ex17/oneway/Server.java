package ex17.oneway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
//            System.out.println                                  (1); //디버깅이 잘 안되면 1번찍어보면 됨.
            Socket socket = serverSocket.accept();
            // 리스너(while 돌면서 확인하는 거), accept 메서드 큐가 계속 반복,
            // 이 코드가 여기에 멈춰있음-디버깅
            // 클라이언트가 요청을 하면 생기는 소캣

            System.out.println("클라이언트 연결됨");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );//프로토콜로 서로 알려줘야 함.
//            String msg = br.readLine();
//            System.out.println(msg);
            // \n이 오면 바로 catch. \없으면 모름. 소비를 안함. 코드 20번에서 멈춰있음-v

            while (true) {
                String msg = br.readLine();

                if (msg == null) break;

                System.out.println(msg);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
