package com.example.demo;

public class CustomerDetails {
	private String firstName;
	private String lastName;
	private String vehicleNo;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	@Override
	public String toString() {
		return "CustomerDetails [firstName=" + firstName + ", lastName=" + lastName + ", vehicleNo=" + vehicleNo + "]";
	}
}
