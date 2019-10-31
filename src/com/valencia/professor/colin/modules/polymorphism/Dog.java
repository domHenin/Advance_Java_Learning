package com.valencia.professor.colin.modules.polymorphism;

public class Dog extends Animal {
    private String name;
    private String furColor;
    private int age;

    public Dog(double weight, String name, String furColor, int age) {
        super(weight);
        this.name = name;
        this.furColor = furColor;
        if (age>=10 && age<=13) {
            this.age=age;
            System.out.println(name+" is getting very old for a dog.");
        } else {
            this.age=age;
            System.out.println(name+" is not getting very old for a dog.");
        }
    }

    public void setName(String name) { this.name = name; }
    public void setFurColor(String furColor) { this.furColor = furColor; }
    public void setAge(int age) {
        this.age=age;
    }

    public String getName() { return name; }
    public String getFurColor() { return furColor; }
    public int getAge() { return age; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }

        boolean results=false;

        if (getName() == ((Dog) obj).getName()) {
            results=true;
        }

        return results;
    }

    public String toString() {
        String result;
        result="I'm a dog, Named: "+name+" "+
                "with a fur color of: "+furColor+" "+
                "with an age of "+age+" and "+
                super.toString();
        return result;
    }
}