package com.company.coility.challenges.arrays;

import com.company.coility.challenges.arrays.OddArrayChallenge;

import static org.junit.jupiter.api.Assertions.*;

class OddArrayChallengeTest {

    @org.junit.jupiter.api.Test
    void solution() {

        assertEquals(669, OddArrayChallenge.solution( new int[]{106,45,83,27,3994,71195,669,357,21,99,6579,123456,
                467,106,45,83,27,3994,71195,669,357,21,99,6579,123456,467,669}));
    }
}