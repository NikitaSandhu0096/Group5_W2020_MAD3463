package com.lambton.vehicle;

import com.lambton.IDisplay;

import java.util.HashMap;

enum vehicleFuelType{
    DIESEL,
    PETROL,
    ELECTRIC
}

public abstract class Vehicle implements IDisplay {

    protected int vehicleIdentificationNumber;
    protected String vehicleDescription;
    protected boolean vehicleIsSelfDrive;
    protected String vehicleManufacturerName;
    protected String vehicleDriverName;
    protected String vehicleInsuranceProviderName;
    protected int vehicleNoOfSeats;
    protected HashMap<String, Float> vehicleBaseRatePerDay = new HashMap<String, Float>();
    protected HashMap<String, Float> vehicleRatePerKm = new HashMap<String, Float>();
    protected boolean vehicleIsInsured;
    protected vehicleFuelType vehicleFuelType;


    public  Vehicle(){

    }
    public Vehicle(int vehicleIdentificationNumber,String vehicleDescription,boolean vehicleIsSelfDrive,String vehicleManufacturerName,
                   String vehicleDriverName, String vehicleInsuranceProviderName, int vehicleNoOfSeats,
                   HashMap<String, Float> vehicleBaseRatePerDay,
                   HashMap<String, Float> vehicleRatePerKm,boolean vehicleIsInsured,vehicleFuelType vehicleFuelType)
    {
        this.vehicleIdentificationNumber=vehicleIdentificationNumber;
        this.vehicleDescription=vehicleDescription;
        this.vehicleIsSelfDrive=vehicleIsSelfDrive;
        this.vehicleManufacturerName=vehicleManufacturerName;
        this.vehicleDriverName=vehicleDriverName;
        this.vehicleInsuranceProviderName=vehicleInsuranceProviderName;
        this.vehicleNoOfSeats=vehicleNoOfSeats;
        this.vehicleBaseRatePerDay=vehicleBaseRatePerDay;
        this.vehicleRatePerKm=vehicleRatePerKm;
        this.vehicleIsInsured=vehicleIsInsured;
        this.vehicleFuelType=vehicleFuelType;
    }

    public int getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(int vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public boolean isVehicleIsSelfDrive() {
        return vehicleIsSelfDrive;
    }

    public void setVehicleIsSelfDrive(boolean vehicleIsSelfDrive) {
        this.vehicleIsSelfDrive = vehicleIsSelfDrive;
    }

    public String getVehicleManufacturerName() {
        return vehicleManufacturerName;
    }

    public void setVehicleManufacturerName(String vehicleManufacturerName) {
        this.vehicleManufacturerName = vehicleManufacturerName;
    }

    public String getVehicleDriverName() {
        return vehicleDriverName;
    }

    public void setVehicleDriverName(String vehicleDriverName) {
        this.vehicleDriverName = vehicleDriverName;
    }

    public String getVehicleInsuranceProviderName() {
        return vehicleInsuranceProviderName;
    }

    public void setVehicleInsuranceProviderName(String vehicleInsuranceProviderName) {
        this.vehicleInsuranceProviderName = vehicleInsuranceProviderName;
    }

    public int getVehicleNoOfSeats() {
        return vehicleNoOfSeats;
    }

    public void setVehicleNoOfSeats(int vehicleNoOfSeats) {
        this.vehicleNoOfSeats = vehicleNoOfSeats;
    }

    public HashMap<String, Float> getVehicleBaseRatePerDay() {
        return vehicleBaseRatePerDay;
    }

    public void setVehicleBaseRatePerDay(HashMap<String, Float> vehicleBaseRatePerDay) {
        this.vehicleBaseRatePerDay = vehicleBaseRatePerDay;
    }

    public HashMap<String, Float> getVehicleRatePerKm() {
        return vehicleRatePerKm;
    }

    public void setVehicleRatePerKm(HashMap<String, Float> vehicleRatePerKm) {
        this.vehicleRatePerKm = vehicleRatePerKm;
    }

    public boolean isVehicleIsInsured() {
        return vehicleIsInsured;
    }

    public void setVehicleIsInsured(boolean vehicleIsInsured) {
        this.vehicleIsInsured = vehicleIsInsured;
    }

    public com.lambton.vehicle.vehicleFuelType getVehicleFuelType() {
        return vehicleFuelType;
    }

    public void setVehicleFuelType(com.lambton.vehicle.vehicleFuelType vehicleFuelType) {
        this.vehicleFuelType = vehicleFuelType;
    }


}
