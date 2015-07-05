package com.briup.service;

import java.util.List;

import com.briup.bean.User;

public interface UserService {
	public User getUser(int userId);

	public User getUser(String name);

	public User getUser(String name, String password);

	public List<User> getUser();

	public boolean addUser(User user);

	public boolean modifyPassword(String name, String oldPassword,
			String newPassword);

	public boolean removeUser(String name);
}
