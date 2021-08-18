package chapter9;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Ex2 {

	public static void main(String[] args)  {
		String protocol = "http://";
		String host = "www.ddaily.co.kr";
		String path = "data/photos/cdn/20210104 /";
		String resource = "art_1611539583.jpg";
		String queryString = "?referer=naver";
		String anchor = "#index";
		try {
			URL url = new URL(protocol + host + path + resource + queryString + anchor);
																		// 포트번호, 문자열반환
			System.out.println("url.getAuthority() = " + url.getAuthority());
																		// 자원에대한 정보
			System.out.println("url.getContent() = " + url.getContent());
																		// 기본포트번호
			System.out.println("url.getDefaultPort() = "  + url.getDefaultPort());
																	// 실제 포트번호
			System.out.println("url.getPort() =" + url.getPort());
																	// 요청한 파일
			System.out.println("url.getFile() = "  + url.getFile());
																	// 호스트 파일
			System.out.println("url.getHost() = " + url.getHost());
																	// 경로 출력
			System.out.println("url.getPath() = " + url.getPath());
																	// 프로토콜 출력
			System.out.println("url.getProtocol() = " + url.getProtocol());
			System.out.println("url.getQuery() = " + url.getQuery());
			System.out.println("url.getRef() = "  + url.getRef());
																		// 사용자의 정보
			System.out.println("url.getUserInfo() = " + url.getUserInfo());
			System.out.println("url.toExternalForm() = " + url.toExternalForm());
			System.out.println("url.toURI() = " + url.toURI());
		} catch (IOException |  URISyntaxException e) {
			e.printStackTrace();
		}

	}

}
