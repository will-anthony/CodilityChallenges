package com.company.codility.challenges.arrays;

import java.util.ArrayList;
import java.util.List;

    public class CyclicRotation {

//    An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
//    and the last element of the array is moved to the first place. For example, the rotation of array A =
//    [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
//    The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
//
//        Write a function:
//
//class Solution { public int[] solution(int[] A, int K); }
//
//    that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
//
//            For example, given
//
//            A = [3, 8, 9, 7, 6]
//            K = 3
//            the function should return [9, 7, 6, 3, 8]. Three rotations were made:
//
//            [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
//            [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
//            [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
//            For another example, given
//
//            A = [0, 0, 0]
//            K = 1
//            the function should return [0, 0, 0]
//
//            Given
//
//            A = [1, 2, 3, 4]
//            K = 4
//            the function should return [1, 2, 3, 4]
//
//            Assume that:
//
//            N and K are integers within the range [0..100];
//            each element of array A is an integer within the range [−1,000..1,000].

        public int[] solution( int[] array, int rotations ) {

            // check array has an index of at least 2
            if ( array.length < 2 ) {
                return array;
            }

            List<Integer> arrayList = convertToArrayList( array );
            arrayList = rotateArrayList ( arrayList, rotations );
            array = convertListToArray ( arrayList );

            return array;

        }

        public List<Integer> convertToArrayList(int[] array ) {

            List<Integer> arrayList = new ArrayList<>();

            for (int i : array) {
                arrayList.add(i);
            }
            return arrayList;
        }

        public List<Integer> rotateArrayList ( List<Integer> arrayList, int rotations ) {

            int finalIndex = arrayList.size() -1;

            while ( rotations > 0  ) {
                int savedElement = arrayList.get(finalIndex);
                arrayList.remove(finalIndex);
                arrayList.add(0 , savedElement );
                rotations -= 1;
            }

            return arrayList;
        }

        public int[] convertListToArray ( List<Integer> arrayList ) {

            int[] array = new int[ arrayList.size() ];

            for ( int i = 0; i < array.length; i ++ ) {
                int numberToAdd = arrayList.get(i);
                array[i] = numberToAdd;
            }

            return array;
        }
}
