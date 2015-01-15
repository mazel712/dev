package com.my.login.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.my.common.dao.UserInfoMapper;
import com.my.common.model.UserInfo;
import com.my.common.model.UserInfoExample;
import com.my.login.service.LoginService;
import com.my.user.dao.UserDao;
import com.my.user.model.UserModel;

@Transactional
@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	private UserDao userDao;

	@Override
	public UserInfo login(String username, String password) {
		UserInfoExample example = new UserInfoExample();
		UserInfoExample.Criteria c = example.createCriteria();
		c.andLoginNameEqualTo(username).andPasswordEqualTo(password);
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public UserModel findByUsername(String username) {
		return userDao.findByUsername(username);
	}
}
