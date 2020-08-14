package com.company;

import com.company.coility.challenges.time_complexity.TapeEquilibrium;

public class Main {

    public static void main(String[] args) {

//       ShellSort.shellSort(new int[] { 20, 35, -15, 7, 55, 1, -22});

//        int findOddNumber = OddArrayChallenge.solution(new int[]{9, 3, 9, 3, 9, 7 ,9});
//        System.out.println(findOddNumber);

//        int[] returnedArray = MaxCounterChallenge.solution(5 ,new int[] {3,4,4,6,1,4,4});
//        PermCheckChallenge.solution(new int[] {7,1,6,2,4,5,3});

//        System.out.println(DistinctChallenge.solution(new int[]{2,-1,3,1,1,2,0}));

//        int test = MaxProductOfThreeChallenge.solution(new int[] {-3,1,2,-2,5,6});
//        System.out.println(test);

//        int test = NumberOfDiscIntersectionsChallenge.solution(new int[] { 1,5,2,1,4,0 });

//        int test = NumberOfDiscIntersectionsChallenge.solution(new int[] { 1, 1, 1 });

//        int test = FrogRiverOneChallenge.solution(5,new int[] {1,3,1,4,2,3,5,4});
//        int test = FrogRiverOneChallenge.solution(7, new int[] {2,3,1,4,2,3,5,4,6,1,7,2,3});
//        int test = PermMissingElementChallenge.solution(new int[] {2,3,1,5} );
        int test = TapeEquilibrium.solution(new int[] {1000,-1000});
        System.out.println(test);

    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }
}
