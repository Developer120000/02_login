package com.ict.db.basic;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BasicDBService {
	static private SqlSessionFactory factory;
	static String resource = "com/ict/db/basic/basic_config.xml";
	// static 초기화
	static {
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);
			
		} catch (Exception e) {
		}
	}
	
	// DAO 에서 factory 를 호출할 메소드
	public static SqlSessionFactory getFactory() {
		return factory;
	} 
	
}
