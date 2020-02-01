package com.lambton;

import com.lambton.vehicle.Vehicle;

import java.time.LocalDate;

public class VehicleRent implements IDisplay {
    Vehicle vehicle;
    LocalDate rentStartDate;
    LocalDate rentEndDate;
    float  rentInNoOfDays;
    //String vehicle;
    float noOfKmDrived;
    float totalBillToPay;
    int vehicleType;

    public VehicleRent(LocalDate rentStartDate, LocalDate rentEndDate, int rentInNoOfDays, String vehicle, float noOfKmDrived, float totalBillToPay) {

        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.rentInNoOfDays = calculateRentInNoOfDays();
        //this.vehicle = vehicle;
        this.noOfKmDrived = noOfKmDrived;
        this.totalBillToPay = calculateTotalBillToPay();
    }

    private float calculateRentInNoOfDays() {
        LocalDate s1 = rentStartDate;
        LocalDate s2 = rentEndDate;
        rentInNoOfDays = (float) ((s2.getDayOfMonth() - s1.getDayOfMonth()) * vehicle.getRatePerDay());

        return rentInNoOfDays;
    }

    private float calculateTotalBillToPay() {
        totalBillToPay = (float) (rentInNoOfDays+(noOfKmDrived*vehicle.getRatePerKm()));

        return totalBillToPay;
    }

    @Override
    public void display()
    {
    }

    @Override
    public String toString() {
        return "VehicleRent{" +
                "vehicle=" + vehicle +
                ", rentStartDate=" + rentStartDate +
                ", rentEndDate=" + rentEndDate +
                ", rentInNoOfDays=" + rentInNoOfDays +
                ", noOfKmDrived=" + noOfKmDrived +
                ", totalBillToPay=" + totalBillToPay +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
