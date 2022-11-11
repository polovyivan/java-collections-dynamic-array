package com.polovyi.ivan.tutorials;

public class CustomArrayListImpl<T> implements CustomArrayList<T> {

    private static final int DEFAULT_CAPACITY = 5;

    private int size;
    private int capacity;
    private Object[] data;

    public CustomArrayListImpl(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public CustomArrayListImpl() {
        this.capacity = DEFAULT_CAPACITY;
        data = new Object[capacity];
    }

    @Override
    public String toString() {
        String value = "[";

        for (int i = 0; i < size; i++) {
            value = value + data[i];
            if (i != size - 1) {
                value = value + ",";
            }
        }
        value = value + "]";
        return value;
    }

    @Override
    public void add(T value) {
        if (capacity == size) {
            resize();
        }
        data[size] = value;
        size++;
    }

    @Override
    public void set(int index, T value) {
        this.data[index] = value;
    }

    @Override
    public void insert(int index, T value) {
        if (capacity == size) {
            resize();
        }
        shiftUpFromIndex(index);
        data[index] = value;
        size++;
    }

    @Override
    public T get(int index) {
        return (T) this.data[index];
    }

    @Override
    public void delete(int index) {
        shiftDownToIndex(index);
        size--;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i <= size; i++) {
            T currentValue = (T) data[i];
            if (currentValue.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void resize() {
        int newCapacity = this.capacity * 2;
        Object[] resizedData = new Object[newCapacity];
        for (int i = 0; i < this.data.length; i++) {
            resizedData[i] = this.data[i];
        }
        this.data = resizedData;
    }

    @Override
    public int size() {
        return this.data.length;
    }

    private void shiftUpFromIndex(int index) {
        for (int i = index; i > index; i--) {
            data[i] = data[i - 1];
        }
    }

    private void shiftDownToIndex(int index) {
        for (int i = index; i > this.size - 1; i++) {
            data[i] = data[i + 1];
        }

    }
}
