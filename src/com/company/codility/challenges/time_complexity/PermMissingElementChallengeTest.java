package com.company.codility.challenges.time_complexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElementChallengeTest {

    @Test
    void missingElementAtTheStartOfArray() {
        assertEquals(1, PermMissingElementChallenge.solution(new int[] {2,4,6,8,10,3,5,7,9}));
    }

    @Test
    void missingElementAtTheEndOfArray() {
        assertEquals(1, PermMissingElementChallenge.solution(new int[] {2,4,6,8,10,1,3,5,7,9}));
    }


}