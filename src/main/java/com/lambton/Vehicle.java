package com.lambton;

import java.util.HashMap;

enum vehicleIsSelfDrive {
    YES,
    NO
}
enum vehicleIsInsured {
    YES,
    NO
}
enum vehicleFuelType{
    DIESEL,
    PETROL,
    ELECTRIC
}

public abstract class Vehicle implements IDisplay {

    protected int vehicleIdentificationNumber;
    protected String vehicleDescription;
    protected String vehicleManufacturerName;
    protected String vehicleDriverName;
    protected String vehicleInsuranceProviderName;
    protected int vehicleNoOfSeats;
    protected HashMap<String, Float> vehicleBaseRate = new HashMap<String, Float>();
    protected HashMap<String, Float> vehicleRatePerKm = new HashMap<String, Float>();

    public  Vehicle(){

    }
    public Vehicle(int vehicleIdentificationNumber,String vehicleDescription,String vehicleManufacturerName,
                   String vehicleDriverName, String vehicleInsuranceProviderName, int vehicleNoOfSeats,
                   HashMap<String, Float> vehicleBaseRate,
                   HashMap<String, Float> vehicleRatePerKm)
    {
        this.vehicleIdentificationNumber=vehicleIdentificationNumber;
        this.vehicleDescription=vehicleDescription;
        this.vehicleManufacturerName=vehicleManufacturerName;
        this.vehicleDriverName=vehicleDriverName;
        this.vehicleInsuranceProviderName=vehicleInsuranceProviderName;
        this.vehicleNoOfSeats=vehicleNoOfSeats;
        this.vehicleBaseRate=vehicleBaseRate;
        this.vehicleRatePerKm=vehicleRatePerKm;
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

    public HashMap<String, Float> getVehicleBaseRate() {
        return vehicleBaseRate;
    }

    public void setVehicleBaseRate(HashMap<String, Float> vehicleBaseRate) {
        this.vehicleBaseRate = vehicleBaseRate;
    }

    public HashMap<String, Float> getVehicleRatePerKm() {
        return vehicleRatePerKm;
    }

    public void setVehicleRatePerKm(HashMap<String, Float> vehicleRatePerKm) {
        this.vehicleRatePerKm = vehicleRatePerKm;
    }
}
