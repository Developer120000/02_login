package com.ict.model.session;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ict.db.session.SessionVO;

import oracle.net.aso.l;

public class SessionProfileCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// session 에 저장된 svo 를 꺼내자
//		HttpSession session = request.getSession();
//		SessionVO svo = (SessionVO) session.getAttribute("svo"); // 오브젝트로 나오기때문에 형변환 해줘야됨
//		
//		request.setAttribute("pwd", svo.getPwd());
		
		// 세션에 저장되어 있어서 el 사용해서 꺼낼수 있다
		// el 은 pageContent, Application, session, request 저장되어있는거 사용가능
		return "view/session/profile.jsp";
	}

}
