package com.briup.bean;

import java.io.Serializable;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Flight implements Serializable{
	private Long oid;
	private String flightnumber;
	private String from_city;
	private String to_city;
	private String departureDate = "";
	private int firstClassRemainSeats = 0;
	private int businessClassRemainSeats = 0;
	private int economyClassRemainSeats = 0;
	private double fprice;
	private double bprice;
	private double eprice;
	public double getFprice() {
		return fprice;
	}

	public void setFprice(double fprice) {
		this.fprice = fprice;
	}

	public double getBprice() {
		return bprice;
	}

	public void setBprice(double bprice) {
		this.bprice = bprice;
	}

	public double getEprice() {
		return eprice;
	}

	public void setEprice(double eprice) {
		this.eprice = eprice;
	}

	private List<Flight> flights=null;

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public String getFrom_city() {
		return from_city;
	}

	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}

	public String getTo_city() {
		return to_city;
	}

	public void setTo_city(String to_city) {
		this.to_city = to_city;
	}

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public int getFirstClassRemainSeats() {
		return firstClassRemainSeats;
	}

	public void setFirstClassRemainSeats(int firstClassRemainSeats) {
		this.firstClassRemainSeats = firstClassRemainSeats;
	}

	public int getBusinessClassRemainSeats() {
		return businessClassRemainSeats;
	}

	public void setBusinessClassRemainSeats(int businessClassRemainSeats) {
		this.businessClassRemainSeats = businessClassRemainSeats;
	}

	public int getEconomyClassRemainSeats() {
		return economyClassRemainSeats;
	}

	public void setEconomyClassRemainSeats(int economyClassRemainSeats) {
		this.economyClassRemainSeats = economyClassRemainSeats;
	}
}
