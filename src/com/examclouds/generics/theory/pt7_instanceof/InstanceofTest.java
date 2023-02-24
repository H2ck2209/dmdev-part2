package com.examclouds.generics.theory.pt7_instanceof;

import com.examclouds.generics.theory.pt6_parametrized_hierarchy.GenericSub;
import com.examclouds.generics.theory.pt6_parametrized_hierarchy.GenericSuper;

public class InstanceofTest {
    public static void main(String[] args) {
        GenericSub<Integer> object = new GenericSub<>(88);

        if (object instanceof GenericSuper<?> && object instanceof GenericSub<?>) {
            System.out.println("object is instance of GenericSuper and GenericSub");
        }

        if (object instanceof GenericSub<Integer>) {
            System.out.println("it works!!!");
        }
    }
}
