package com.prog.carapp.Model;

public class Bean {
 int id;
 String carName;
 String carmodel;
 int year;
 int price;
 
 
 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
 public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Bean() {
		
		
	}
	
	
	
	
	
	
	public Bean(String carName, String carmodel, int year, int price) {
		super();
		this.carName = carName;
		this.carmodel = carmodel;
		this.year = year;
		this.price = price;
	}
	
	/*
	 * public Bean(int id, String carName, String carmodel, int year, int price) {
	 * super(); this.id = id; this.carName = carName; this.carmodel = carmodel;
	 * this.year = year; this.price = price; }
	 */
	
	@Override
	public String toString() {
		return "Bean [id=" + id + ", carName=" + carName + ", carmodel=" + carmodel + ", year=" + year + ", price="
				+ price + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

