package com.company.codility.challenges.iterations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapChallengeTest {

    @Test
    void convertIntToBinaryChar() {
        BinaryGapChallenge binaryGap = new BinaryGapChallenge(5);
        List<Character> expectedArray = new ArrayList<>();
        List<Character> returnedList;
        expectedArray.add('1');
        expectedArray.add('0');
        expectedArray.add('1');

        assertEquals(expectedArray,  binaryGap.convertIntToBinaryChar(5));
    }

    @Test
    void returnLongestZeroString() {
        BinaryGapChallenge binaryGap = new BinaryGapChallenge(77);
        assertEquals(2, binaryGap.returnLongestZeroString());
    }
}