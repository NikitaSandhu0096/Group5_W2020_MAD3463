package com.lambton.person;

import com.lambton.VehicleRent;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person
{
    VehicleRent vr;

    private String address;
    private String city;
    List<VehicleRent> vehicleRent;

    public Customer(){
        super();
    }

    public Customer(int Id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                    int mobileNumber, String emailId, String userName, String password, String address, String city){
        super(Id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.address = address;
        this.city = city;
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
