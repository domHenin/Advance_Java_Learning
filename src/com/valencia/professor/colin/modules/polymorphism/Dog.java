package com.valencia.professor.colin.modules.polymorphism;

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
}
