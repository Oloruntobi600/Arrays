package org.example;

import java.util.Arrays;

public class DescendingOrderArray {
    public static void main(String[] args){
        int[] array = {10,3,22, 5, 8, 20, 15}; // Example array
        int[] sortedArray = sortArrayAscending(array);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(sortedArray));
    }

    public static int[] sortArrayAscending(int[] array){
        for (int i=0; i< array.length; i++){

        }
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        return ;
    }
}
