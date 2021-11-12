package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.vehicles.Car;
import com.qa.vehicles.Vehicle;

public class Garage {

	ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();

	public void addVehicles(Vehicle vehicle) {

		listOfVehicles.add(vehicle);

	}

	public void removeVehicles(Vehicle vehicle) {

		listOfVehicles.remove(vehicle);

	}

	public void clearGarage() {

		listOfVehicles.clear();

	}

	public void printVehicle() {

		for (Vehicle i : listOfVehicles) {
			System.out.println(i);
		}
	}

	public void bill(Vehicle vehicle) {
		double baseRentalRate = 85.00;
		double carRentalRate = 1.25;
		double motorycleRentalRate = 1.10;
		double vanRentalRate = 2.50;
		
		if (vehicle.getClass().getSimpleName().equals("Car")) {
			System.out.println("Hourly rental for a car: £" + baseRentalRate * carRentalRate);
		} else if (vehicle.getClass().getSimpleName().equals("Motorcycle")) {
			System.out.println("Hourly rental for a Motorcycle: £" + baseRentalRate * motorycleRentalRate);
		} else if (vehicle.getClass().getSimpleName().equals("Van")) {
			System.out.println("Hourly rental for a van: £" + baseRentalRate *  vanRentalRate);
		} else {
			System.out.println("No vehicles");
		}
	}
	
	public void fix(Vehicle vehicle) {
		double hourlyLabour = 55.00;
		double carRentalRate = 1.5;
		double motorycleRentalRate = 1.00;
		double vanRentalRate = 2.00;
		
		if (vehicle.getClass().getSimpleName().equals("Car")) {
			System.out.println("Car fix estimate per hour: £" + hourlyLabour * carRentalRate);
		} else if (vehicle.getClass().getSimpleName().equals("Motorcycle")) {
			System.out.println("Motorcycle fix estimate per hour: £" + hourlyLabour * motorycleRentalRate);
		} else if (vehicle.getClass().getSimpleName().equals("Van")) {
			System.out.println("Van fix estimate per hour: £" + hourlyLabour * vanRentalRate);
		} else {
			System.out.println("No vehicles");
		}
	}
	
	//finish 
	public void removeMultipleVehiclesByType(Vehicle vehicle) {
		if (vehicle.getClass().getSimpleName().equals("Car")) {
			listOfVehicles.remove(Car)
		} else if (vehicle.getClass().getSimpleName().equals("Motorcycle")) {
			listOfVehicles.remove(Motorcycle)
		} else if (vehicle.getClass().getSimpleName().equals("Van")) {
			listOfVehicles.remove(Van)
		} else {
			System.out.println("No vehicles");
		}
	}
}



