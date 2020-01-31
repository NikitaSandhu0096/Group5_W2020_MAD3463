package com.lambton.vehicle;

import com.lambton.IDisplay;

import java.util.HashMap;

public class MotorCycle extends Vehicle implements IDisplay {

    protected float maxTopSpeed;
    protected float milage;

    public MotorCycle()
    {
        super();
    }
    public MotorCycle( float maxTopSpeed ,float milage,int vehicleIdentificationNumber,
                      String vehicleDescription,vehicleIsSelfDrive vehicleIsSelfDrive,String vehicleManufacturerName,
                      String vehicleDriverName, String vehicleInsuranceProviderName,
                      int vehicleNoOfSeats,HashMap<String, Float> vehicleBaseRate,
                      HashMap<String, Float> vehicleRatePerKm,vehicleIsInsured vehicleIsInsured,
                      vehicleFuelType vehicleFuelType)
    {
        super(vehicleIdentificationNumber,vehicleDescription, vehicleIsSelfDrive,vehicleManufacturerName,
            vehicleDriverName, vehicleInsuranceProviderName, vehicleNoOfSeats, vehicleBaseRate,
                vehicleRatePerKm,vehicleIsInsured,vehicleFuelType);
        this.maxTopSpeed = maxTopSpeed;
        this.milage = milage;
    }


    public float getMaxtopspeed() {
        return maxTopSpeed;
    }

    public void setMaxtopspeed(float maxtopspeed) {
        this.maxTopSpeed = maxtopspeed;
    }

    public float getMilage() {
        return milage;
    }

    public void setMilage(float milage) {
        this.milage = milage;
    }


    @Override
    public void display() {
        System.out.println("MotorCycle's Vehiv : "+ vehicleIdentificationNumber);
        System.out.println("MotorCycle's Gender : "+ vehicleDescription);
        System.out.println("MotorCycle's Birth Date : "+ vehicleIsSelfDrive);
        System.out.println("MotorCycle's Age : "+ vehicleManufacturerName);
        System.out.println("MotorCycle's Mobile Number : "+ vehicleDriverName);
        System.out.println("MotorCycle's email Id : "+ vehicleInsuranceProviderName);
        System.out.println("MotorCycle's User Name : "+ vehicleNoOfSeats);
        System.out.println("MotorCycle's Password : "+ vehicleBaseRate);
        System.out.println("MotorCycle's Address : "+ vehicleRatePerKm);
        System.out.println("MotorCycle's City : "+ vehicleIsInsured);
        System.out.println("MotorCycle's "+ vehicleFuelType);
        System.out.println("Motorcycle's Id : "+ maxTopSpeed);
        System.out.println("MotorCycle's First Name : "+ milage);
    }
}
