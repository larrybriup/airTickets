package com.briup.dao;

import java.util.Calendar;
import java.util.List;

import com.briup.bean.Flight;

/**
 * �Ժ���ͺ���ƻ����ݷ��ʵĽӿڡ�
 * 
 * @author 
 * 
 */
public interface FlightDAO {
	/**
	 * ����ָ�������أ�Ŀ�ĵغͳ��������ڵײ�����Դ�в��� �õ����еĺ������ļ��ϡ�
	 * 
	 * @param fromAddr
	 *            ������
	 * @param toAddr
	 *            Ŀ�ĵ�
	 * @param date
	 *            ��������
	 * @return ���༯��
	 */
	public List getAllFlights(String fromAddr, String toAddr, Calendar date);
	public List getAllFlights(String fromAddr, String toAddr, String date);
	public List getAllFlights(String fromAddr, String toAddr);


	/**
	 * �÷������º���--ɾ�����ں��࣬�������Խ���Ԥ���ĺ��ࡣ ����Ľ���Ԥ������ָ�ӵ�ǰ���ڿ�ʼ����60�졣
	 * 
	 */
	public void updateFlights();

	/**
	 * �õ����к���ƻ�����
	 * 
	 * @return
	 */
	public List getAllFlightSchedulars();

	public boolean addFlight(Flight f); //���Ӻ���
	
	public boolean removeFlight(String flightid);//ɾ������
	
	public boolean updateFlight(Flight fl);
	
	public Flight findFlight(String flightid); //���Һ���
	//public Flight searchFlight(FlightSchedular fs,String departureDate);
	public List searchFlight(String departureDate) ;
	public List getAllFlight() ;
	 

}