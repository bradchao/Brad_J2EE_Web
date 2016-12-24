package tw.brad.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet("/Brad12")
public class Brad12 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		try{
			URL url = new URL("http://data.coa.gov.tw/Service/OpenData/CC/FoodData.aspx");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			String json = br.readLine();
			
			JSONArray root = new JSONArray(json);
			for (int i=0; i<root.length(); i++){
				JSONObject data = root.getJSONObject(i);
				String title = data.getString("title");
				out.println(title + "<br>");
			}
			
			
			
			
			
			
			
		}catch(Exception ee){
			
		}
	}

}
