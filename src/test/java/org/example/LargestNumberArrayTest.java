package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberArrayTest {
    @Test
    void isTheNumberTheLargestInTheArrayCorrect(){
        int[] array = {19, 15, 10,70, 4, 25, 30};
        assertEquals(70, LargestNumberArray.findLargest(array));
    }
    @Test
    void isTheNumberTheLargestInTheArrayWrong(){
        int[] array = {19, 15, 10,70, 4, 25, 30};
        assertNotEquals(19, LargestNumberArray.findLargest(array));
    }
    @Test
    void testLargestNumberInArrayIsPositive(){
        int[] array = {19, 15, 10,70, 4, 25, 30, 50, 100};
        assertEquals(100, LargestNumberArray.findLargest(array));
    }
    @Test
    void testLargestNumberInArrayWithNegative(){
        int[] array = {-19, -15, -10,-70, -4, -25, -30, -50, -100};
        assertEquals(-4, LargestNumberArray.findLargest(array));
    }
    @Test
    void testFindLargestWithMixedNumbers() {
        int[] array = {-19, 15, 0, -70, 4, -25, 30};
        int expected = 30;
        int actual = LargestNumberArray.findLargest(array);
        assertEquals(expected, actual);
    }
    @Test
    void testFindLargestWithSingleElementArray() {
        int[] array = {42};
        int expected = 42;
        int actual = LargestNumberArray.findLargest(array);
        assertEquals(expected, actual);
    }
    @Test
    void testFindLargestWithDescendingOrder() {
        int[] array = {30, 25, 20, 15, 10, 5, 1};
        int expected = 30;
        int actual = LargestNumberArray.findLargest(array);
        assertEquals(expected, actual);
    }

    @Test
    void testFindLargestWithAscendingOrder() {
        int[] array = {1, 5, 10, 15, 20, 25, 30};
        int expected = 30;
        int actual = LargestNumberArray.findLargest(array);
        assertEquals(expected, actual);
    }

    @Test
    void testFindLargestWithZero() {
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;
        int actual = LargestNumberArray.findLargest(array);
        assertEquals(expected, actual);
    }

    @Test
    void testFindLargestWithEqualNumbers() {
        int[] array = {5, 5, 5, 5, 5};
        int expected = 5;
        int actual = LargestNumberArray.findLargest(array);
        assertEquals(expected, actual);
    }

    @Test
    void testFindLargestWithNullArray() {
        int[] array = null;
        assertThrows(NullPointerException.class, () -> {
            LargestNumberArray.findLargest(array);
        });
    }

}