package main;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class drama_servlet
 */
@WebServlet("/drama_servlet")
public class drama_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String,MainHandler> map= new HashMap<>();
    /**
     * Default constructor. 
     */
    public drama_servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		Map<String,item_able> temp = new HashMap<>();
		temp.put("item_detail.drama",new item_detail());
		temp.put("item_search.it",new item_search());
		temp.put("item_review.it",new item_review());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String url = request.getRequestURI();
		String path = request.getContextPath();
		String cmd = url.substring(path.length()+1,url.length());
		
		MainHandler hd = map.get(cmd);
		
		String view=null;
		view=hd.action(request, response, cmd.substring(0,cmd.length()-4));
		
		if(view!=null) {
			RequestDispatcher disp = request.getRequestDispatcher(view);
			disp.forward(request, response);
		}
	}
}
