package com.valencia.professor.colin.modules.composition_static_this;

public class App {
    public static void main(String[] args) {
        int maxSpeed = RaceCar.getMaxSpeedForAll();
        int raceLength = 1000;

        RaceCar andretti = new RaceCar(60, "Andretti");

        andretti.setSpeed(100);

//      andretti.getMaxSpeedForAll();  --> your able to access the 'static' this way but it is not advised / dont call the name of the static using // should be using the name of the class!

        while (andretti.getLocation() < raceLength) {
            System.out.println(andretti+" is in first place!");
            break;
        }

    }
}
