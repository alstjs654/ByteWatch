package drama;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class drama_research implements drama_able{

	@Override
	public String service (HttpServletRequest request, HttpServletResponse response) {
		
		String cate = request.getParameter("ct");
		String[] couuntry = {  };
		
		String sql="";
		if(cate!=null) {
			String part = request.getParameter("part").equals("g") ? "genre" : "country";
			String[] a = cate.split(",");
		
			sql = "where REGEXP_LIKE("+part+",'"+a[0]+"')";
			
			for(int i=1;i<a.length;i++) {
				sql+="or REGEXP_LIKE("+part+",'"+a[i]+"')";				
				
			}
		}
		drama_dao ddao = new drama_dao();
		
		
		ArrayList<drama> dataA = ddao.selectAB(sql,24);			
		
		request.setAttribute("drama", dataA);
		
		
		
		
		return "drama/drama_list.jsp";
		
	}
}
