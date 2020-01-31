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
                      String vehicleDescription,boolean vehicleIsSelfDrive,String vehicleManufacturerName,
                      String vehicleDriverName, String vehicleInsuranceProviderName,
                      int vehicleNoOfSeats,HashMap<String, Float> vehicleBaseRatePerDay,
                      HashMap<String, Float> vehicleRatePerKm,boolean vehicleIsInsured,
                      vehicleFuelType vehicleFuelType)
    {
        super(vehicleIdentificationNumber,vehicleDescription, vehicleIsSelfDrive,vehicleManufacturerName,
            vehicleDriverName, vehicleInsuranceProviderName, vehicleNoOfSeats, vehicleBaseRatePerDay,
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
        System.out.println("MotorCycle's Identification Number : "+ vehicleIdentificationNumber);
        System.out.println("MotorCycle's Description : "+ vehicleDescription);
        System.out.println("MotorCycle's is self driving : "+ vehicleIsSelfDrive);
        System.out.println("MotorCycle's Manufacturer's name : "+ vehicleManufacturerName);
        System.out.println("MotorCycle's Driver Name : "+ vehicleDriverName);
        System.out.println("MotorCycle's Insurance Provider's Name : "+ vehicleInsuranceProviderName);
        System.out.println("MotorCycle's no. of seats : "+ vehicleNoOfSeats);
        System.out.println("MotorCycle's Base Rate Per Day : "+ vehicleBaseRatePerDay);
        System.out.println("MotorCycle's Rate per Hour : "+ vehicleRatePerKm);
        System.out.println("MotorCycle's is Insured? : "+ vehicleIsInsured);
        System.out.println("MotorCycle's Fuel Type : "+ vehicleFuelType);
        System.out.println("Motorcycle's Top Speed : "+ maxTopSpeed);
        System.out.println("MotorCycle's Milage : "+ milage);
    }
}
