package com.valencia.professor.colin.modules.interfaces;

public class App {
    public static void main(String[] args) {
        Animal pet = new Animal(24);

        Noisy sound;

        sound = pet;
        doStuff(pet);

        Dog max = new Dog(56, "MAX");
        Dog rover = new Dog(76, "ROVER");

        System.out.println(max.compareTo(rover));
        System.out.println(rover.compareTo(max));

        if (better(max, rover)) {
            System.out.println("My dog's better");
        }

        better("Hello", "bob"); // -> testing if a 'String' can be passed
    }

//    public static void sort(Comparable[] myComparableObjects) {
//        myComparableObjects[0]
//    }

    public static boolean better(Comparable obj1, Comparable obj2) {
        if (obj1.compareTo(obj2) > 0) { return true; }
        else { return false; }
    }

    public static void doStuff(Noisy n) {
        n.makeNoise();

    }
}



