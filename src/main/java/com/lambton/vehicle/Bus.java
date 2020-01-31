package com.lambton.vehicle;

import com.lambton.IDisplay;

import java.util.ArrayList;
import java.util.HashMap;

enum WiFi
    {
        YES,
        NO
    }
    enum Bus_Access_Available
    {
        YES,
        NO
    }
    public class Bus extends Vehicle implements IDisplay
    {
        private ArrayList<String> busType = new ArrayList<>();
        private WiFi wifi;
        private Bus_Access_Available access;

        public Bus()
        {
        }
        public Bus(ArrayList<String> busType, WiFi wifi, Bus_Access_Available access, int vehicleIdentificationNumber,
                   String vehicleDescription, boolean vehicleIsSelfDrive, String vehicleManufacturerName,
                   String vehicleDriverName, String vehicleInsuranceProviderName,
                   int vehicleNoOfSeats, HashMap<String, Float> vehicleBaseRatePerDay,
                   HashMap<String, Float> vehicleRatePerKm, boolean vehicleIsInsured,
                   vehicleFuelType vehicleFuelType)
        {
            super(vehicleIdentificationNumber,vehicleDescription, vehicleIsSelfDrive,vehicleManufacturerName,
                    vehicleDriverName, vehicleInsuranceProviderName, vehicleNoOfSeats, vehicleBaseRatePerDay,
                    vehicleRatePerKm,vehicleIsInsured,vehicleFuelType);

            this.busType = busType;
            this.wifi= wifi;
            this.access= access;
        }

        public ArrayList<String> getBusType() {
            return busType;
        }

        public void setBusType(ArrayList<String> busType) {
            this.busType = busType;
        }

        public WiFi getWifi() {
            return wifi;
        }

        public void setWifi(WiFi wifi) {
            this.wifi = wifi;
        }

        public Bus_Access_Available getAccess() {
            return access;
        }

        public void setAccess(Bus_Access_Available access) {
            this.access = access;
        }


        @Override
        public void display()
        {
            System.out.println("Bus's Identification Number : " + vehicleIdentificationNumber);
            System.out.println("Bus's Description : "+vehicleDescription);
            System.out.println("Bus's is self driving : "+vehicleIsSelfDrive);
            System.out.println("Bus's Manufacturer's name : "+vehicleManufacturerName);
            System.out.println("Bus's Driver Name : "+vehicleDriverName);
            System.out.println("Bus's Insurance Provider's Name : "+vehicleInsuranceProviderName);
            System.out.println("Bus's no. of seats : "+vehicleNoOfSeats);
            System.out.println("Bus's Base Rate Per Day : "+vehicleBaseRatePerDay);
            System.out.println("Bus's Rate per Hour : "+vehicleRatePerKm);
            System.out.println("Bus's is Insured? : "+vehicleIsInsured);
            System.out.println("Bus's Fuel Type : "+vehicleFuelType);
            System.out.println("Bus's Type : "+busType);
            System.out.println("Bus's wifi Available ? : "+wifi);
            System.out.println("Bus's access : "+access);
        }

    }
