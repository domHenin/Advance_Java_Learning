package com.valencia.professor.colin.modules.polymorphism;

import java.io.ObjectInputStream;

public class Dog extends Animal {
    private String name;

    public Dog(double weight, String name) {
        super(weight);
        this.name = name;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public String toString() {
        String result;
        result="Dog Info:: Name: "+name+"\n"+
                super.toString();
        return result;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }

        boolean result=false;

        if ( this.getWeight() == (((Dog)obj).getWeight())) {
            result=true;
        }
        return result;
    }
}
