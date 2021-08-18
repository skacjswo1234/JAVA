package chapter1;

import java.io.IOException;
import java.net.Socket;

public class TCPClient_V2 {

	public static void main(String[] args) {
		try {
			String serverIp = "127.0.0.1";
			
			Socket socket = new Socket(serverIp, 7777);
			
			System.out.println("서버에 연결되었습니다.");
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
		} catch(IOException e
				) {
			e.printStackTrace();
		}

	}

}
