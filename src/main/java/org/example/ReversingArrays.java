package org.example;

import java.util.Scanner;

public class ReversingArrays {

    public static void main(String[] args){
            int [] array = {1,2,3,4,5,6};
            int [] reverseArray = reverseArray(array);
        System.out.print("Original Array: ");
        printArray(array);
        System.out.print("Reversed Array: ");
         printArray(reverseArray);
        }

    public static int[] reverseArray(int[] array){
        // array.net can be used as "n"
        int [] reverseArray = new int [array.length];
        int length = array.length;
        for (int i=0; i < length; i++){
            reverseArray[i] = array[array.length - 1 - i];
            // reverseArray [i] = 6 // position 5
            // reverseArray [i] = 5
            // reverseArray [i] = 4
            // reverseArray [i] = 3
            // reverseArray [i] = 2
            // reverseArray [i] = 1


        }
        return reverseArray;
    }
    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
    }

}
