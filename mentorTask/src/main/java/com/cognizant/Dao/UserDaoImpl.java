package com.cognizant.Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.model.User;
@Repository
@Qualifier
public class UserDaoImpl implements UserDao{
	
	@Autowired
	//private JdbcTemplate jdbc;
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Override
	public boolean check(User user) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<>();
		map.put("username", user.getUserName());
		map.put("password",user.getPassword());
		String sqlName = "select * from Login where username = :username and password = :password";
		List<User> list = namedParameterJdbcTemplate.query(sqlName, map,
				(rs, rowNum) -> new User(rs.getString(2), rs.getString(3)));
		if(list.size()==1) {
			return true;
		}
		return false;
	}
	

}
