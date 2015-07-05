package com.briup.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.briup.bean.User;

public interface UserDao {
	/**
	 * ���ݸ����������������ڵײ�����Դ�в���ӪҵԱ�ļ�¼�� ���ҵ����򷵻ظ�ӪҵԱ������û�ҵ�����������򷵻�null��
	 * 
	 * @param name
	 *            ӪҵԱ����
	 * @param passwd
	 *            ӪҵԱ����
	 * @return �ҵ���ӪҵԱ�����null
	 */
	public User getUser(String name, String passwd);
	public User getUser(String name);
	/**
	 * ��ײ����������һ��ӪҵԱ��¼��
	 * 
	 * @param user
	 *            Ҫ��ӵ�ӪҵԱ����
	 * @return ����ӳɹ�����true�����򷵻�false��
	 */
	public boolean addUser(User user);

	/**
	 * ����ָ����ӪҵԱ�������ڵײ�����Դ��ɾ����ӪҵԱ��
	 * 
	 * @param name
	 *            ӪҵԱ����
	 * @return ��ɾ���ɹ�����true�����򷵻�false��
	 */
	public boolean removeUser(String name);

	/**
	 * �޸�ָ��ӪҵԱ�����롣
	 * 
	 * @param name
	 *            ӪҵԱ����
	 * @param oldPassword
	 *            ������
	 * @param newPassword
	 *            ������
	 * @return ���޸ĳɹ�����true�����򷵻�false��
	 */
	public boolean modifyPassword(String name, String oldPassword,
			String newPassword);
	public List<User> getUser();
	
	public User getUser(int userId);
}
