package tw.brad.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Brad11
 */
@WebServlet("/Brad11")
public class Brad11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// Define the BCrypt workload to use when generating password hashes. 10-31 is a valid value. 
	private static int workload = 13;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String passwd1 = "123456";
		String passwd2 = hashPassword(passwd1);
		out.println(passwd1 +"(" + passwd2.length() + ")" + " => " + passwd2 + "<br>");
		
		String passwd3 = "123456";
		String passwd4 = hashPassword(passwd3);
		out.println(passwd3 +"(" + passwd2.length() + ")" + " => " + passwd4 + "<hr>");
		
		if (checkPassword("123456", passwd2)){
			out.print("OK");
		}else{
			out.print("XX");
		}
		

	}
	public static String hashPassword(String password_plaintext) {
		String salt = BCrypt.gensalt(workload);
		String hashed_password = BCrypt.hashpw(password_plaintext, salt);
 
		return(hashed_password);
	} 
 
	/** 
	 * This method can be used to verify a computed hash from a plaintext (e.g. during a login 
	 * request) with that of a stored hash from a database. The password hash from the database 
	 * must be passed as the second variable. 
	 * @param password_plaintext The account's plaintext password, as provided during a login request 
	 * @param stored_hash The account's stored password hash, retrieved from the authorization database 
	 * @return boolean - true if the password matches the password of the stored hash, false otherwise 
	 */ 
	public static boolean checkPassword(String password_plaintext, String stored_hash) {
		boolean password_verified = false;
 
		if(null == stored_hash || !stored_hash.startsWith("$2a$"))
			throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");
 
		password_verified = BCrypt.checkpw(password_plaintext, stored_hash);
 
		return(password_verified);
	} 
}
