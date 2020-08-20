package com.company.codility.challenges.counting_elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneChallengeTest {

    @Test
    void smallArray() {
        assertEquals(6, FrogRiverOneChallenge.solution(5, new int[] {1,3,1,4,2,3,5,4}));
    }

    @Test
    void smallArray2() {
        assertEquals(10, FrogRiverOneChallenge.solution(7, new int[] {2,3,1,4,2,3,5,4,6,1,7,2,3}));
    }

}