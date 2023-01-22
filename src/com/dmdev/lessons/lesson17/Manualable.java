package com.dmdev.lessons.lesson17;

public interface Manualable {

    default String getManual(String name) {
        return name + " Manual";
    }
}
