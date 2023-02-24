package com.dmdev.lessons.lesson18_generics.practice.task1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        AutoData autoData = new AutoData();
        CarWash carWash = new CarWash();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            MenuPrinter.printMainMenu();
            int command = scanner.nextInt();

            if (command == 1) {//подменю регистрации транспорта
                while (true) {
                    MenuPrinter.printTransportRegistrationMenu();
                    int carDetermination = scanner.nextInt();

                    if (carDetermination == 1) {
                        System.out.println("Введите марку автомобиля");// TODO: 21.02.2023 оптимизировать дублирование
                        String passBrand = scanner.next();
                        while (true) {
                            if (autoData.isCorrectBrand(passBrand)) {
                                System.out.println("Марка определена \n");
                                passBrand = autoData.correctBrandCase(passBrand);
                                break;
                            }else {
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
                        PassengerCar tempCar = new PassengerCar(passBrand, energySource);
                        autoData.addPassengerCar(tempCar);

                        System.out.println("Добавлен легковой автомобиль\n");// TODO: 21.02.2023 создать метод о печати информационного сообщения о добавлении автомобиля в классе меню
                    }

                    if (carDetermination == 2) {
                        System.out.println("Введите марку автомобиля");
                        String freightBrand = scanner.next();
                        NotificationPrinter.printEnergySources();
                        EnergySource energySource = null;
                        int energySourceCommand = scanner.nextInt();
                        switch (energySourceCommand) {
                            case 1 -> energySource = EnergySource.PETROL;
                            case 2 -> energySource = EnergySource.GAS;
                            case 3 -> energySource = EnergySource.DIEZEL;
                            case 4 -> energySource = EnergySource.ELECTRICTY;
                        }

                        FreightCar tempCar = new FreightCar(freightBrand, energySource);
                        autoData.addFreightCar(tempCar);

                        System.out.println("Добавлен грузовой автомобиль ");
                    }
                    if (carDetermination == 0) {
                        System.out.println("Возврат в главное меню\n");
                        break;
                    }
                }
            }

            if (command == 2) {//подменю списков зарегистрированных авто
                if (autoData.passArrayIsEmpty() && autoData.freightArrayIsEmpty()) {
                    System.out.println("Списки зарегистрированных транспортных средств пусты\n");
                    break;
                } else {
                    while (true) {
                        MenuPrinter.printTransportRegistrationSubMenu();
                        int subCommand = scanner.nextInt();

                        if (subCommand == 1) {
                            if (autoData.passengerCarArray[0] == null) {
                                NotificationPrinter.printPassCarListIsEmpty();
                                break;
                            } else {
                                autoData.printPassCarArray();
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
                            if (autoData.freightCarArray[0] == null) {
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

            if (command == 3) {// Подменю Сервис
                while (true) {
                    if (autoData.passArrayIsEmpty() && autoData.freightArrayIsEmpty()) {// Сделать универсальный метод
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
                                            if (autoData.passengerCarArray[passCarNumber] == null) {
                                                NotificationPrinter.printWrongCarNumber();
                                            } else {
                                                carWash.wash(autoData.passengerCarArray[passCarNumber]);
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
                                            if (autoData.freightCarArray[freightCarNumber] == null) {
                                                NotificationPrinter.printWrongCarNumber();
                                            } else {
                                                carWash.wash(autoData.freightCarArray[freightCarNumber]);
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

            if (command == 0) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.print("Такой команды нет. ");
            }
        }
    }
}