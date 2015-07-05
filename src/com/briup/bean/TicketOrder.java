package com.briup.bean;

import java.io.Serializable;

//����
public class TicketOrder implements Serializable {
	private int orderId;// ��Ʊ��� PRIMARY KEY
	private String flightnumber;// ���� NOT NULL REFERENCES FLIGHT.id
	private String realName;// �˿���ʵ���� NOT NULL
	private String certificationNumber; // ֤������ NOT NULL
	private String orderDate;// ��Ʊ���� NOT NULL
	private String CabinClass; // ��λ�ȼ� NOT NULL CHECK IN(F,C,Y)
	private String passengerType;// �˿����� NOT NULL CHECK IN(A,C,I)
	
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
