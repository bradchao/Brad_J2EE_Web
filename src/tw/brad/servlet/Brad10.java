package tw.brad.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad10")
public class Brad10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");

//		BufferedImage bimg = new BufferedImage(400, 20, BufferedImage.TYPE_INT_ARGB);
		
		String imgsPath = getServletContext().getInitParameter("imgs-path");
		File imgFile = new File(imgsPath, "bg.jpg");		
		BufferedImage bimg = ImageIO.read(imgFile);
		
		
		Graphics2D g2d = bimg.createGraphics();
		g2d.setColor(Color.YELLOW);
		g2d.fillRect(0, 0, 400, 20);
		g2d.setColor(Color.RED);
		g2d.fillRect(0, 0, 200, 20);
		
		Font font = new Font(null, Font.PLAIN, 24);    
		AffineTransform affineTransform = new AffineTransform();
		affineTransform.rotate(Math.toRadians(-45), 0, 0);
		Font rotatedFont = font.deriveFont(affineTransform);
		g2d.setFont(rotatedFont);
		g2d.drawString("趙令文",100,100);
		g2d.dispose();
		
//		String pathToWeb = getServletContext().getRealPath(File.separator);
//		File f = new File(pathToWeb + "avajavalogo.jpg");
//		BufferedImage bi = ImageIO.read(f);

		
		OutputStream out = response.getOutputStream();
		ImageIO.write(bimg, "png", out);
		out.close();
		
	}
}
