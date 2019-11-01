package com.valencia.professor.colin.modules.interfaces;

public class Dog extends Animal implements Comparable {
    private String name;

    public Dog(int weight, String name) {
        super(weight);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof Woof");
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public int compareTo(Object obj) {
        int result;
        result=getWeight()-((Dog) obj).getWeight();
        return result;
    }  // -> the 'compareTo() method should be in sync with the 'equals()' method; if id compared the "name" of the dog in my 'equals()' then iwould do the same for 'compareTo()'

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
