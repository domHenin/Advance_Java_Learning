package com.valencia.professor.colin.modules.abstract_classes_and_methods;

public class Dog extends Animal {
    private String name;

    public Dog(double weight, String name) {
        super(weight);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof Woof");
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }

        boolean results=false;

        if (getWeight() == ((Dog) obj).getWeight()) {
            results=true;
        }

        return results;
    }

    public String toString() {
        String result;

        result="I'm a dog Named: "+name+" and "+
                super.toString();
        return result;
    }
}
