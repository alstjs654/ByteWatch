package drama;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class drama_watching implements drama_able{
	
	@Override
	public String service (HttpServletRequest request , HttpServletResponse response) {
		
		
		return "drama/watching_list.jsp";
	}

}
