package com.briup.bean;

import java.io.Serializable;

//订单
public class TicketOrder implements Serializable {
	private int orderId;// 机票编号 PRIMARY KEY
	private String flightnumber;// 航班 NOT NULL REFERENCES FLIGHT.id
	private String realName;// 乘客真实姓名 NOT NULL
	private String certificationNumber; // 证件号码 NOT NULL
	private String orderDate;// 出票日期 NOT NULL
	private String CabinClass; // 舱位等级 NOT NULL CHECK IN(F,C,Y)
	private String passengerType;// 乘客类型 NOT NULL CHECK IN(A,C,I)
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getCertificationNumber() {
		return certificationNumber;
	}

	public void setCertificationNumber(String certificationNumber) {
		this.certificationNumber = certificationNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCabinClass() {
		return CabinClass;
	}

	public void setCabinClass(String cabinClass) {
		CabinClass = cabinClass;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	
}
