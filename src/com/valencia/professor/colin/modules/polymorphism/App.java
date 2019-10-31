package com.valencia.professor.colin.modules.polymorphism;

public class App {
    public static void main(String[] args) {
        Animal anAnimal = new Animal(12);

        Dog rover = new Dog(23, "ROVER", "Red", 2);
        Dog max = new Dog(23, "MAX", "Brown", 13);

        Cat fluffy = new Cat(4, "FLUFFY", "Orange/Black");
        Cat snowy = new Cat(5, "SNOWY", "White");

        Geko crested = new Geko(.12, "CRESTED", "Male");
        Geko cresty = new Geko(.12, "CRESTY", "Female");



//lines 12-16 are examples of Polymorphism
//        Animal newPet;
//        newPet = fluffy;
//        System.out.println(newPet);
//        newPet= max;
//        System.out.println(newPet);

        foo(rover);
        foo(max);
        foo(fluffy);
        foo(snowy);
        foo(crested);
        foo(cresty);

        if (rover.equals(max)) {
            System.out.println("The dogs are EQUAL!");
        } else {
            System.out.println("The dogs are NOT EQUAL!");
        }

        if (fluffy.equals(snowy)) {
            System.out.println("The cats are EQUAL!");
        } else {
            System.out.println("The cats are NOT EQUAL!");
        }

        if (crested.equals(cresty)) {
            System.out.println("The gekos are EQUAL!");
        } else {
            System.out.println("The gekos are NOT EQUAL!");
        }


    }

    public static void foo(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println(animal.toString());
        }

        if (animal instanceof Cat) { System.out.println(animal.toString()); }

        if (animal instanceof Geko) { System.out.println(animal.toString()); }
    }
}


//TODO:
// EXPECTED RESULTS:
// In foo(): I'm a dog that is named: ROVER and have a fur color of: Red and I'm an animal that weighs: 24.0 lbs.
// In foo(): I'm a cat that is named: FLUFFY and have a fur color of: Orange/Black and I'm an animal that weighs: 4.0 lbs.
// The dogs are EQUAL!
// The cats are NOT EQUAL!