package com.dmdev.lessons.lesson18_generics.part1_needs;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class List<T> implements Iterable<T> {
    private final T[] objects;
    private int size;

    public List(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>();
    }

    private class ListIterator<T> implements Iterator<T> {

        private int currentIndex;// текущее положение нашего курсора

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return (T) objects[currentIndex++];
        }
    }
}
