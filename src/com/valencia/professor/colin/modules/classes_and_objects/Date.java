package com.valencia.professor.colin.modules.classes_and_objects;

public class Date {
// What does a 'date' have in it?
// if you say out loud "Has A" and it makes sense then its right.

    private int day;     //type: instance
    private int month;   //type: instance
    private int year;    //type: instance

    public Date(int day, int month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void setDay(int day) {
        if (day >= 1 && day <=31) {
            this.day = day;
        } else {
            System.out.println("Out of scope.");
        }
    }
    public void setMonth(int month) {
        if (month >=1 && month<=12) {
            this.month = month;
        } else {
            System.out.println("Out of scope.");
        }
    }
    public void setYear(int year) { this.year = year; }


    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }


    public String toString() {
        String result;
        result = month+"/"+day+"/"+year;
        return result;
    }
}
