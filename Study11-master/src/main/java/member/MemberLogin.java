package member;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class MemberLogin
 */
@WebServlet("/member/login")
public class MemberLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 -> 사용자가 입력한 아이디, 비밀번호가 회원 정보에 있는지 확인
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		Connection conn = null; 
				
		try {
	
			Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/JSPBookDB?user=root&password=koreait");
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM member WHERE id = ? AND pw = ?");
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();
			
			boolean isExist = rs.next();
			if(isExist){
				// 로그인 시 입력한 아이디, 비밀번호로 회원정보를 찾았다면은
				// 로그인처리
				// - 사용자의 닉네임 세션에 저장
				String name = rs.getString("name");
				// - 사용자의 식별 값 세션에 저장
				int idx = rs.getInt("idx");
				
				session.setAttribute("name", name);
				session.setAttribute("idx", idx);
				
				// 웅답코드 200
				response.setStatus(200);
			} else {
				// 로그인 시 입력한 아이디, 비밀번호로 회원 정보를 찾지못했다면은
				// 로그인 실패 처리
				// 응답코드 401
				response.setStatus(401);
			}
			
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {

				}
			}
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
