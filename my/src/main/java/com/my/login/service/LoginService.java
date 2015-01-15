package com.my.login.service;

import com.my.common.model.UserInfo;
import com.my.user.model.UserModel;

public interface LoginService {

	UserInfo login(String username, String object);

	UserModel findByUsername(String username);

}
