package com.company.coility.challenges.sorting;

import com.company.coility.challenges.sorting.MaxProductOfThreeChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductOfThreeChallengeTest {

    @Test
    void twoNegativeNumbersThatMultiplyToMoreThanTheHighestPositivePair() {
        assertEquals(480, MaxProductOfThreeChallenge.solution(new int[]{ -2, 1, -7, -8, 6, 3, -10, -1, 4}));
    }

    @Test
    void twoNegativeNumbersThatMultiplyToHigherThanTheSecondHighestPositivePair() {
        assertEquals(1520, MaxProductOfThreeChallenge.solution(new int[]{ -2, 1, -7, -8, 6, 3, -10, 12, 4, 19}));
    }

    @Test
    void arrayWithNoNegativeNumbers() {
        assertEquals(2280, MaxProductOfThreeChallenge.solution(new int[]{ 2, 1, 7, 8, 6, 3, 10, 12, 4, 19}));
    }

    @Test
    void arrayWithNoPositiveNumbers() {
        assertEquals(-120, MaxProductOfThreeChallenge.solution(new int[]{ -5, -6, -4, -7, -10}));
    }

    @Test
    void arrayWithHighestNumberZero() {
        assertEquals(0, MaxProductOfThreeChallenge.solution(new int[]{ -5, -6, -4, -7, 0, -10}));
    }
}