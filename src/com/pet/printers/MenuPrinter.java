package com.pet.printers;

public class MenuPrinter {
    public static void printMainMenu() {
        System.out.println("""
                Выберите действие:\s

                1. Приём (регистрация) транспортного средства
                2. Список зарегистрированных транспортных средств
                3. Сервис
                0. Выйти из приложения
                """);
    }

    public static void printTransportRegistrationMenu() {
        System.out.println("""
                Выберите действие:\s

                1. Добавить легковой автомобиль
                2. Добавить грузовой автомобиль
                0. Назад в главное меню""");
    }

    public static void printTransportRegistrationSubMenu() {
        System.out.println("""
                Выберите список:
                1 - легковые автомобили
                2 - грузовые автомобили
                0 - назад\s""");
    }

    public static void printServiceMenu() {
        System.out.println("""
                Выберите действие:\s

                1. Мойка
                0. Назад в главное меню""");
    }

    public static void printWashMenu() {
        System.out.println("""
                Выберите действие: \s
                                    
                1. Мойка легковых авто
                2. Мойка грузовых авто
                0. Назад""");
    }
}
