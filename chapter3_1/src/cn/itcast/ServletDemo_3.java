package cn.itcast;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo_3
 */
@WebServlet("/ServletDemo_3")
public class ServletDemo_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
private ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException{
		this.config=config;
		}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo_3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		test(response);
	}

	private void test(HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		Enumeration<?> e =config.getInitParameterNames();
		while (e.hasMoreElements()) {
			String paramName = (String) e.nextElement();
			String paramValue = config.getInitParameter(paramName);
			response.getWriter().write(paramName + ":" + paramValue + "<br/");
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

