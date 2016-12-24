package tw.brad.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Hello()");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
    		super.init(config);
    		
    		Enumeration<String> parameters = config.getInitParameterNames();
    		while (parameters.hasMoreElements()){
    			String pname = parameters.nextElement();
    			System.out.println(pname + ":" + config.getInitParameter(pname));
    		}
    		
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) 
    			throws ServletException, IOException {
        System.out.println("service()");
    		
    		super.service(request, response);
    		
    		
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
        System.out.println("doGet()");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		if (name != null){
			out.print("Hello, " + name);
		}else{
			out.print("Hello, World");
		}
		
		out.println("<br />");
		out.println(request.getServletPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
        System.out.println("doPost()");
	}

}
