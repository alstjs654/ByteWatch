package drama;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.movie;

public class drama_detail implements drama_able{

	@Override
	public String service (HttpServletRequest request, HttpServletResponse response) {
		
		int num = Integer.parseInt(request.getParameter("num"));
		String[] a =request.getParameter("genre").split(",");
		
		drama_dao ddao = new drama_dao();
		
		String sql =" where drama_num<>"+num+"and( REGEXP_LIKE(genre,'"+a[0]+"')";
		
		for(int i=1;i<a.length;i++) {
			sql+="or REGEXP_LIKE(genre,'"+a[i]+"')";				
			
		}
		
		sql+=")";
		
		drama data = ddao.select(num);
		
		ArrayList<drama> dataA = ddao.selectAB(sql,6);			
		
		request.setAttribute("dramaAB", dataA);
		
		request.setAttribute("drama", data);
		
		
		return "drama/drama_detail.jsp";
	}
}
