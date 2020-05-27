package org.springbatch.main;

import org.joda.time.LocalDate;
import org.springbatch.model.Vehicle;
import org.springframework.batch.item.ItemProcessor;

public class VehicleItemProcessor implements ItemProcessor<Vehicle, Vehicle> {

	public Vehicle process(Vehicle vehicle) throws Exception {
		if (vehicle.getProcessingDate().compareTo(new LocalDate()) <= 1) {
			return null;
		}
		return vehicle;

	}

}