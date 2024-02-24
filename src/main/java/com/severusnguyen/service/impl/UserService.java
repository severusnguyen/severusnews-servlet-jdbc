package com.severusnguyen.service.impl;

import com.severusnguyen.dao.IUserDAO;
import com.severusnguyen.dao.impl.UserDAO;
import com.severusnguyen.model.UserModel;
import com.severusnguyen.service.IUserService;

public class UserService implements IUserService {

	private IUserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}
	
}
