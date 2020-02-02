package com.lambton.vehicle;

public class Car extends Vehicle {

    private String carType;
    private String carColor;

    public Car() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public void display() {
        System.out.println("********************Displaying Car Details********************");

        System.out.println("Car [carType=" + carType + ", carColor=" + carColor + ", identificationNumber="
                + getIdentificationNumber() + ", description=" + getDescription() + ", selfDrive=" + isSelfDrive()
                + ", manufacturerName=" + getManufacturerName() + ", isInsured=" + isInsured() + ", vehicleNoOfSeats="
                + getVehicleNoOfSeats() + ", insuranceProviderName=" + getInsuranceProviderName() + ", seat="
                + getSeat() + ", fuelType=" + getFuelType() + ", ratePerDay=" + getRatePerDay() + ", ratePerKm="
                + getRatePerKm() + "]");
    }

}
