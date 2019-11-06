package com.valencia.professor.colin.modules.java_threads;

public class Fortune extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Good things will come your way!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
