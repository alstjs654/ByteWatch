package drama;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class drama_index implements drama_able{

	@Override
	public String service (HttpServletRequest request, HttpServletResponse response) {
		
		String view = null;
		
		drama_dao ddao = new drama_dao();
		ArrayList<drama>dlist=ddao.index_select();
		
		request.setAttribute("dimage", dlist);
		
		return "drama/drama_index.jsp";
	}
}
