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

import drama.drama_able;
import drama.drama_detail;
import drama.drama_index;
import drama.drama_research;
import drama.drama_search;
import drama.drama_watching;



/**
 * Servlet implementation class drama_servlet
 */
@WebServlet("/drama_servlet")
public class drama_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String,drama_able> map= new HashMap<>();
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
		
		map.put("drama_index.drama",new drama_index());
		map.put("drama_research.drama",new drama_research());
		map.put("drama_search.drama",new drama_search());
		map.put("drama_detail.drama",new drama_detail());
		map.put("watching_list.drama",new drama_watching());
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
	
		drama_able dable = map.get(cmd);
		
		String view=null;
		view=dable.service(request, response);
		
		if(view!=null) {
			RequestDispatcher disp = request.getRequestDispatcher(view);
			disp.forward(request, response);
		}
	}
}
