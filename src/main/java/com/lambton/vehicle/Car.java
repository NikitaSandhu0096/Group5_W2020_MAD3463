package com.lambton.vehicle;

import com.lambton.IDisplay;

import java.util.ArrayList;
import java.util.HashMap;

public  class Car extends Vehicle implements IDisplay
{

    private ArrayList<String> carType  = new ArrayList<>();
    private ArrayList<String> carColor = new ArrayList<> ();

    public Car()
    {
        super();
    }

    public ArrayList<String> getCarType() {
        return carType;
    }

    public void setCarType(ArrayList<String> carType) {
        this.carType = carType;
    }

    public ArrayList<String> getCarColor()
    {
        return carColor;

    }


    public void setCarColor(ArrayList<String> carColor)
    {
        this.carColor = carColor;
    }

    @Override
        public void display()
        {
            System.out.println("Car [carType=" + carType + ", carColor=" + carColor + ", identificationNumber="
                    + getIdentificationNumber() + ", description=" + getDescription() + ", selfDrive=" + isSelfDrive()
                    + ", manufacturerName=" + getManufacturerName() + ", isInsured=" + isInsured() + ", vehicleNoOfSeats="
                    + getVehicleNoOfSeats() + ", insuranceProviderName=" + getInsuranceProviderName() + ", seat="
                    + getSeat() + ", fuelType=" + getFuelType() + ", ratePerDay=" + getRatePerDay() + ", ratePerKm="
                    + getRatePerKm() + "]");
        }
}
