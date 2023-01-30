package com.dmdev.lessons.lesson14_interfaces.part1_interfaces.example2;

public class ExampleRunner {
    public static void main(String[] args) {
        Client client = new Client(new Telegramm(), 89187701715L);
        Smartphone smartphone = new Smartphone(new Whatsapp());
        System.out.println(client.getPhone());
    }

}
