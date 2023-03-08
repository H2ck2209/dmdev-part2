package com.pet;

import com.pet.entity.AutoData;
import com.pet.entity.CarWash;
import com.pet.entity.FreightCar;
import com.pet.entity.PassengerCar;
import com.pet.printers.MenuPrinter;
import com.pet.printers.NotificationPrinter;
import com.pet.util.EnergySource;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        AutoData autoData = new AutoData();
        CarWash carWash = new CarWash();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            MenuPrinter.printMainMenu();
            int command = scanner.nextInt();

            if (command == 0) {
                System.out.println("До свидания!");
                break;
            }

            switch (command) {
                case 1 -> vehicleRegistration(autoData, scanner);
                case 2 -> watchingRegisteredVehicles(autoData, scanner);
                case 3 -> vehicleService(autoData, carWash, scanner);
                default -> System.out.printf(
                        "Такой команды нет %s%s",
                        System.lineSeparator(), System.lineSeparator()
                );
            }
        }
    }

    private static void vehicleService(AutoData autoData, CarWash carWash, Scanner scanner) {
        while (true) {
            var passCarArrayIsEmpty = autoData.passArrayIsEmpty();
            var freightCarArrayIsEmpty = autoData.freightArrayIsEmpty();

            if (passCarArrayIsEmpty && freightCarArrayIsEmpty) {// Сделать универсальный метод
                System.out.println("Сервис недоступен. Внесите автомобиль\n");
                break;
            } else {
                MenuPrinter.printServiceMenu();
                int subCommand = scanner.nextInt();

                if (subCommand == 1) {// Подменю Мойка
                    while (true) {
                        MenuPrinter.printWashMenu();
                        int washCommand = scanner.nextInt();

                        if (washCommand == 1) {
                            if (autoData.passArrayIsEmpty()) {
                                NotificationPrinter.printPassCarListIsEmpty();
                                break;
                            } else {
                                while (true) {
                                    NotificationPrinter.printChooseCarNumber();
                                    autoData.printPassCarArray();
                                    int passCarNumber = scanner.nextInt() - 1;

                                    var passengerCar = autoData.getPassengerCarArray()[passCarNumber];
                                    if (passengerCar == null) {
                                        NotificationPrinter.printWrongCarNumber();
                                    } else {
                                        carWash.wash(passengerCar);
                                        break;
                                    }
                                }
                            }
                        }

                        if (washCommand == 2) {
                            if (autoData.freightArrayIsEmpty()) {
                                NotificationPrinter.printFreightCarListIsEmpty();
                                break;
                            } else {
                                while (true) {
                                    NotificationPrinter.printChooseCarNumber();
                                    autoData.printFreightCarArray();
                                    int freightCarNumber = scanner.nextInt() - 1;

                                    var freightCar = autoData.getFreightCarArray()[freightCarNumber];
                                    if (freightCar == null) {
                                        NotificationPrinter.printWrongCarNumber();
                                    } else {
                                        carWash.wash(freightCar);
                                        break;
                                    }
                                }
                            }
                        }

                        if (washCommand == 0) {
                            break;
                        }
                    }
                }

                if (subCommand == 0) {
                    break;
                }
            }
        }
    }

    private static void watchingRegisteredVehicles(AutoData autoData, Scanner scanner) {
        boolean passCarArrayIsEmpty = autoData.passArrayIsEmpty();
        boolean freightCarArrayIsEmpty = autoData.freightArrayIsEmpty();

        if (passCarArrayIsEmpty && freightCarArrayIsEmpty) {
            System.out.println("Списки зарегистрированных транспортных средств пусты\n\n");
        } else {
            while (true) {
                MenuPrinter.printTransportRegistrationSubMenu();
                int subCommand = scanner.nextInt();

                if (subCommand == 1) {
                    if (passCarArrayIsEmpty) {
                        NotificationPrinter.printPassCarListIsEmpty();
                        break;
                    } else {
                        autoData.printPassCarArray();

                        // TODO: 24.02.2023 Исправить выход из просмотра списков. Добавить второй вариант выхода
                        while (true) {
                            NotificationPrinter.printPressOneForContinue();
                            int continueCommand = scanner.nextInt();
                            if (continueCommand == 1) {
                                break;
                            }
                        }
                    }
                }

                if (subCommand == 2) {
                    if (freightCarArrayIsEmpty) {
                        NotificationPrinter.printFreightCarListIsEmpty();
                        break;
                    } else {
                        autoData.printFreightCarArray();
                        while (true) {
                            NotificationPrinter.printPressOneForContinue();
                            int continueCommand = scanner.nextInt();
                            if (continueCommand == 1) {
                                break;
                            }
                        }
                    }
                }
                if (subCommand == 0) {
                    break;
                }
            }
        }
    }

    private static void vehicleRegistration(AutoData autoData, Scanner scanner) {
        while (true) {
            MenuPrinter.printTransportRegistrationMenu();
            int vehicleRegistrationSubCommand = scanner.nextInt();

            if (vehicleRegistrationSubCommand == 0) {
                System.out.println("Возврат в главное меню\n");
                break;
            }

            System.out.println("Введите марку автомобиля");
            String brand;

            while (true) {
                brand = scanner.next();
                brand = autoData.checkAndCorrectingBrand(brand);

                if (brand != null) {
                    System.out.println("Марка определена \n");
                    break;
                } else {
                    System.out.println("Такой марки нет. Повторите ввод");
                }
            }

            NotificationPrinter.printEnergySources();
            EnergySource energySource = null;
            int energySourceCommand = scanner.nextInt();
            switch (energySourceCommand) {
                case 1 -> energySource = EnergySource.PETROL;
                case 2 -> energySource = EnergySource.GAS;
                case 3 -> energySource = EnergySource.DIEZEL;
                case 4 -> energySource = EnergySource.ELECTRICTY;
            }

            switch (vehicleRegistrationSubCommand) {
                case 1 -> {
                    var passengerCar = new PassengerCar(brand, energySource);
                    autoData.addPassengerCar(passengerCar);
                    System.out.printf("Добавлен легковой автомобиль марки %s, тип топлива %s \n%n", passengerCar.getBrand(), passengerCar.getEnergySource().getName());
                }
                case 2 -> {
                    var freightCar = new FreightCar(brand, energySource);
                    autoData.addFreightCar(freightCar);
                    System.out.printf("Добавлен грузовой автомобиль марки %s, тип топлива %s \n%n", freightCar.getBrand(), freightCar.getEnergySource().getName());
                }
            }
        }
    }
}
