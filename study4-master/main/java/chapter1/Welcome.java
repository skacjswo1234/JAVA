package chapter1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTPYE>");
		response.getWriter().append("<html>");
		response.getWriter().append("<head>");
		response.getWriter().append("<meta charset=\"UTF-8\">");
		response.getWriter().append("<title>첫 페이지</title>");
		response.getWriter().append("</head>");
		response.getWriter().append("<body>");
		response.getWriter().append("<strong>nam 페이지 입니다!</strong>");
		response.getWriter().append("<strong>접속한 사용자의 IP = " + request.getRemoteAddr() );
		response.getWriter().append("</body>");
		response.getWriter().append("</head>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
