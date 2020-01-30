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
        String busType;
        WiFi wifi;
        Bus_Access_Available Access;

        @Override
        public void display()
        {

        }

    }
