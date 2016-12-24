package tw.brad.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Brad09
 */
@WebServlet("/Brad09")
public class Brad09 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = 
					DriverManager.getConnection(
							"jdbc:mysql://127.0.0.1/布萊德大公司?user=root&password=root");
			
			PreparedStatement pstmt = 
					conn.prepareStatement("INSERT INTO 客戶 (姓名,電話,生日) VALUES (?,?,?)");
			pstmt.setString(1, "趙令文");
			pstmt.setString(2, "123");
			pstmt.setString(3, "1919-12-12");
			pstmt.execute();
			
			out.println("OK");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
