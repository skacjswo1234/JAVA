package chapter1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient_V1 {

	public static void main(String[] args) {
	
		try {
			// 루프백 주소 (서버구현)
			String serverIp = "127.0.0.1";
			
			System.out.println("서버에 연결중입니다. 서버IP = "  + serverIp);
			// 연결할 소켓번호는 7777
			Socket socket;
			socket = new Socket(serverIp, 7777);
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버로부터 받은 메세지 : " + dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
}
}
