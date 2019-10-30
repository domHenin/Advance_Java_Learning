package com.valencia.professor.colin.modules.polymorphism;

public class Animal {
    private double weight;


    public Animal(double weight) {
        this.weight = weight;
    }


    public void setWeight(double weight) { this.weight = weight; }

    public double getWeight() { return weight; }

    public String toString() {
        String result;
        result="I'm an animal weighing: "+weight+" lbs.";
        return result;
    }
}
