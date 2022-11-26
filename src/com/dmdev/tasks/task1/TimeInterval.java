package com.dmdev.tasks.task1;

public class TimeInterval {

    private static final int SECONDS_IN_MINUTES = 60; // константы создаются как prsf, написание всегда в UpperCase
    private static final int MINUTES_IN_HOUR = 60;
    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeInterval (int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = totalSeconds % 3600 / 60;
        this.seconds = totalSeconds % 3600 % 60;
    }

    public int totalSeconds() {
        return seconds + minutes * SECONDS_IN_MINUTES + hours * MINUTES_IN_HOUR;
    }

    public TimeInterval sum (TimeInterval second) {
        return new TimeInterval(this.totalSeconds() + second.totalSeconds());
    }

    public void print() {
        System.out.println("h " + hours + ", m " + minutes + ", s " + seconds);
    }
}
