package com.lambton.vehicle;

import com.lambton.IDisplay;

import java.util.HashMap;

public class MotorCycle extends Vehicle {

    protected float maxTopSpeed;
    protected float milage;

    public MotorCycle()
    {
        super();
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
        System.out.println("MotorCycle [maxTopSpeed=" + maxTopSpeed + ", milage=" + milage + ", identificationNumber="
                + getIdentificationNumber() + ", description=" + getDescription() + ", selfDrive=" + isSelfDrive()
                + ", manufacturerName=" + getManufacturerName() + ", isInsured=" + isInsured() + ", vehicleNoOfSeats="
                + getVehicleNoOfSeats() + ", insuranceProviderName=" + getInsuranceProviderName() + ", seat="
                + getSeat() + ", fuelType=" + getFuelType() + ", ratePerDay=" + getRatePerDay() + ", ratePerKm="
                + getRatePerKm() + "]");

    }
}
