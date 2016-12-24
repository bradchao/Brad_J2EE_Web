package tw.brad.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad01")
public class Brad01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
//		BufferedReader reader =  request.getReader();
//		String line;
//		while ( (line = reader.readLine()) != null){
//			out.println(line + "<br />");
//		}
		
		String[] names = request.getParameterValues("name");
		for (String name : names){
			out.println(name + "<br />");
		}
		out.print("<hr />");
		String[] likes = request.getParameterValues("like");
		for (String like : likes){
			out.println(like + "<br />");
		}
		
//		Enumeration<String> names = request.getParameterNames();
//		while (names.hasMoreElements()){
//			String name = names.nextElement();
//			out.println(name + ":" + request.getParameter(name) + "<br />");
//		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
//		BufferedReader reader =  request.getReader();
//		String line;
//		while ( (line = reader.readLine()) != null){
//			out.println(line + "<br />");
//		}
		
		int len = request.getContentLength();
		//out.println(len);
		String type = request.getContentType();
		out.println(type);
		
		byte[] buf = new byte[len];
		request.getInputStream().read(buf);
		
		String body = new String(buf);
		System.out.println(body);
		
	}
	private String getFilename(String body){
		int start = body.indexOf("filename=\"");
		//out.println(start + "<br>");
		String temp = body.substring(start+10);
		String filename = temp.substring(0, temp.indexOf("\""));
		//out.println(filename);
		return filename;
		
	}

}
