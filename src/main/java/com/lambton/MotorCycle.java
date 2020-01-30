package com.lambton;

import java.util.HashMap;

public class MotorCycle extends Vehicle implements IDisplay {

    protected float maxtopspeed;
    protected float milage;

    public MotorCycle()
    {
        super();
    }
    public MotorCycle( float maxtopspeed ,float milage,int vehicleIdentificationNumber,
                      String vehicleDescription,vehicleIsSelfDrive vehicleIsSelfDrive,String vehicleManufacturerName,
                      String vehicleDriverName, String vehicleInsuranceProviderName,
                      int vehicleNoOfSeats,HashMap<String, Float> vehicleBaseRate,
                      HashMap<String, Float> vehicleRatePerKm,vehicleIsInsured vehicleIsInsured,
                      vehicleFuelType vehicleFuelType)
    {
        super(vehicleIdentificationNumber,vehicleDescription, vehicleIsSelfDrive,vehicleManufacturerName,
            vehicleDriverName, vehicleInsuranceProviderName, vehicleNoOfSeats, vehicleBaseRate,
                vehicleRatePerKm,vehicleIsInsured,vehicleFuelType);
        this.maxtopspeed = maxtopspeed;
        this.milage = milage;
    }


    public float getMaxtopspeed() {
        return maxtopspeed;
    }

    public void setMaxtopspeed(float maxtopspeed) {
        this.maxtopspeed = maxtopspeed;
    }

    public float getMilage() {
        return milage;
    }

    public void setMilage(float milage) {
        this.milage = milage;
    }


    @Override
    public void display() {

    }
}
