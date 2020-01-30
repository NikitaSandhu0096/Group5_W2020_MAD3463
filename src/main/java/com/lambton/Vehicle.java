package com.lambton;

enum isSelfDrive {
    YES,
    NO
}
enum isInsured {
    YES,
    NO
}
enum fuelType{
    DIESEL,
    PETROL,
    ELECTRIC
}

public abstract class Vehicle implements IDisplay {

    int vehicleIdentificationNumber;
    String vehicleDescription;
    String manufacturerName;
    String driverName;
    String insuranceProviderName;
    int noOfSeats;






}
