package com.pet.util;

public enum CarBrands {
    ACURA("Acura"),
    ALFA_ROMEO("Alfa Romeo"),
    AUDI("Audi"),
    BMW("BMW"),
    CADILLAC("Cadillac"),
    CHERY("Chery"),
    CHEVROLET("Chevrolet"),
    CITROEN("Citroen"),
    DAEWOO("Daewoo"),
    DODGE("Dodge"),
    FIAT("Fiat"),
    FORD("Ford"),
    GEELY("Geely"),
    HONDA("Honda"),
    HYUNDAI("Hyundai"),
    INFINITY("Infinity"),
    JAGUAR("Jaguar"),
    JEEP("Jeep"),
    KIA("KIA"),
    LAND_ROVER("Land Rover"),
    LEXUS("Lexus"),
    LIFAN("Lifan"),
    MAZDA("Mazda"),
    MERCEDES("Mercedes"),
    MINI("MINI"),
    MITSUBISHI("Mitsubishi"),
    NISSAN("Nissan"),
    OPEL("Opel"),
    PEUGEOT("Peugeot"),
    PONTIAC("Pontiac"),
    PORSCHE("Porsche"),
    RENAULT("Renault"),
    ROVER("Rover"),
    SAAB("Saab"),
    SKODA("Skoda"),
    SSANG_YONG("Ssang Yong"),
    SUBARU("Subaru"),
    SUZUKI("Suzuki"),
    TOYOTA("Toyota"),
    VOLKSWAGEN("Volkswagen"),
    VOLVO("Volvo"),
    MAN("MAN"),
    IVECO("Iveco"),
    PETERBILT("Peterbilt");

    private final String name;

    CarBrands(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
