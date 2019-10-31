package com.valencia.professor.colin.modules.abstract_classes_and_methods;

abstract public class Animal {
    private double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    abstract public void makeNoise();

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


    public String toString() {
        String result;
        result="I'm an animal that weighs: "+weight+" lbs.";
        return result;
    }
}
