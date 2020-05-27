package org.springbatch.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.LocalDate;

@XmlRootElement(name = "Contract")
public class Vehicle {

	private long VIN;

	private String brand;

	private String country;

	private String contractName;

	private LocalDate processingDate;

	@XmlElement(name = "VIN")
	public long getVIN() {
		return VIN;
	}

	public void setVIN(long vIN) {
		VIN = vIN;
	}

	@XmlElement(name = "Brand")
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@XmlElement(name = "Country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@XmlElement(name = "ContractName")
	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	@XmlElement(name = "ProcessingDate")
	@XmlJavaTypeAdapter(type = LocalDate.class, value = org.springbatch.main.LocalDateAdapter.class)
	public LocalDate getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(LocalDate processingDate) {
		this.processingDate = processingDate;
	}

	@Override
	public String toString() {
		return "Vehicle [VIN=" + VIN + ", brand=" + brand + ", country=" + country + ", contractName=" + contractName
				+ ", processingDate=" + processingDate + "]";
	}

}
