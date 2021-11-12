package com.qa.vehicles;

public abstract class Vehicle {

	private String carMakeName;
	private double price;
	private String licenseNumber;
	private int milage;
	private boolean warranty;

	public Vehicle() {}

	public Vehicle(String carMakeName, double price, String licenseNumber, int milage, boolean warranty) {
		super();
		this.carMakeName = carMakeName;
		this.price = price;
		this.licenseNumber = licenseNumber;
		this.milage = milage;
		this.warranty = warranty;
	}
	
	public abstract double calculateBill(); 
	
	public String getCarMakeName() {
		return carMakeName;
	}

	public void setCarMakeName(String carMakeName) {
		this.carMakeName = carMakeName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public boolean isWarranty() {
		return warranty;
	}

	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Vehicle [carMakeName=" + carMakeName + ", price=" + price + ", licenseNumber=" + licenseNumber
				+ ", milage=" + milage + ", warranty=" + warranty + "]";
	}


}