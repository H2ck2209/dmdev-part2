package com.dmdev.lessons.lesson18_generics.practice.task1;

public enum PassengerCarBrands {
    Acura ("Acura"),
    Alfa_Romeo("Alfa Romeo"),
    Audi("Audi"),
    BMW("BMW"),
    Cadillac("Cadillac"),
    Chery("Chery"),
    Chevrolet("Chevrolet"),
    Citroen("Citroen"),
    Daewoo("Daewoo"),
    Dodge("Dodge"),
    Fiat("Fiat"),
    Ford("Ford"),
    Geely("Geely"),
    Honda("Honda"),
    Hyundai("Hyundai"),
    Infinity("Infinity"),
    Jaguar("Jaguar"),
    Jeep("Jeep"),
    KIA("KIA"),
    Land_Rover("Land Rover"),
    Lexus("Lexus"),
    Lifan("Lifan"),
    Mazda("Mazda"),
    Mersedes("Mersedes"),
    MINI("MINI"),
    Mitsubishi("Mitsubishi"),
    Nissan("Nissan"),
    Opel("Opel"),
    Peugeot("Peugeot"),
    Pontiac("Pontiac"),
    Porsche("Porsche"),
    Renault("Renault"),
    Rover("Rover"),
    Saab("Saab"),
    Skoda("Skoda"),
    Ssang_Yong("Ssang Yong"),
    Subaru("Subaru"),
    Suzuki("Suzuki"),
    Toyota("Toyota"),
    Volkswagen("Volkswagen"),
    Volvo("Volvo");

    private String name;

    PassengerCarBrands(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
