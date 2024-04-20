package com.join4.www.dao;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JoinDao extends JdbcTemplate {
	public JoinDao() {
	}

	public JoinDao(DataSource dataSource) {
		super(dataSource);
		System.out.println("------------------"+dataSource+"  in Service-----");
	}
	
	public int join(HashMap<String, String> params) {
		
		String sql="INSERT INTO forum.join4_member "
				+ "(user_name, passwd, phone_number, email, auth_yn, pwd_chng_dtm, join_dtm) "
				+ "VALUES('"+params.get("userName")
				+ "', '"+params.get("passwd")
				+ "', '"+params.get("phoneNm")
				+ "', '"+params.get("email")
				+ "', 'N', '', DATE_FORMAT(NOW()  ,'%Y%m%d%H%i%s')); ";
		
		return update(sql);
	}
	
	

}
