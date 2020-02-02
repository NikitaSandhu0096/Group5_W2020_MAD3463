package com.lambton.vehicle;

import com.lambton.IDisplay;
import com.lambton.person.Driver;

import java.util.HashMap;

//enum vehicleFuelType{
//    DIESEL,
//    PETROL,
//    ELECTRIC
//}

public abstract class Vehicle implements IDisplay {

    private String identificationNumber;
    private String description;
    private boolean isSelfDrive;
    private String manufacturerName;
    private boolean isInsured;
    private int vehicleNoOfSeats;
    private String insuranceProviderName;
    private int seat;
    private String fuelType;
    private double ratePerDay;
    private double ratePerKm;
    private Driver driver;

    public Vehicle() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSelfDrive() {
        return isSelfDrive;
    }

    public void setSelfDrive(boolean isSelfDrive) {
        this.isSelfDrive = isSelfDrive;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean isInsured) {
        this.isInsured = isInsured;
    }

    public int getVehicleNoOfSeats() {
        return vehicleNoOfSeats;
    }

    public void setVehicleNoOfSeats(int vehicleNoOfSeats) {
        this.vehicleNoOfSeats = vehicleNoOfSeats;
    }

    public String getInsuranceProviderName() {
        return insuranceProviderName;
    }

    public void setInsuranceProviderName(String insuranceProviderName) {
        this.insuranceProviderName = insuranceProviderName;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    public void setRatePerDay(double ratePerDay) {
        this.ratePerDay = ratePerDay;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
