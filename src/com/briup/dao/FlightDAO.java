package com.briup.dao;

import java.util.Calendar;
import java.util.List;

import com.briup.bean.Flight;

/**
 * 对航班和航班计划数据访问的接口。
 * 
 * @author 
 * 
 */
public interface FlightDAO {
	/**
	 * 根据指定出发地，目的地和出发日期在底层数据源中查找 得到所有的航班对象的集合。
	 * 
	 * @param fromAddr
	 *            出发地
	 * @param toAddr
	 *            目的地
	 * @param date
	 *            出发日期
	 * @return 航班集合
	 */
	public List getAllFlights(String fromAddr, String toAddr, Calendar date);
	public List getAllFlights(String fromAddr, String toAddr, String date);
	public List getAllFlights(String fromAddr, String toAddr);


	/**
	 * 该方法更新航班--删除过期航班，创建可以接受预订的航班。 航班的接受预订期是指从当前日期开始往后60天。
	 * 
	 */
	public void updateFlights();

	/**
	 * 得到所有航班计划对象
	 * 
	 * @return
	 */
	public List getAllFlightSchedulars();

	public boolean addFlight(Flight f); //增加航班
	
	public boolean removeFlight(String flightid);//删除航班
	
	public boolean updateFlight(Flight fl);
	
	public Flight findFlight(String flightid); //查找航班
	//public Flight searchFlight(FlightSchedular fs,String departureDate);
	public List searchFlight(String departureDate) ;
	public List getAllFlight() ;
	 

}