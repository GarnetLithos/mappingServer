package com.mapping.server.common.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mapping.server.common.model.TestObject;

@Repository
public class CommonRepository {

	@Autowired
	private SqlSession sqlSession;
	
	public TestObject testRepository() {
		return sqlSession.selectOne("testMapper.testGet");
	}

}
