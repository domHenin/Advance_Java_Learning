package com.valencia.professor.colin.modules.polymorphism;

public class App {
    public static void main(String[] args) {
        Animal myPet = new Animal(8);
        Dog max = new Dog(35, "Max");
        Dog rover = new Dog(35, "Rover");
        Animal pet = new Dog(45, "Rover");
        Cat fluffy = new Cat(5, "Tigger", true);


        if (max.equals(rover)) {
            System.out.println("Max and rover are equal.");
        } else {
            System.out.println("Max and rover are NOT equal.");
        }


//lines 12-16 are examples of Polymorphism
        Animal newPet;
        newPet = fluffy;
//        System.out.println(newPet);

        newPet= max;
//        System.out.println(newPet);

//        System.out.println(myPet);
//        System.out.println("\n");
//        System.out.println(gizmo);
//        System.out.println("\n");
//        System.out.println(pet);
//        System.out.println("\n");
//        System.out.println(tigger);
//        System.out.println("\n");
//        System.out.println(newPet);

        foo(max);
        foo(fluffy);
        foo(myPet);
    }

    public static void foo(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println("Inside foo(): I'm a Cat named:"+((Cat) animal).getName());
        }

        if (animal instanceof Dog) {
            System.out.println("Inside foo(): I'm a Dog name: "+((Dog) animal).getName());
        }

        System.out.println("I'm in foo():"+animal.toString());
    }
}


//TODO:
// EXPECTED RESULTS:
// In foo(): I'm a dog that is named: ROVER and have a fur color of: Red and I'm an animal that weighs: 24.0 lbs.
// In foo(): I'm a cat that is named: FLUFFY and have a fur color of: Orange/Black and I'm an animal that weighs: 4.0 lbs.
// The dogs are EQUAL!
// The cats are NOT EQUAL!