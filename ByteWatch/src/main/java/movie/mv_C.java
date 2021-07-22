package movie;

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


import main.MainHandler;

/**
 * Servlet implementation class mv_C
 */
@WebServlet("/mv_C")
public class mv_C extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String,MainHandler> map = new HashMap<>(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mv_C() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		String param =config.getInitParameter("config");
		Properties prop = new Properties();
		try(FileReader fs = new FileReader(param)){
			prop.load(fs);
		}catch(IOException e) {
			System.out.println("properties파일 로드 실패");
		}
		Iterator key = prop.keySet().iterator();
		while(key.hasNext()) {
			String cmd = (String)key.next();
			String value = prop.getProperty(cmd);
			try {
				Class<?> hclass = Class.forName(value);
				MainHandler hinst = (MainHandler)hclass.newInstance();
				
				map.put(cmd, hinst);
			}catch(ClassNotFoundException | IllegalAccessException |InstantiationException e) {
				System.out.println("handler 맵 실패");
			}
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println(url+path+cmd);	
		process(request,response);	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request,response);
	}
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String url = request.getRequestURI();
		String path = request.getContextPath();
		String cmd = url.substring(path.length()+1,url.length());
		System.out.println(path);
		System.out.println(cmd);
		
		
		MainHandler hd = map.get(cmd);
		
		String view=null;
		view=hd.action(request, response, cmd.substring(0,cmd.length()-3));
		
		System.out.println(view);
		
		if(view!=null) {
			RequestDispatcher disp = request.getRequestDispatcher(view);
			disp.forward(request, response);
		}
		
	}

}
