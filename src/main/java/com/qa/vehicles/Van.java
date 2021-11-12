package com.qa.vehicles;

public class Van extends Vehicle {

	private int mpg;
	private int maxCarryWeight;

	public Van() {}

	public Van(String carMakeName, double price, String licenseNumber, int milage, boolean warranty, int mpg, int maxCarryWeight) {
		super(carMakeName, price, licenseNumber, milage, warranty);
		this.mpg = mpg;
		this.maxCarryWeight = maxCarryWeight;

	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}

	public int getMaxCarryWeight() {
		return maxCarryWeight;
	}

	public void setMaxCarryWeight(int maxCarryWeight) {
		this.maxCarryWeight = maxCarryWeight;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "Van: Make=" + getCarMakeName()
				+ ", Price=" + getPrice() + ", License Number=" + getLicenseNumber() + ", Milage="
				+ getMilage() + ", Warranty Included=" + isWarranty() + ",  Max MPG=" + mpg + ", Max Carry weight=" + maxCarryWeight + ", ";
	}
	
}
