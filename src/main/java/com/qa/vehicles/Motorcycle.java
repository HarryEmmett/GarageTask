package com.qa.vehicles;

public class Motorcycle extends Vehicle {

	private int noOfWheels;
	private int maxMPH;

	public Motorcycle() {
	}

	public Motorcycle(String carMakeName, double price, String licenseNumber, int milage, boolean warranty, int noOfWheels, int maxMPH) {
		super(carMakeName, price, licenseNumber, milage, warranty);
		this.noOfWheels = noOfWheels;
		this.maxMPH = maxMPH;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getMaxMPH() {
		return maxMPH;
	}

	public void setMaxMPH(int maxMPH) {
		this.maxMPH = maxMPH;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "Motorcycle: Make=" + getCarMakeName()
				+ ", Price=" + getPrice() + ", License Number=" + getLicenseNumber() + ", Milage="
				+ getMilage() + ", Warranty Included=" + isWarranty() + ",  Number of wheels=" + noOfWheels + ", Max MPH=" + maxMPH + ", ";
	}
}
