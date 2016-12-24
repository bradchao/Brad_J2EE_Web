package tw.brad.servlet;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad07")
public class Brad07 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String templatePath = getServletContext().getInitParameter("template-path");
		File tempFile = new File(templatePath, "temp1.html");
		long len = tempFile.length();
		byte[] buf = new byte[(int)len];
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(tempFile));
		bin.read(buf);
		bin.close();
		
		String html = String.format(new String(buf), "Brad");

		out.println(html);

	}
}
