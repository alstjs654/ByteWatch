package drama;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class drama_detail implements drama_able{

	@Override
	public String service (HttpServletRequest request, HttpServletResponse response) {
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		drama_dao ddao = new drama_dao();
		drama data = ddao.select(num);
		
	
		request.setAttribute("drama", data);
		
		return "drama/drama_detail.jsp";
	}
}
