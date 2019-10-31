package com.valencia.professor.colin.modules.abstract_classes_and_methods;

public class Cat extends Animal {
    private String name;
    private boolean neutered;

    public Cat(double weight, String name, boolean neutered) {
        super(weight);
        this.name = name;
        this.neutered=neutered;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow Meow");
    }

    public void setName(String name) { this.name = name; }
    public void setNeutered(boolean neutered) { this.neutered = neutered; }

    public String getName() { return name; }
    public boolean isNeutered() { return neutered; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cat)) {
            return false;
        }

        boolean results=false;

        if (getName() == ((Cat) obj).getName()) {
            results=true;
        }

        return results;
    }

    public String toString() {
        String result;
        result="I'm a cat Named: "+name+" and "+
                super.toString();
        return result;
    }
}
