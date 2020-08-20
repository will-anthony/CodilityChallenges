package com.company.codility.challenges.iterations;

import java.util.ArrayList;
import java.util.List;

public class BinaryGapChallenge {

    private final List<Character> binaryCharList;
    private int currentCount;
    private int largestCount = 0;

    public BinaryGapChallenge(int integer) {

        this.binaryCharList = convertIntToBinaryChar(integer);
    }

    public ArrayList<Character> convertIntToBinaryChar(int integer) {

        ArrayList<Character> tempList = new ArrayList<>();
        String integerString = Integer.toBinaryString(integer);

        for (char ch : integerString.toCharArray()) {
            tempList.add(ch);
        }
        return tempList;
    }

    public int returnLongestZeroString() {

        int i = 0;
        while (i < binaryCharList.size()) {

            if (binaryCharList.get(i) == '1') {

                try {

                    while (binaryCharList.get(i + 1) == '0') {
                        currentCount += 1;
                        i++;
                    }

                    if(currentCount >= largestCount) {
                        largestCount = currentCount;
                    }

                    currentCount = 0;
                    i++;

                } catch (IndexOutOfBoundsException e) {
                    break;
                }
            }
        }
        return largestCount;
    }

    public List<Character> getBinaryCharList() {
        return binaryCharList;
    }

    public int getLargestCount() {
        return largestCount;
    }
}
