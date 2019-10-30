package com.valencia.professor.colin.modules.composition_static_this;

public class RaceCar {
    private int speed;
    private int location=0;
    private String name;

    private static int maxSpeedForAll=120;

    public RaceCar(int speed, String name) {
        this.speed = speed;
//        this.location=location;
        this.name = name;
    }

    public static int getMaxSpeedForAll() {
        return maxSpeedForAll;
    }


    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public int getLocation() { return location;}

    public void setMaxSpeedForAll(int maxSpeedForAll) {
        RaceCar.maxSpeedForAll=maxSpeedForAll;
    }

    public void setLocation(int location) { this.location = location; }

    public void setSpeed(int speed) {
        if (speed<=maxSpeedForAll) {
            this.speed = speed;
        } else {
            this.speed=maxSpeedForAll;
        }


    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "RaceCar [name="+name+", speed="+speed+"]";
    }
}
