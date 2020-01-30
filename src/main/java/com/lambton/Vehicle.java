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

    int vehicleIdentificationNumber;
    String vehicleDescription;
    String vehicleManufacturerName;
    String vehicleDriverName;
    String vehicleInsuranceProviderName;
    int vehicleNoOfSeats;
    HashMap<String, Float> vehicleBaseRate = new HashMap<String, Float>();
    HashMap<String, Float> vehicleRatePerKm = new HashMap<String, Float>();

    public void vehicleSpeed() {

    }
    



}
