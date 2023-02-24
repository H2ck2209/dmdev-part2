package com.examclouds.innerClasses.task1;

public class Runner {
    public static void main(String[] args) {
        User petr = new User("Petr", "2023");
        petr.createQuery();

        User.Query query1  = petr.new Query();
        query1.printToLog();

        User.Query query2 = new User("Ivan", "2022").new Query();
    }
}
