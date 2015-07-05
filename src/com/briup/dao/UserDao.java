package com.briup.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.briup.bean.User;

public interface UserDao {
	/**
	 * 根据给定的姓名和密码在底层数据源中查找营业员的纪录， 若找到，则返回该营业员对象，若没找到或密码错误则返回null。
	 * 
	 * @param name
	 *            营业员姓名
	 * @param passwd
	 *            营业员密码
	 * @return 找到的营业员对象或null
	 */
	public User getUser(String name, String passwd);
	public User getUser(String name);
	/**
	 * 向底层数据中添加一个营业员纪录。
	 * 
	 * @param user
	 *            要添加的营业员对象
	 * @return 若添加成功返回true，否则返回false。
	 */
	public boolean addUser(User user);

	/**
	 * 根据指定的营业员的姓名在底层数据源中删除该营业员。
	 * 
	 * @param name
	 *            营业员姓名
	 * @return 若删除成功返回true，否则返回false。
	 */
	public boolean removeUser(String name);

	/**
	 * 修改指定营业员的密码。
	 * 
	 * @param name
	 *            营业员姓名
	 * @param oldPassword
	 *            旧密码
	 * @param newPassword
	 *            新密码
	 * @return 若修改成功返回true，否则返回false。
	 */
	public boolean modifyPassword(String name, String oldPassword,
			String newPassword);
	public List<User> getUser();
	
	public User getUser(int userId);
}
