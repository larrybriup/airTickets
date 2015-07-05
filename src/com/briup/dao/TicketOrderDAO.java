package com.briup.dao;

import java.util.List;

import com.briup.bean.TicketOrder;

/**
 * ��Ʊ��Ʊ��¼���ʽӿ�
 * 
 * @author
 * 
 */
public interface TicketOrderDAO {

	public boolean order(TicketOrder ord);

	public boolean cancelOrder(int TicketNumber);

	public List<TicketOrder> getAllTicketOrder(
			String startDate, String endDate);
	
	public List order();
	
}