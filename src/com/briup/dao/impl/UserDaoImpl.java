package com.briup.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.briup.bean.User;
import com.briup.dao.UserDao;

public class UserDaoImpl implements UserDao{
	private SessionFactory sessionFactory;


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User getUser(int userId) {
		Session session=sessionFactory.openSession();
		String hql="from User u where u.userid="+userId;
		Query query = session.createQuery(hql);
		Object o = query.uniqueResult();
		return (User) o;
	}
	@Override
	public User getUser(String name) {
		Session session=sessionFactory.openSession();
		String hql="from User u where u.name='"+name+"'";
		Query query = session.createQuery(hql);
		Object o = query.uniqueResult();
		return (User) o;
	}
	@Override
	public User getUser(String name, String passwd) {
		Session session=sessionFactory.openSession();
		String hql="from User u where u.name='"+name
				+"' and u.password='"+passwd+"'";
		Query query = session.createQuery(hql);
		Object o = query.uniqueResult();
		return (User) o;
	}

	@Override
	public List<User> getUser() {
		
		Session session=sessionFactory.openSession();
		String hql="from User";
		Query query = session.createQuery(hql);
		List<User> list = query.list();
		return (List<User>) list;
	}

	@Override
	public boolean addUser(User user) {
		Session session=null;
		try {
			session= sessionFactory.getCurrentSession();
		} catch (Exception e) {
			e.printStackTrace();
			session=sessionFactory.openSession();
		}
		boolean result = false;
		try {
			session.save(user);
			result = true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean removeUser(String name) {
		Session session=null;
		try {
			session= sessionFactory.getCurrentSession();
		} catch (Exception e) {
			e.printStackTrace();
			session=sessionFactory.openSession();
		}
		boolean result = false;
		try {
			String hql="delete from User u where u.name='"+name+"'";
			Query query = session.createQuery(hql);
			int i = query.executeUpdate();
			if(i>0){
				result=true;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean modifyPassword(String name, String oldPassword,
			String newPassword) {
		Session session=null;
		try {
			session= sessionFactory.getCurrentSession();
		} catch (Exception e) {
			e.printStackTrace();
			session=sessionFactory.openSession();
		}
		boolean result = false;
		try {
			String hql="update User u set u.password='"+newPassword+
					"' where u.name='"+name+
					"' and u.password='"+oldPassword+"'";
			Query query = session.createQuery(hql);
			int i = query.executeUpdate();
			if(i>0){
				result=true;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return result;
	}

	
}
