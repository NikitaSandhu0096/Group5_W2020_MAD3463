package com.lambton;

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
        public Bus()
        {
        }
        public Bus(String busType,WiFi wifi,Bus_Access_Available access)
        {
            this.busType = busType;
            this.wifi= wifi;
            this.access= access;
        }
        String busType;
        WiFi wifi;
        Bus_Access_Available access;

        @Override
        public void display()
        {

        }

    }
