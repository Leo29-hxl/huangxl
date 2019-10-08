package cn.heima;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestParamsServlet
 */
@WebServlet("/RequestParamsServlet")
public class RequestParamsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestParamsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("username");
	String password = request.getParameter("password");
	System.out.println("用户名:"+name);
	System.out.println("密码:"+password);
	String[] hobby = request.getParameterValues("hobby");
	System.out.println("爱好:");
	for (int i = 0;i<hobby.length;i++) {
		System.out.println(hobby[i]+",");
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
