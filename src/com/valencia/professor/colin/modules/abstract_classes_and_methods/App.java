//package com.valencia.professor.colin.modules.abstract_classes_and_methods;
//
//public class App {
//    public static void main(String[] args) {
//        Animal myPet = new Animal(12);
//        System.out.println(myPet);
//
//        Dog max = new Dog(34, "MAX");
//        Dog rover = new Dog(34, "ROVER");
//
//
//        if (max.equals(rover)) {
//            System.out.println("Max and Rover are equal");
//        } else {
//            System.out.println("Max and Rover are NOT equal");
//        }
//
//        max.setName("Maxwell");
//        max.setWeight(56);
//        System.out.println(max);
//
//        Cat fluffy = new Cat(12, "FLUFFY", true);
//        System.out.println(fluffy);
//
//        Animal pet;
//        pet=fluffy;
//        System.out.println(pet);
//        pet=max;
//        System.out.println(pet);
//
//
//        foo(max);
//        foo(fluffy);
//        foo(myPet);
//
//    }
//
//    public static void foo(Animal animal) {
//        if (animal instanceof Dog) {
//            animal.toString();
//        }
//        if (animal instanceof Cat) {
//            animal.toString();
//        }
//    }
//
//}
