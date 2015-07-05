package com.briup.service.impl;

import java.util.List;

import com.briup.bean.User;
import com.briup.dao.UserDao;
import com.briup.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;


	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getUser(int userId) {
		User user = userDao.getUser(userId);
		return user;
	}

	@Override
	public User getUser(String name) {
		User user = userDao.getUser(name);
		return user;
	}

	@Override
	public User getUser(String name, String password) {
		User user = userDao.getUser(name, password);
		return user;
	}

	@Override
	public List<User> getUser() {
		List<User> list = userDao.getUser();
		return list;
	}

	@Override
	public boolean addUser(User user) {
		boolean flag=userDao.addUser(user);
		return flag;
	}

	@Override
	public boolean modifyPassword(String name, String oldPassword,
			String newPassword) {
		boolean flag=userDao.modifyPassword(name, oldPassword, newPassword);
		return flag;
	}

	@Override
	public boolean removeUser(String name) {
		boolean flag=userDao.removeUser(name);
		return flag;
	}

}
