/**
 * 
 */
package org.dimgo.oop;

/**
 * <pre>
 * org.dimgo.oop
 * 	    └ Car
 * 1. 개요 :
 * 2. 작성일: 2017. 3. 23.
 * </pre>
 * @author 15기 신기섭
 * @vesion : 1.0
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;

	public String getCompany() { return company; }
	public String getModel() { return model; }
	public String getColor() { return color; }
	public int getMaxSpeed(){ return maxSpeed; }
	public int getPrice(){ return price; }
	public void setCompany(String tmp) { company = tmp; } 
	public void setModel(String tmp) { model = tmp; } 
	public void setColor(String tmp) { color = tmp; } 
	public void setMaxSpeed(int tmp) { maxSpeed = tmp; } 
	public void setPrice(int tmp) { price = tmp; } 
}
