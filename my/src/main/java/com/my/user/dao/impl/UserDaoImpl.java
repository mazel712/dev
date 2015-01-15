package com.my.user.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.my.user.dao.UserDao;
import com.my.user.model.UserModel;

@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport  implements UserDao{

	@Override
	public UserModel findByUsername(String username) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("UserDao.findByUsername", username);
	}

	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

}
