package com.lambton;

import com.lambton.vehicle.Vehicle;

import java.time.LocalDate;

public class VehicleRent implements IDisplay {

    private Vehicle vehicle;
    private LocalDate rentStartDate;
    private LocalDate rentEndDate;
    private float  rentInNoOfDays;
    private double noOfKmDrived;
    private double totalBillToPay;
    private int vehicleType;

    public VehicleRent() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public LocalDate getRentStartDate() {
        return rentStartDate;
    }
    public void setRentStartDate(LocalDate rentStartDate) {
        this.rentStartDate = rentStartDate;
    }
    public LocalDate getRentEndDate() {
        return rentEndDate;
    }
    public void setRentEndDate(LocalDate rentEndDate) {
        this.rentEndDate = rentEndDate;
    }
    public float getRentInNoOfDays() {
        return rentInNoOfDays;
    }
    public void setRentInNoOfDays(float rentInNoOfDays) {
        this.rentInNoOfDays = rentInNoOfDays;
    }
    public double getNoOfKmDrived() {
        return noOfKmDrived;
    }
    public void setNoOfKmDrived(double noOfKmDrived) {
        this.noOfKmDrived = noOfKmDrived;
    }
    public double getTotalBillToPay() {
        return totalBillToPay;
    }
    public void setTotalBillToPay(double totalBillToPay) {
        this.totalBillToPay = totalBillToPay;
    }

    public int getVehicleype() {
        return vehicleType;
    }
    public void setVehicleype(int vehicleype) {
        this.vehicleType = vehicleype;
    }
    @Override
    public void display() {
        System.out.println("********************Displaying Vehicle Rent Details********************");

        System.out.println("VehicleRent [ rentStartDate=" + rentStartDate + ", rentEndDate=" + rentEndDate
                + ", rentInNoOfDays=" + rentInNoOfDays + ", noOfKmDrived=" + noOfKmDrived + ", totalBillToPay="
                + totalBillToPay + "]");

    }
    @Override
    public String toString() {
        return "VehicleRent [ rentStartDate=" + rentStartDate + ", rentEndDate=" + rentEndDate
                + ", rentInNoOfDays=" + rentInNoOfDays + ", noOfKmDrived=" + noOfKmDrived + ", totalBillToPay="
                + totalBillToPay + "]";
    }




}
