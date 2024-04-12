package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingArraysTest {
    @Test
    void logicToReverseIsWorking(){
//        var ReversingArrays = new ReversingArrays();
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expectedReverseArray = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedReverseArray, ReversingArrays.reverseArray(array));
    }
    @Test
    void logicToReverseIsNotWorking(){
//        var ReversingArrays = new ReversingArrays();
        int[] array = {1,2,3,4,5,6};
        int[] expectedReverseArray = {5,6, 4, 3, 2, 1};
        assertNotEquals(expectedReverseArray, ReversingArrays.reverseArray(array));
    }
}