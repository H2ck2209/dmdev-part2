package com.dmdev.lessons.lesson8_stack_and_heap.practice;

public class MyTimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public int fullSeconds(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        seconds = seconds + minutes * 60 + hours * 3600;
        return seconds;
    }

    public MyTimeInterval(int seconds) {
        this.seconds = seconds;
    }

    public MyTimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void printData() {
        int fullSeconds = fullSeconds(seconds, minutes, hours);
        System.out.println("Данный промежуток времени составляет " + hours + " часа(-ов), " +
                           minutes + " минут, " + seconds + " секунд.");
        System.out.println("Данный промежуток времени в секундах составляет " + fullSeconds);
    }
}
