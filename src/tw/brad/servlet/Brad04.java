package tw.brad.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(location="/Users/brad/workspace_j2ee/J2EE_Web/WebContent/upload")
@WebServlet("/Brad04")
public class Brad04 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Collection<Part> parts = request.getParts();
		out.println("num:" + parts.size() + "<br>");
		for (Part part : parts){
			String name = part.getSubmittedFileName();
			long len = part.getSize();
			out.println(name + ":" + len + "<br>");
			if (name.length()>1){
				part.write(name);
			}
		}
		
	}
}
