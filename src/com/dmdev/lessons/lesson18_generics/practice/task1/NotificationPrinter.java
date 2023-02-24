package com.dmdev.lessons.lesson18_generics.practice.task1;

public class NotificationPrinter {
    public static void printEnergySources() {
        System.out.println("""
                Введите тип энергоресурса:
                1 - бензин
                2 - газ
                3 - дизель
                4 - электричество
                """);
    }

    public static void printPressOneForContinue() {
        System.out.println("\nДля продолжения нажмите 1 ");
    }

    public static void printPassCarListIsEmpty() {
        System.out.println("Список легковых авто пуст");
    }

    public static void printFreightCarListIsEmpty() {
        System.out.println("Список грузовых авто пуст");
    }

    public static void printChooseCarNumber() {
        System.out.println("Выберите порядковый номер автомобиля:\n");
    }

    public static void printWrongCarNumber() {
        System.out.println("Неверный порядковый номер автомобиля\n");
    }


}
