package org.example;

import java.util.Arrays;

public class AscendingOrderArray {
    public static void main(String[] args){
        int[] array = {10,3,22, 5, 8, 20, 15}; // Example array
        int[] sortedArray = sortArrayAscending(array);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(sortedArray));
    }

    public static int[] sortArrayAscending(int[] array){
        int[] sortedArray = array.clone(); // Create a copy of the original array to avoid modifying it
        Arrays.sort(sortedArray); // Use Java's built-in sorting method
        return sortedArray;
    }
}
// learn logic for descending order