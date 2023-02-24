package com.dmdev.lessons.lesson17_enums.theory;

public interface Manualable {

    default String getManual(String name) {
        return name + " Manual";
    }
}
