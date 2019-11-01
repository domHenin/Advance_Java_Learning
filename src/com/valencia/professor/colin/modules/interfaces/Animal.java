package com.valencia.professor.colin.modules.interfaces;

public class Animal implements Noisy {
    private int weight;

    public Animal(int weight) {
        this.weight = weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void makeNoise() {
        System.out.println("I don't make any noise.");
    }

    public String toString() {
        String result;
        result="I'm an animal that weighs: "+weight+" lbs.";
        return result;
    }
}