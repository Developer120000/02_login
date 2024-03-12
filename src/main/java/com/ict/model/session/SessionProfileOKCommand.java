package com.ict.model.session;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.basic.BasicDAO;
import com.ict.db.basic.BasicVO;
import com.ict.db.cookie.CookieDAO;
import com.ict.db.cookie.CookieVO;

public class SessionProfileOKCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// db 안갔다와도 세션으로 보내면된다.
		return "view/session/detail.jsp";
	}

}
