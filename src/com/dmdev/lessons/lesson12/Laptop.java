package com.dmdev.lessons.lesson12;

import com.dmdev.lessons.lesson11.Computer;
import com.dmdev.lessons.lesson11.Ram;
import com.dmdev.lessons.lesson11.Ssd;

public class Laptop extends Computer {
    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }

    public String everyNth(String str, int n) {
        char first = str.charAt(0);
        String result = "" + first;
        for (int i = 0; i < str.length() - n; i = i + n){
            result = result + str.charAt(i);
        }
        return result;
    }

}
