package com.briup.dao;

import com.briup.bean.Admin;

public interface  AdminDao {
	public boolean addAdmin(Admin admin);
	Admin findByName(String userName,String passwd);
}
