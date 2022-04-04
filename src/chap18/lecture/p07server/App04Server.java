package chap18.lecture.p07server;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class App04Server {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.35.194",38080));
		
		System.out.println("[클라이언트 기다림]");
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트 와 연결 성공!]");
		InputStream is = socket.getInputStream();
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		String data="";
		while((data=br.readLine()).equals("exit")) {
			System.out.println("[클라이언트]:"+data);
		}
		
		br.close();
		rd.close();
		is.close();
		socket.close();
		serverSocket.close();
		System.out.println("서버 종료!");
	}
}
