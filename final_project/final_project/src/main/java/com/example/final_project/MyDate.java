package com.example.final_project;

public class MyDate{

    //variables iniatlized
    private int day ;
    private int month ;
    private int year ;

    public String[] months = new String[]{"January","February","March","April","May","July","June","August","September","October","November","December"};

    //constructor created
    public MyDate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
        this.months = months;
    }

    //getters and setters initialized
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public String getMonthShortForm(){
        String x = months[month-1].substring(0,3);
        return  x;
    }

    public String getMonthLongForm(){
        return months[month+1];
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
