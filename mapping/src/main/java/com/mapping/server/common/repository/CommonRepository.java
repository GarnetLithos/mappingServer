package com.mapping.server.common.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mapping.server.main.model.User;

@Repository
public class CommonRepository {

	@Autowired
	private SqlSession sqlSession;
	
	public User testRepository() {
		return sqlSession.selectOne("userMapper.testGetUser");
	}

}
