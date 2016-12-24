package tw.brad.servlet;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/Brad02")
public class Brad02 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Part part = request.getPart("upload");
		
		String header = part.getHeader("Content-Disposition");
		out.println(header + "<br>");
		
		String filename = header.substring(header.indexOf("filename=\"")+10, 
				header.lastIndexOf("\""));
		
		out.println(filename + "<br>");
		
		long size = part.getSize();
		String name = part.getSubmittedFileName();
		String type = part.getContentType(); 
		out.println(name + ":" + type + ":" + size);
		
		byte[] buf = new byte[(int)size];
		BufferedInputStream bin = new BufferedInputStream(part.getInputStream());
		bin.read(buf);
		bin.close();
		
		String uploadPath = getServletContext().getInitParameter("upload-path");
		
		FileOutputStream fout = new FileOutputStream(new File(uploadPath, name));
		fout.write(buf);
		fout.flush();
		fout.close();
		
	}
}
