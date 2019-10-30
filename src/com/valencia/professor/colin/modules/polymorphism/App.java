package com.valencia.professor.colin.modules.polymorphism;

public class App {
    public static void main(String[] args) {
        Animal myPet = new Animal(8);
        Dog max = new Dog(12, "Gizmo");
        Animal pet = new Dog(45, "Rover");
        Cat fluffy = new Cat(5, "Tigger", true);


//lines 12-16 are examples of Polymorphism
        Animal newPet;
        newPet = fluffy;
        System.out.println(newPet);

        newPet= max;
        System.out.println(newPet);

//        System.out.println(myPet);
//        System.out.println("\n");
//        System.out.println(gizmo);
//        System.out.println("\n");
//        System.out.println(pet);
//        System.out.println("\n");
//        System.out.println(tigger);
//        System.out.println("\n");
//        System.out.println(newPet);

        foo(gizmo);
        foo(tigger);
        foo(myPet);
    }

    public static void foo(Animal animal) {

    }
}
