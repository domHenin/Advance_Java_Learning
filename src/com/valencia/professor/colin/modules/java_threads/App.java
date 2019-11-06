package com.valencia.professor.colin.modules.java_threads;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String input;
//        Fortune fortune = new Fortune();
//        FortuneCookie firstFortuneCookie =
//                new FortuneCookie("You will always", " Travel to interesting places", 1000);
//        FortuneCookie secondFortuneCookie =
//                new FortuneCookie("Never expect", " lots of money to come to you", 1200);


        Thread cookie1 = new Thread(new FortuneCookie("You will always", " Travel to interesting places", 1000));
        Thread cookie2 = new Thread(new FortuneCookie("Never expect", " lots of money to come to you", 1200));

//        firstFortuneCookie.start();
//        secondFortuneCookie.start();

//        System.out.println("Enter anything: ");
//        input = scanner.next();
//
//        System.out.println("Input request was satisfied.");
//        System.out.println("Your Input: "+input);
//
//
//        Thread.sleep(3000);
//
//        System.out.println("I slept for 3 seconds");


//        fortune.setDaemon(false);    // Daemon or User Thread
//        fortune.start();

    }
}
