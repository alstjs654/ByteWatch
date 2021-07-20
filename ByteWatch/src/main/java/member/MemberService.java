package member;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

public class MemberService {

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
		case "findPw.me":
			findPw(request, response);
			return "findpw.jsp";
		case "editNickname.me":
			editNickname(request, response);
			return "myinfo.jsp";
		case "editEmail.me":
			editEmail(request, response);
			return "myinfo.jsp";
		case "changePw.me":
			changePassword(request, response);
			break;
		case "deleteAccount.me":
			deleteAccount(request, response);
			break;
		}
		return null;
	}

	private void deleteAccount(HttpServletRequest request, HttpServletResponse response) {
		Member currentMember = (Member) request.getSession().getAttribute("user");
		String id = currentMember.getId();
		
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.deleteMemberById(id);
		request.getSession().removeAttribute("user");
		try {
			response.sendRedirect("index.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void changePassword(HttpServletRequest request, HttpServletResponse response) {
		String newPw = request.getParameter("newPw");
		Member currentMember = (Member) request.getSession().getAttribute("user");
		
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.update("pw", newPw, "id", currentMember.getId());
		request.getSession().removeAttribute("user");
	}

	private void editEmail(HttpServletRequest request, HttpServletResponse response) {
		String newEmail = request.getParameter("newEmail");
		String oldEmail = request.getParameter("oldEmail");
		
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.update("email", newEmail, "email", oldEmail);
		
		Member member = (Member) request.getSession().getAttribute("user");
		member = memberDAO.getMemberById(member.getId());
		request.getSession().removeAttribute("user");
		request.getSession().setAttribute("user", member);
	}

	private void editNickname(HttpServletRequest request, HttpServletResponse response) {
		String newNickname = request.getParameter("newNickname");
		String oldNickname = request.getParameter("oldNickname");
		
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.update("nickname",newNickname, "email", oldNickname);
		
		Member member = memberDAO.getMemberByNickname(newNickname);
		request.getSession().removeAttribute("user");
		request.getSession().setAttribute("user", member);
	}

	private void findPw(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		MemberDAO memberDAO = new MemberDAO();
		String pw = memberDAO.findPw(id, email);
		request.setAttribute("foundPw", pw);
	}

	private void findId(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		MemberDAO memberDAO = new MemberDAO();
		String id = memberDAO.findIdByEmail(email);
		request.setAttribute("foundId", id);
	}

	private void login(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		MemberDAO memberDAO = new MemberDAO();
		if (memberDAO.isMember(id, pw)) {
			Member user = memberDAO.getMemberById(id);
			request.getSession().setAttribute("user", user);
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

	private void join(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nickname = request.getParameter("nickname");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		request.getSession().removeAttribute("idUnique");
		request.getSession().removeAttribute("nicknameUnique");
		
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.insertMember(id, pw, nickname, email, age);
		try {
			Member user = memberDAO.getMemberById(id);
			request.getSession().setAttribute("user", user);
			response.sendRedirect("login.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void logout(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute("user");
		try {
			response.sendRedirect("login.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void checkId(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("query");
		MemberDAO memberDAO = new MemberDAO();
		
		if (memberDAO.isUnique(id, "id")) {
			request.getSession().setAttribute("idUnique", id);
		} else {
			request.getSession().setAttribute("idUnique", 0);
		}
	}

	private void checkNickname(HttpServletRequest request, HttpServletResponse response) {
		String nickname = request.getParameter("query");
		MemberDAO memberDAO = new MemberDAO();
		
		if (memberDAO.isUnique(nickname, "nickname")) {
			request.getSession().setAttribute("nicknameUnique", nickname);
		} else {
			request.getSession().setAttribute("nicknameUnique", 0);
		}
	}
}
