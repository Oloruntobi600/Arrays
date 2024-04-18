package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAStringTest {
    @Test
    void willTheWordBeInReverseForm(){
        var reverseAString = new ReverseAString();
        assertEquals("metsyS",ReverseAString.reverseString("System"));
    }
    @Test
    void TheWordBeInReverseForm(){
        var reverseAString = new ReverseAString();
        assertNotEquals("system",ReverseAString.reverseString("System"));
//        assertEquals("metsyS",ReverseAString.reverseString("System"));
    }
//    @Test
//    void ifLogicCanReverse(){
//        var reverseAString = new ReverseAString();
//        String expectedString = "Tobi";
//        assertEquals(expectedString, ReverseAString.reverseString("iboT"));
//    }
//    @Test
//    void ifLogicCanNotReverse(){
//        var reverseAString = new ReverseAString();
//        String expectedString = "Tobi";
//        assertNotEquals(expectedString, ReverseAString.reverseString("Tobi"));
//    }

}