package com.dmdev.lessons.lesson10.part2Practice;

/**
 * Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы в формате Ф.И.О.
 * Учесть, что все входные параметры могут быть в любом регистре, а результирующая строка должна быть только в верхнем.
 */
public class Task3 {
    public static void main(String[] args) {
        String result = format("Ivan", "Sidorov", "Petrovich");
        System.out.println(result);
        String result2 = format2("Magomed", "Magomedov", "Magomedovich");
        System.out.println(result2);
        String result3 = format3("Михаил", "Булгаков", "Афанасьевич");
        System.out.println(result3);
    }

    static String format(String firstName, String lastName, String patronymicName) {
        char firstNameChar = firstName.toUpperCase().charAt(0);
        char lastNameChar = lastName.toUpperCase().charAt(0);
        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);
        return firstNameChar + "." + lastNameChar + "." + patronymicNameChar + ".";
    }

    static String format2(String firstName, String lastName, String patronymicName) {
        char firstNameChar = firstName.toUpperCase().charAt(0);
        char lastNameChar = lastName.toUpperCase().charAt(0);
        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);
        return String.format("%s.%s.%s.", firstNameChar, lastNameChar, patronymicNameChar);
    }

    static String format3(String firstName, String lastName, String patronymicName) {
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));
        return String.format("%s.%s.%s.", firstNameChar, lastNameChar, patronymicNameChar);
    }
}
