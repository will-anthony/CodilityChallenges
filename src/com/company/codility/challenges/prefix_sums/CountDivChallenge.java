package com.company.codility.challenges.prefix_sums;

public class CountDivChallenge {
//    Write a function:
//
//    class Solution { public int solution(int A, int B, int K); }
//
//    that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
//
//    { i : A ≤ i ≤ B, i mod K = 0 }
//
//    For example, for A = 7, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
//
//    Write an efficient algorithm for the following assumptions:
//
//    A and B are integers within the range [0..2,000,000,000];
//    K is an integer within the range [1..2,000,000,000];
//    A ≤ B

    // 100% correctness, 0% performance
//    public static int solution(int rangeStart, int rangeEnd, int divisor) {
//
//        int count = 0;
//
//        for (int num = rangeStart; num <= rangeEnd; num++ ) {
//            if (num % divisor == 0) {
//                count ++;
//            }
//        }
//        return count;
//    }

    // 100% correctness, 100% performance
    public static int solution(int rangeStart, int rangeEnd, int divisor) {

            int offset = 0;

            if ( rangeStart % divisor == 0 ) {
                offset++;
            }

            return  ( rangeEnd/divisor ) - ( rangeStart /divisor ) + offset;
        }
}
