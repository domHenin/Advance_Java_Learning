package com.valencia.professor.colin.modules.polymorphism;

public class Cat extends Animal {
    private String name;
    private boolean neutered;

    public Cat(double weight, String name, boolean neutered) {
        super(weight);
        this.name = name;
        this.neutered = neutered;
    }

    public void setName(String name) { this.name = name; }
    public void setNeutered(boolean neutered) { this.neutered = neutered; }


    public String getName() { return name; }
    public boolean isNeutered() { return neutered; }


    public String toString() {
        String result;
        result="Cat: "+name+" Neutered: "+neutered+
                "\n"+super.toString();
        return result;
    }

}
