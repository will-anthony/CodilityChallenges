package com.company.lessons;

public class BubbleSort {

    public static void bubbleSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    Util.swapTwoIndexes(intArray, i, i + 1);
                }
            }
        }
        Util.printIntArray(intArray);
    }
}

