package com.lambton.person;

import com.lambton.VehicleRent;

import java.util.List;

public class Customer extends Person {

    private String address;
    private String city;
    List<VehicleRent> vehicleRent;

    public Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<VehicleRent> getVehicleRent() {
        return vehicleRent;
    }

    public void setVehicleRent(List<VehicleRent> vehicleRent) {
        this.vehicleRent = vehicleRent;
    }


    @Override
    public void display() {
        System.out.println("********************Displaying Customer Details********************");
        System.out.println("Customer [address=" + address + ", city=" + city + ", id="
                + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", gender="
                + getGender() + ", birthDate=" + getBirthDate() + ", age=" + getAge() + ", mobileNumber="
                + getMobileNumber() + ", emailId=" + getEmailId() + ", userName=" + getUserName() + ", password="
                + getPassword() + "]");

    }
}
