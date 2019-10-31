package com.valencia.professor.colin.modules.polymorphism;

public class Geko extends Animal {
    private String name;
    private String gender;

    public Geko(double weight, String name, String gender) {
        super(weight);
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }


    public String getName() { return name; }
    public String getGender() { return gender; }


    public boolean equals(Object obj) {
        if(!(obj instanceof Geko)) {
            return false;
        }

        boolean results=false;

        if (getWeight() == ((Geko) obj).getWeight()) {
            results=true;
        }

        return results;
    }

    public String toString() {
        String result;
        result="I'm a geko, Named: "+name+" "+
                "with a gender of: "+gender+" and "+
                super.toString();
        return result;
    }
}
