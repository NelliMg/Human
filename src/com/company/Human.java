package com.company;

public class Human {
    private String firstname;
    private String lastname;
    private int year;
    private boolean isArmenian;
    private char gender;

    public Human(String firstname, String lastname, int year, boolean isArmenian, char gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.year = year;
        this.isArmenian = isArmenian;
        this.gender = gender;
    }

    public static void print(Human h) {
        System.out.println(h.getFirstname() + " " + h.getLastname() + ": " + h.getYear());
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getYear() {
        return year;
    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public char getGender() {
        return gender;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}