package com.dmdev.lessons.lesson17_enums;

public interface Manualable {

    default String getManual(String name) {
        return name + " Manual";
    }
}
