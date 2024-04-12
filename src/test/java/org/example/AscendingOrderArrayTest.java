package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AscendingOrderArrayTest {
    @Test
    void isMyLogicCorrect(){
        AscendingOrderArray ascendingOrderArray = new AscendingOrderArray();
        int[] array = {10,3,22, 5, 8, 20, 15};
        int [] expectedAscendingOrder = {3,5,8,10,15,20,22};
        assertArrayEquals(expectedAscendingOrder, AscendingOrderArray.sortArrayAscending(array));
    }
    @Test
    void willMyLogicNotArrangeItWell(){
        AscendingOrderArray ascendingOrderArray = new AscendingOrderArray();
        int[] array = {10,3,22, 5, 8, 20, 15};
        int [] expectedAscendingOrder = {5,3,8,10,15,20,22};
        assertNotEquals(expectedAscendingOrder, AscendingOrderArray.sortArrayAscending(array));
    }

}