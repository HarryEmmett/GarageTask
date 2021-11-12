package com.qa.vehicles;

public class Car extends Vehicle {

	private int noOfDoors;
	private boolean automatic;

	public Car() {}

	public Car(String carMakeName, double price, String licenseNumber, int milage, boolean warranty, int noOfDoors, boolean automatic) {
		super(carMakeName, price, licenseNumber, milage, warranty);
		this.noOfDoors = noOfDoors;
		this.automatic = automatic;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Car: Make=" + getCarMakeName()
				+ ", Price=" + getPrice() + ", License Number=" + getLicenseNumber() + ", Milage="
				+ getMilage() + ", Warranty Included=" + isWarranty() + ",  Doors=" + noOfDoors + ", Automatic=" + automatic + ", ";
	}
	
}

