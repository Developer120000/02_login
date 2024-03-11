package com.ict.model.cookie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.basic.BasicDAO;
import com.ict.db.basic.BasicVO;
import com.ict.db.cookie.CookieDAO;
import com.ict.db.cookie.CookieVO;

public class CookieJoinOKCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return null;
	}

}
