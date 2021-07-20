package member;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

public class MemberService {
	public MemberService() {
	}

	public String action(HttpServletRequest request, HttpServletResponse response, String cmd) {
		switch (cmd) {
		case "login.me":
			login(request, response);
			break;
		case "join.me":
			join(request, response);
			break;
		case "logout.me":
			logout(request, response);
			break;
		case "checkId.me":
			checkId(request, response);
			return "checkID.jsp";
		case "checkNickname.me":
			checkNickname(request, response);
			return "checkNick.jsp";
		case "findId.me":
			findId(request, response);
			return "findid.jsp";
		}
		return null;
	}

	private void findId(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		MemberDAO memberDAO = new MemberDAO();
		String id = memberDAO.findIdByEmail(email);
	}

	public void login(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		MemberDAO memberDAO = new MemberDAO();
		if (memberDAO.isMember(id, pw)) {
			request.getSession().setAttribute("user", id);
			try {
				response.sendRedirect("index.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				response.sendRedirect("login.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void join(HttpServletRequest request, HttpServletResponse response) {
		String id = (String)request.getSession().getAttribute("idUnique");
		String pw = request.getParameter("pw");
		String nickname = (String)request.getSession().getAttribute("nicknameUnique");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		request.getSession().removeAttribute("idUnique");
		request.getSession().removeAttribute("nicknameUnique");
		
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.insertMember(id, pw, nickname, email, age);
		try {
			request.setAttribute("user", id);
			response.sendRedirect("login.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void logout(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute("user");
		try {
			response.sendRedirect("login.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void checkId(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("query");
		MemberDAO memberDAO = new MemberDAO();
		
		if (memberDAO.isUnique(id, "id")) {
			request.getSession().setAttribute("idUnique", id);
		} else {
			request.getSession().setAttribute("idUnique", 0);
		}
	}

	public void checkNickname(HttpServletRequest request, HttpServletResponse response) {
		String nickname = request.getParameter("query");
		MemberDAO memberDAO = new MemberDAO();
		
		if (memberDAO.isUnique(nickname, "nickname")) {
			request.getSession().setAttribute("nicknameUnique", nickname);
		} else {
			request.getSession().setAttribute("nicknameUnique", 0);
		}
	}
}
