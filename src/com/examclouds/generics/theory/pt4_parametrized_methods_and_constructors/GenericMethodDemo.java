package com.examclouds.generics.theory.pt4_parametrized_methods_and_constructors;

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        if (isIn(2, intArray)) {
            System.out.println("2 входит в массив intArray");
        }

        if (!isIn(7, intArray)) {
            System.out.println("7 не входит в массив intArray");
        }
        String[] stringArray = {"one", "two", "three", "four", "five"};

        if (isIn("four", stringArray)) {
            System.out.println("four входит в массив stringArray");
        }

        if (!isIn("nine", stringArray)) {
            System.out.println("seven не входит в массив stringArray");
        }
    }

    public static <T, V> boolean isIn(T x, V[] array) {
        for (V element : array) {
            if (x.equals(element)) {
                return true;
            }
        }
        return false;
    }
}