package com.valencia.professor.colin.modules.classes_and_objects;

public class App {
    public static void main(String[] args) {

        Date birthday = new Date(19, 6, 1991);
        Date anniversary = new Date(12, 8, 2011);

//        birthday.setMonth(19);

//        System.out.println("Birthday Month:"+birthday.getMonth());

        System.out.println(birthday.toString());
//      System.out.println(birthday);
        System.out.println(anniversary.toString());
//      System.out.println(anniversary);
    }
}
