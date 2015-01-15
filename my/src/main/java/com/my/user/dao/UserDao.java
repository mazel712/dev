package com.my.user.dao;

import com.my.user.model.UserModel;

public interface UserDao {

	UserModel findByUsername(String username);

}
