package com.valencia.professor.colin.modules.abstract_classes_and_methods;

public class TestingAbstract {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(45);
        Animal pet = new Dog(89, "MAX");
        Cat fluffy = new Cat(17, "FLUFFY", true);

        foo(myAnimal);
        foo(pet);
        foo(fluffy);
    }

    public static void foo(Animal myPet) {
        myPet.makeNoise();
    }
}
