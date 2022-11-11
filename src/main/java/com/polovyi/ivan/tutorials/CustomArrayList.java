package com.polovyi.ivan.tutorials;

public interface CustomArrayList<T> {

    void add(T value);

    void set(int index, T value);

    void insert(int index, T value);

    T get(int index);

    void delete(int index);

    boolean isEmpty();

    boolean contains(T value);

    void resize();

    int size();
}
