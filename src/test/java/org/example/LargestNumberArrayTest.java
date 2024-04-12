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


}