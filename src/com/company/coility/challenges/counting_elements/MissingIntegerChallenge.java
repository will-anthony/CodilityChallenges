package com.company.coility.challenges.counting_elements;

import java.util.*;

public class MissingIntegerChallenge {

//    Write a function:
//
//    class Solution { public int solution(int[] A); }
//
//    that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//    Given A = [1, 2, 3], the function should return 4.
//
//    Given A = [−1, −3], the function should return 1.
//
//    Write an efficient algorithm for the following assumptions:
//
//    N is an integer within the range [1..100,000];
//    each element of array A is an integer within the range [−1,000,000..1,000,000].


    // 100% correctness, 0% performance
//    public static int solution(int[] array) {
//
//        int smallestPositiveInt;
//        Set<Integer> checkedSet = new HashSet<>(1000000);
//
//        for (int integer = 1; integer <= 1000000; integer++) {
//            checkedSet.add(integer);
//        }
//
//        for (int index = 0; index < array.length; index++) {
//            if (array[index] > 0) {
//                checkedSet.remove(array[index]);
//            }
//        }
//
//        Iterator<Integer> iterator = checkedSet.iterator();
//
//        smallestPositiveInt = iterator.next();
//
//        while (iterator.hasNext()) {
//            if (iterator.next() < smallestPositiveInt) {
//                smallestPositiveInt = iterator.next();
//            }
//        }
//
//        return smallestPositiveInt;
//    }


    // 100% correctness, 100% performance
    public static int solution(int[] array) {

        Arrays.sort(array);
        int smallestPositiveInt = 1;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == smallestPositiveInt) {
                smallestPositiveInt ++;
            }
        }

        return smallestPositiveInt;
    }

}
