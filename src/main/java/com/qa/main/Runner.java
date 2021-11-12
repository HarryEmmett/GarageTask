package com.qa.main;

import com.qa.vehicles.Car;
import java.util.ArrayList;
import com.qa.garage.Garage;
import com.qa.vehicles.Motorcycle;
import com.qa.vehicles.Van;
import com.qa.vehicles.Vehicle;

public class Runner {

	public static void main(String[] args) {

		Car c = new Car("Toyota", 1599.99, "YH145 432", 13890, false, 5, true);
		Motorcycle m = new Motorcycle("Suzuki", 1299.99, "HE234 675", 70854, true, 2, 200);
		Van v = new Van("Mercedes Sprinter", 8999.99, "ZG344 102", 99999, true, 38, 10);

		Garage g = new Garage();
		System.out.println("----------Added vehicles.----------");
		g.addVehicles(c);
		g.addVehicles(m);
		g.addVehicles(v);
		g.printVehicle();

		System.out.println("----------Removed vehicles.----------");
		g.removeVehicles(c);
		g.removeVehicles(m);
		g.removeVehicles(v);
		g.printVehicle();

		System.out.println("----------Re-added vehicles.----------");
		g.addVehicles(c);
		g.addVehicles(m);
		g.addVehicles(v);
		g.printVehicle();

		System.out.println("----------Hourly bill per rental hour.----------");
		g.bill(c);
		g.bill(m);
		g.bill(v);

		System.out.println("----------Hourly fix rate per vehicle type.----------");
		g.fix(c);
		g.fix(m);
		g.fix(v);

		System.out.println("----------Garage clear method ran.----------");
		g.clearGarage();

	}
}

//String carMakeName, double price, String licenseNumber, int milage, boolean warranty, int noOfDoors, boolean automatic
//String carMakeName, double price, String licenseNumber, int milage, boolean warranty, int noOfWheels, int maxMPH
//String carMakeName, double price, String licenseNumber, int milage, boolean warranty, int mpg, int maxCarryWeight