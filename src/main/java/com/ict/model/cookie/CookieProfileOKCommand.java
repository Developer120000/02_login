package com.ict.model.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.basic.BasicDAO;
import com.ict.db.basic.BasicVO;
import com.ict.db.cookie.CookieDAO;
import com.ict.db.cookie.CookieVO;

public class CookieProfileOKCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 쿠키를 이용해서 id가 넘어온다.
		// 쿠키는 배열로밖에 못받는다.
		Cookie[] cookies = request.getCookies();
		String id = null;
		if(cookies != null && cookies.length > 0) {
			for (int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("id")) {
					id = cookies[i].getValue();
					CookieVO cvo = CookieDAO.getDetail(id);
					request.setAttribute("cvo", cvo);
					return "view/cookie/detail.jsp";
				}
			}
		}
		// 무조건 성공이라 null 넣으면됨
		return null;
	}

}
