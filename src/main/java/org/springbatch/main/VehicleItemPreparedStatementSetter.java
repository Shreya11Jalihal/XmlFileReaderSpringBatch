package org.springbatch.main;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springbatch.model.Vehicle;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

public class VehicleItemPreparedStatementSetter implements ItemPreparedStatementSetter<Vehicle> {

	public void setValues(Vehicle vehicle, PreparedStatement ps) throws SQLException {
		ps.setLong(1, vehicle.getVIN());
		ps.setString(2, vehicle.getBrand());
		ps.setString(3, vehicle.getCountry());
		ps.setString(4, vehicle.getContractName());
		ps.setDate(5, new java.sql.Date(vehicle.getProcessingDate().toDate().getTime()));
	}

}