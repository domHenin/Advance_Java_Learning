package com.valencia.professor.colin.modules.inheritance_isA;

public class App {
    public static void main(String[] args) {
        Animal myPet = new Animal(12);

        Dog gizmo = new Dog(8, "Gizmo");

        System.out.println(myPet);
        System.out.println(gizmo);
    }
}
