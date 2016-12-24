package tw.brad.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad06")
public class Brad06 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null){
			for (Cookie cookie : cookies){
				String name = cookie.getName();
				String value = cookie.getValue();
				out.print(name + " : " + value + "<br>");
			}
		}else{
			Cookie cookieUser = new Cookie("user", "brad"); 
			cookieUser.setMaxAge(60);
			Cookie cookieAge = new Cookie("age", "18" + (int)(Math.random()*20));
			cookieAge.setMaxAge(60);
			Cookie cookieWeight = new Cookie("weight", "60");
			cookieWeight.setMaxAge(60);
			response.addCookie(cookieUser);
			response.addCookie(cookieAge);
			response.addCookie(cookieWeight);
			
			out.println("set cookies");
			
		}
		
		

	}
}
