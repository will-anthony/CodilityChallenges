package com.company.coility.challenges.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    CyclicRotation cyclicRotation;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.cyclicRotation = new CyclicRotation();
    }

    @org.junit.jupiter.api.Test
    void solution() {
        assertArrayEquals(new int[] {8, 10, 2, 4, 6}, cyclicRotation.solution(new int[] {2,4,6,8,10}, 2));
    }

    @org.junit.jupiter.api.Test
    void testSolutionWithEmptyArray() {
        assertArrayEquals(new int[]{}, new int[]{});
    }

    @org.junit.jupiter.api.Test
    void testSolutionWithSingleArrayElement() {
        assertArrayEquals(new int[]{1}, new int[]{1});

    }

    @org.junit.jupiter.api.Test
    void convertToArrayToList() {

        int[] array = {1,10,1,10};
        List<Integer> expectedList = new ArrayList<>();

        expectedList.add(1);
        expectedList.add(10);
        expectedList.add(1);
        expectedList.add(10);

        assertEquals(expectedList, cyclicRotation.convertToArrayList(array));

    }

    @org.junit.jupiter.api.Test
    void rotateArrayList() {
        List<Integer> expectedList = new ArrayList<>();

        expectedList.add(1);
        expectedList.add(3);
        expectedList.add(5);
        expectedList.add(7);

        List<Integer> listToRotate = new ArrayList<>();

        listToRotate.add(7);
        listToRotate.add(1);
        listToRotate.add(3);
        listToRotate.add(5);

        assertEquals(expectedList, cyclicRotation.rotateArrayList(listToRotate, 3 ));
    }

    @org.junit.jupiter.api.Test
    void convertListToArray() {
        int[] expectedArray = {1,2,3,4};
        List<Integer> listToConvert = new ArrayList<>();
        listToConvert.add(1);
        listToConvert.add(2);
        listToConvert.add(3);
        listToConvert.add(4);

        assertArrayEquals(expectedArray, cyclicRotation.convertListToArray(listToConvert));
    }
}
