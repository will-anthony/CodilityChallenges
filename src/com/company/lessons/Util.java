package com.company.lessons;

public class Util {

    static void swapTwoIndexes(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void printIntArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}
