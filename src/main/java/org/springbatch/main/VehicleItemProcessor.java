package org.springbatch.main;

import org.joda.time.LocalDate;
import org.springbatch.model.Vehicle;
import org.springframework.batch.item.ItemProcessor;

public class VehicleItemProcessor implements ItemProcessor<Vehicle, Vehicle> {

//Eliminate all the Vehicle Values in the xml File which has a processing Date older than today 
	public Vehicle process(Vehicle vehicle) throws Exception {
		if (vehicle.getProcessingDate().compareTo(new LocalDate()) <=0) {
			return null;
		}
		System.out.println(vehicle.getProcessingDate());
		return vehicle;

	}

}