package newtork.exception.connect;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConnectMain {
    public static void main(String[] args) throws IOException {
        unkownHostEx1();
        unkownHostEx2();
        connectionRefused();
    }

    private static void unkownHostEx1() throws IOException
    {
        try {
            Socket socket = new Socket("999.999.999.999", 80);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    private static void unkownHostEx2() throws IOException
    {
        try {
            Socket socket = new Socket("google.gogo", 80);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    private static void connectionRefused() throws IOException {
        try {
            Socket socket = new Socket("localhost", 45678); // 미사용 포트
        } catch (ConnectException e) {
            // ConnectException: Connection refused
            e.printStackTrace();
        }
    }
}