package com.dmdev.lessons.lesson9.practice.examclouds.task1;

public class PhoneCreator {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", 2018);
        Phone phone2 = new Phone("Honor", 2017);
        Phone phone3 = new Phone("iPhone", 2022);
        Phone phone4 = new Phone("ZTE", 2020);
        System.out.println(Phone.getCounter());
    }
}
