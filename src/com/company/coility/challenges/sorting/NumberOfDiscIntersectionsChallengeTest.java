package com.company.coility.challenges.sorting;

import com.company.coility.challenges.sorting.NumberOfDiscIntersectionsChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDiscIntersectionsChallengeTest {

    @Test
    void smallArray() {
        assertEquals(11, NumberOfDiscIntersectionsChallenge.solution(new int[] {1,5,2,1,4,0}));
    }

    @Test
    void twoMaxIntegers() {
        assertEquals(1, NumberOfDiscIntersectionsChallenge.solution(new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE}));
    }

    @Test
    void threeEqualIntegers() {
        assertEquals(3, NumberOfDiscIntersectionsChallenge.solution(new int[] {1,1,1}));
    }


}