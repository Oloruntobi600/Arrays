package org.example;

public class LargestNumberArray {
    public static void main(String[] args){
        int[] array = {19, 15, 10,70, 4, 25, 30};
        int largestNumber = findLargest(array);
        System.out.println("Largest Number in the Array: " + largestNumber);

    }


    public static int findLargest(int[] array){
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}