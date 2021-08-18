package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Naion
 */
@WebServlet(name = "Nation", urlPatterns = { "/nation" })
public class Naion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Naion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nation = request.getParameter("nationType");
		if(nation.equals("ko")) {
			// 한국말 인사말 출력페이지이동
			RequestDispatcher dis = request.getRequestDispatcher("hello_ko.jsp");
			dis.forward(request, response);
		
		} else if(nation.equals("cn")) {
			// 중국 인사말 출력페이지이동
			RequestDispatcher dis = request.getRequestDispatcher("hello_cn.jsp");
			dis.forward(request, response);
		} else if(nation.equals("ja")) {
			// 일본 인사말 출력페이지이동
			RequestDispatcher dis = request.getRequestDispatcher("hello_ja.jsp");
			dis.forward(request, response);
		
		} else if(nation.equals("am")) {
			// 미국 인사말 출력페이지이동
			RequestDispatcher dis = request.getRequestDispatcher("hello_am.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis = request.getRequestDispatcher("hello_am.jsp");
			dis.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
