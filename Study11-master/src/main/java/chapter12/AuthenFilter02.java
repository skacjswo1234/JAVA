package chapter12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenFilter02 implements Filter{
	private FilterConfig config = null;
		
	
	@Override
		public void init(FilterConfig filterConfig) throws ServletException{
			config = filterConfig;
			
		}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException, NullPointerException{
			System.out.println("Filter-2수행..");
			
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");

			String initParam1 = config.getInitParameter("param1"); //아이디
 			String intiParam2 = config.getInitParameter("param2"); //비밀번호
			
			String message;
			
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = response.getWriter();
			
			if(id.equals(initParam1) && pw.equals(intiParam2)) {
				message =" 로그인에 성공했습니다";
			} else {
				message="로그인에 실패했습니다";
			}
			
			writer.print(message);
			
			chain.doFilter(request, response);
	}

}
