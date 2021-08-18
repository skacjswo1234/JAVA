package login.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionLogout
 */
@WebServlet("/session/logout")
public class SessionLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionLogout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("isLogin", false);
		session.removeAttribute("nickname");
		
		//포워딩하는 방법 4가지 외우기 ! ↓
		/*
		 * 1. RequestDispatcher : 페이지의 URL이 바뀌지 않음 
		 * 2. sendRedirect : 페이지의 URL이 바뀜 
		 * 3.헤더에 Location을 담아서
		 * -response.addHeader()
		 * -response.setStatis (300번대 응답코드)
		 *  : 페이지의 URL이 바뀜 
		 * 4. 자바스크립트 코드를 사용해서 : 페이지의 URL이 바뀜 
		 */
		//RequestDispatcher -> 포워딩을 하면 URL이 바뀌지 않음
//		RequestDispatcher dis = request.getRequestDispatcher("/chapter14/SessionLogin.jsp");
//		dis.forward(request, response);
		// sendRedirect -> 포워딩을 하면 URL이 바뀐다.
		//response.sendRedirect("/JSPBook01/chapter14/SessionLogin.jsp");
		
		// Location 헤더에 이동해야될 URL을 명시
//		response.addHeader("Location","/JSPBook01/chapter14/SessionLogin.jsp");
		// 303 응답 코드를 반환 303(seeOther) : 응답코드를 다른 url에 가서 봐라는 의미 
//		response.setStatus(303);
		
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().print("<script>alert(\n로그아웃되었습니다\n로그인 페이지로 이동합니다);.location.href='/JSPBook01/chapter14/SessionLogin.jsp'</script>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
