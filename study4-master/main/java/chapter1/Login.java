package chapter1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 회원정보에서 ID를 사용해서 비밀번호를 가져온다.
		String storedPW = WareHourse.user.get(id);
		if(storedPW != null && storedPW.equals(pw)) {
			System.out.println("로그인성공!");
		} else {
			System.out.println("존재하지 않는 계정입니다.");
		}
		System.out.println("id = " + id +", pw =" + pw + "로 로그인 시도중");
		System.out.println("로그인 시도중..");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
