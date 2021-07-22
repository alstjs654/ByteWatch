package drama;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class drama_research implements drama_able{

	@Override
	public String service (HttpServletRequest request, HttpServletResponse response) {
		
		String cate = request.getParameter("ct");
		
		String sql = "where season='research' ";
		
		
		return "drama/drama_list.jsp";
		
	}
}
