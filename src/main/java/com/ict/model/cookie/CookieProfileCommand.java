package com.ict.model.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.net.aso.l;

public class CookieProfileCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 쿠키를 이용해서 패스워드가 넘어온다.
		// 쿠키는 배열로밖에 못받는다.
		Cookie[] cookies = request.getCookies();
		String pwd = null;
		if(cookies != null && cookies.length > 0) {
			for (int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("pwd")) {
					pwd = cookies[i].getValue();
				}
			}
		}
		
		// 쿠키에서 받은값 저장
		request.setAttribute("pwd", pwd);
		return "view/cookie/profile.jsp";
	}

}
