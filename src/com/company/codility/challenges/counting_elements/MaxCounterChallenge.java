package com.company.codility.challenges.counting_elements;

public class MaxCounterChallenge {

    //    You are given N counters, initially set to 0, and you have two possible operations on them:
//
//    increase(X) − counter X is increased by 1,
//    max counter − all counters are set to the maximum value of any counter.
//    A non-empty array A of M integers is given. This array represents consecutive operations:
//
//    if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
//    if A[K] = N + 1 then operation K is max counter.
//    For example, given integer N = 5 and array A such that:
//
//    A[0] = 3
//    A[1] = 4
//    A[2] = 4
//    A[3] = 6
//    A[4] = 1
//    A[5] = 4
//    A[6] = 4
//    the values of the counters after each consecutive operation will be:
//
//            (0, 0, 1, 0, 0)
//            (0, 0, 1, 1, 0)
//            (0, 0, 1, 2, 0)
//            (2, 2, 2, 2, 2)
//            (3, 2, 2, 2, 2)
//            (3, 2, 2, 3, 2)
//            (3, 2, 2, 4, 2)
//    The goal is to calculate the value of every counter after all operations.
//
//    Write a function:
//
//    class Solution { public int[] solution(int N, int[] A); }
//
//    that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.
//
//    Result array should be returned as an array of integers.
//
//    For example, given:
//
//    A[0] = 3
//    A[1] = 4
//    A[2] = 4
//    A[3] = 6
//    A[4] = 1
//    A[5] = 4
//    A[6] = 4
//    the function should return [3, 2, 2, 4, 2], as explained above.
//
//    Write an efficient algorithm for the following assumptions:
//
//    N and M are integers within the range [1..100,000];
//    each element of array A is an integer within the range [1..N + 1].


//    // different solution
//    public static int[] solution(int N, int[] A) {
//
//        copyAndReverseArray();
//    }
//
//    static int[] copyAndReverseArray(int[] A) {
//
//        for (int i = 0; i < A.length; i++) {
//
//        }
//
//    }

//    public static int[] solution(int N, int[] A) {
//
//        int savedIndex = 0;
//
//        int highestCurrentCount = 0;
//
//        int[] countArray = new int[N];
//
//        for (int i = 0; i < A.length; i++) {
//
//            if (A[i] <= N) {
//                countArray[A[i]]++;
//
//                if (countArray[A[i]] > highestCurrentCount) {
//                    highestCurrentCount = countArray[A[i]];
//                }
//            }
//
//            if (A[i] == (N + 1)) {
//                savedIndex = i;
//            }
//
//            if (A[i] == A.length - 1) {
//                int[] counters = new int[N];
////                        new int[(A.length - 1) - savedIndex];
//                Arrays.fill(countArray, highestCurrentCount);
//            }
//
//        }
//    }


//    public static int[] solution(int N, int[] A) {
//
//        // right answer, too slow
//        // split into multiple arrays denoted by the n+1 array
//
//        int highestCounterValue = 0;
//
//        int[] counters = new int[N];
//
//        for (int i = 0; i < A.length; i++) {
//
//            if (A[i] <= N && A[i] >= 0) {
//
//                int counterIndex = A[i] - 1;
//                counters[counterIndex] ++;
//
//                if (highestCounterValue < counters[counterIndex]) {
//                    highestCounterValue += 1;
//                }
//
//            } else if (A[i] == N + 1) {
//                // keep track of the highest current int
//                Arrays.fill(counters, highestCounterValue );
//            }
//
//        }
//        return counters;
//    }


    // 77% performance

    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];

        int maxCounter = 0; //for the next re-set will know what high score to set all values
        int lastResetCounter = 0; //for setting values that were never explicitly set - at the end

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                if (counters[A[i] - 1] < lastResetCounter) {
                    counters[A[i] - 1] = lastResetCounter; //bring it up to last reset value } counters[A[i]-1]++; //store max counter in case need to set all counters to this value on next reset if(counters[A[i]-1] > maxCounter) {
                    maxCounter = counters[A[i] - 1];
                }

            } else {
                //keep track of last reset counter
                lastResetCounter = maxCounter;
            }
        }
        //set all values to last reset value that was never explicitly changed after last reset
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < lastResetCounter) {
                counters[i] = lastResetCounter;
            }
        }

        return counters;
    }
}

