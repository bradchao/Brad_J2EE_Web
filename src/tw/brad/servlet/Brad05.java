package tw.brad.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Brad05
 */
@WebServlet("/Brad05")
public class Brad05 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = 
					DriverManager.getConnection(
							"jdbc:mysql://127.0.0.1/mydb?user=root&password=root");
			Statement stmt = conn.createStatement();
			stmt.execute("INSERT INTO member (account,passwd,birthday,type) VALUES ('aaa','bbb','1999-01-02',4)");
			
			out.println("OK");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}
}
