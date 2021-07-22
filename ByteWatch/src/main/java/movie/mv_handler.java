package movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import main.MainHandler;

public class mv_handler implements MainHandler{
	public String action(HttpServletRequest request,
			HttpServletResponse response, String cmd) {
		String view=null;
		//view = makeMap().get(cmd).service(request, response);
		System.out.println(cmd);
		if(cmd.equals("movie")) {
			movie_dao md = new movie_dao();
			
			ArrayList<movie> dd= md.selectA();
			request.setAttribute("movie", dd);
			view="movie/movie.jsp";
		}
		if(cmd.equals("movie_detail")) {
			int num = Integer.parseInt(request.getParameter("num"));	
			String[] a =request.getParameter("genre").split(",");
			movie_dao md = new movie_dao();
			
			String sql =" where movie_num<>"+num+"and( REGEXP_LIKE(genre,'"+a[0]+"')";
			
			for(int i=1;i<a.length;i++) {
				sql+="or REGEXP_LIKE(genre,'"+a[i]+"')";				
				
			}
			
			sql+=")";
			movie data = md.select(num);			
			
			request.setAttribute("movie", data);
		
			movie_dao mdd = new movie_dao();
			ArrayList<movie> dataA = mdd.selectAB(sql);			
			
			request.setAttribute("movieAB", dataA);
			
			view="movie/movie_detail.jsp";
		}else {
			System.out.println("-mv_h?-");
			
		}
		
		return view;
	}
	/*
	private Map<String,mv_able> makeMap(){
		//Map<String,mv_able> temp = new HashMap<>();
		//temp.put("movie_select.mv",new movie_select());
		
		return temp;
	}
	*/
	
}
