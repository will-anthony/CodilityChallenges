package com.company.lessons;

import com.company.lessons.Util;

public class InsertionSort {

    static void insertionSort(int[] intArray) {
        for (int firstUnsortedElement = 1; firstUnsortedElement < intArray.length; firstUnsortedElement++) {

            int savedElement = intArray[firstUnsortedElement];
            int i;

            for (i = firstUnsortedElement; i > 0 && intArray[i - 1] > savedElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = savedElement;
        }
        Util.printIntArray(intArray);
    }
}
