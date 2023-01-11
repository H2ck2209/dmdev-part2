package com.dmdev.lessons.lesson14.part1.example2;

public class Client {
    private Messenger messenger;
    private long phone;

    public Client(Messenger messenger, long phone) {
        this.messenger = messenger;
        this.phone = phone;
    }

    public long getPhone() {
        return phone;
    }
}
