package com.polovyi.ivan.tutorials;

import org.junit.jupiter.api.Test;

public class CustomArrayListTest {

    @Test
    public void getMethodTest() {

        CustomArrayListImpl<Integer> integerCustomArrayList = new CustomArrayListImpl<>();
        integerCustomArrayList.set(1, 2);

        Integer integer = integerCustomArrayList.get(1);

        System.out.println("integer = " + integer);

    }

    @Test
    public void insertMethodTest() {

        CustomArrayListImpl<Integer> integerCustomArrayList = new CustomArrayListImpl<>();
        integerCustomArrayList.add(1);
        integerCustomArrayList.add(2);

        Integer integer = integerCustomArrayList.get(0);

        System.out.println("integer = " + integerCustomArrayList);

    }

}
