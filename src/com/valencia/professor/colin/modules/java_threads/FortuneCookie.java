package com.valencia.professor.colin.modules.java_threads;

public class FortuneCookie  implements Runnable {   // extends Thread

    private String first;
    private String last;
    private int sleepyTime;

    public FortuneCookie(String first, String last, int sleepyTime) {
        this.first=first;
        this.last=last;
        this.sleepyTime=sleepyTime;
    }

    @Override
    public void run() {
        while (true) {
            System.out.print(first);
            try {
                Thread.sleep(sleepyTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(last);
        }
    }

    public void setFirst(String first) { this.first = first; }
    public void setLast(String last) { this.last = last; }
    public void setSleepyTime(int sleepyTime) { this.sleepyTime = sleepyTime; }


    public String getFirst() { return first; }
    public String getLast() { return last; }
    public int getSleepyTime() { return sleepyTime; }


}
