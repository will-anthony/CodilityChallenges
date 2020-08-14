package com.company.lessons;

import com.company.lessons.Util;

public class ShellSort {

    static void shellSort(int[] intArray) {

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {

                int savedElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j - gap] > savedElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = savedElement;
            }
        }
        Util.printIntArray(intArray);
    }


//    static void insertionSort(int[] intArray) {
//        for (int firstUnsortedElement = 1; firstUnsortedElement < intArray.length; firstUnsortedElement++) {
//
//            int savedElement = intArray[firstUnsortedElement];
//            int i;
//
//            for (i = firstUnsortedElement; i > 0 && intArray[i - 1] > savedElement; i--) {
//                intArray[i] = intArray[i - 1];
//            }
//
//            intArray[i] = savedElement;
//        }
//        Util.printIntArray(intArray);
//    }
}
