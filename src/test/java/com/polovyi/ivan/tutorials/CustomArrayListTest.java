package com.polovyi.ivan.tutorials;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomArrayListTest {

    @Test
    public void shouldCreateCustomArrayListWithDefaultCapacity() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>();
        // when
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        customArrayList.add(4);
        customArrayList.add(5);
        // then
        assertEquals(5, customArrayList.getCapacity());
    }

    @Test
    public void shouldCreateCustomArrayListWithSpecifiedCapacity() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>(2);
        // when
        customArrayList.add(1);
        customArrayList.add(2);
        // then
        assertEquals(2, customArrayList.getCapacity());
    }

    @Test
    public void shouldBeEmpty() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>();
        // when
        boolean isEmpty = customArrayList.isEmpty();
        // then
        assertTrue(isEmpty);
    }

    @Test
    public void shouldDoubleCustomArrayListCapacity() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>(2);
        customArrayList.add(1);
        customArrayList.add(2);
        // when
        customArrayList.add(3);
        // then
        assertEquals(4, customArrayList.getCapacity());
    }

    @Test
    public void shouldSetTheValueAtSpecifiedIndex() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>();
        customArrayList.add(1);
        customArrayList.add(2);
        // when
        customArrayList.set(0, 3);
        // then
        assertTrue(3 == customArrayList.get(0));
        assertEquals(2, customArrayList.size());
        assertEquals(5, customArrayList.getCapacity());
    }

    @Test
    public void shouldReturnCorrectSize() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>(2);
        customArrayList.add(1);
        customArrayList.add(2);
        // when
        customArrayList.add(3);
        // then
        assertEquals(3, customArrayList.size());
    }

    @Test
    public void shouldAddElementToCustomArray() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>(3);
        customArrayList.add(1);
        customArrayList.add(2);
        // when
        customArrayList.add(3);
        // then
        assertTrue(1 == customArrayList.get(0));
        assertTrue(2 == customArrayList.get(1));
        assertTrue(3 == customArrayList.get(2));
        assertEquals(3, customArrayList.size());
    }

    @Test
    public void shouldInsertElementAtSpecifiedIndex() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        // when
        customArrayList.insert(1, 4);
        // then
        assertTrue(1 == customArrayList.get(0));
        assertTrue(4 == customArrayList.get(1));
        assertTrue(2 == customArrayList.get(2));
        assertTrue(3 == customArrayList.get(3));
        assertEquals(4, customArrayList.size());
    }

    @Test
    public void shouldInsertAsLastWhenIndexEqualsToSize() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        // when
        customArrayList.insert(3, 4);
        // then
        assertTrue(1 == customArrayList.get(0));
        assertTrue(2 == customArrayList.get(1));
        assertTrue(3 == customArrayList.get(2));
        assertTrue(4 == customArrayList.get(3));
        assertEquals(4, customArrayList.size());
    }

    @Test
    public void shouldResizeAndInsertAsLastWhenIndexEqualsToSize() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>(3);
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        // when
        customArrayList.insert(3, 4);
        // then
        assertTrue(1 == customArrayList.get(0));
        assertTrue(2 == customArrayList.get(1));
        assertTrue(3 == customArrayList.get(2));
        assertTrue(4 == customArrayList.get(3));
        assertEquals(4, customArrayList.size());
        assertEquals(6, customArrayList.getCapacity());
    }

    @Test
    public void shouldDeleteElementAtSpecifiedIndex() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        // when
        customArrayList.delete(1);
        // then
        assertTrue(1 == customArrayList.get(0));
        assertTrue(3 == customArrayList.get(1));
        assertEquals(2, customArrayList.size());
    }

    @Test
    public void shouldDeleteAsLastElementWhenIndexEqualsToSize() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        // when
        customArrayList.delete(2);
        // then
        assertTrue(1 == customArrayList.get(0));
        assertTrue(2 == customArrayList.get(1));
        assertEquals(2, customArrayList.size());
    }

    @Test
    public void shouldReturnTrueWhenCustomArrayListContainsValue() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        // when
        boolean contains = customArrayList.contains(2);
        // then
        assertTrue(contains);
    }

    @Test
    public void shouldReturnFalseWhenCustomArrayListDoesNotContainValue() {
        // given
        CustomArrayListImpl<Integer> customArrayList = new CustomArrayListImpl<>();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        // when
        boolean contains = customArrayList.contains(4);
        // then
        assertFalse(contains);
    }

}
