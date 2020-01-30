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


    }

}
