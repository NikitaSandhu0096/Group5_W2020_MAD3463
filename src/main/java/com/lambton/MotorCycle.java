package com.lambton;

public class MotorCycle extends Vehicle implements IDisplay {
    public MotorCycle(){}

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

    public MotorCycle(float maxtopspeed, float milage)
    {
        this.maxtopspeed = maxtopspeed;
        this.milage= milage;
    }

    protected float maxtopspeed;
    protected float milage;

    @Override
    public void display() {

    }
}
