package com.company.codility.challenges.prefix_sums;

public class GeometricRangeTheoryChallenge {

//    A DNA sequence can be represented as a string consisting of the letters
//    A, C, G and T, which correspond to the types of successive nucleotides
//    in the sequence. Each nucleotide has an impact factor, which is an integer.
//    Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively.
//    You are going to answer several queries of the form: What is the minimal impact factor
//    of nucleotides contained in a particular part of the given DNA sequence?
//
//    The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N
//    characters. There are M queries, which are given in non-empty arrays P and Q, each
//    consisting of M integers. The K-th query (0 ≤ K < M) requires you to find the minimal
//    impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).
//
//    For example, consider string S = CAGCCTA and arrays P, Q such that:
//
//    P[0] = 2    Q[0] = 4
//    P[1] = 5    Q[1] = 5
//    P[2] = 0    Q[2] = 6
//    The answers to these M = 3 queries are as follows:
//
//    The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors
//    are 3 and 2 respectively, so the answer is 2.
//    The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
//    The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide
//    A whose impact factor is 1, so the answer is 1.
//    Write a function:
//
//    class Solution { public int[] solution(String S, int[] P, int[] Q); }
//
//    that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting
//    of M integers, returns an array consisting of M integers specifying the consecutive answers to all queries.
//
//    Result array should be returned as an array of integers.
//
//    For example, given the string S = CAGCCTA and arrays P, Q such that:
//
//    P[0] = 2    Q[0] = 4
//    P[1] = 5    Q[1] = 5
//    P[2] = 0    Q[2] = 6
//    the function should return the values [2, 4, 1], as explained above.
//
//    Write an efficient algorithm for the following assumptions:
//
//    N is an integer within the range [1..100,000];
//    M is an integer within the range [1..50,000];
//    each element of arrays P, Q is an integer within the range [0..N − 1];
//    P[K] ≤ Q[K], where 0 ≤ K < M;
//    string S consists only of upper-case English letters A, C, G, T.

    public static int[] solution(String string, int[] startIndexes, int[] lastIndexes) {

        int[][] genoms = new int[3][string.length() + 1];
        int[] resultsArray = new int[startIndexes.length];

        for (int i = 0; i < string.length(); i++) {

            int a = 0;
            int c = 0;
            int g = 0;

            if (string.charAt(i) == 'A') {
                a = 1;
            } else if (string.charAt(i) == 'C') {
                c = 1;
            } else if (string.charAt(i) == 'G') {
                g = 1;
            }

            genoms[0][i + 1] = genoms[0][i] + a;
            genoms[1][i + 1] = genoms[1][i] + c;
            genoms[2][i + 1] = genoms[2][i] + g;
        }

        for (int i = 0; i < startIndexes.length; i++) {

            if (genoms[0][lastIndexes[i] + 1] - genoms[0][startIndexes[i]] > 0) {
                resultsArray[i] = 1;

            } else if (genoms[1][lastIndexes[i] + 1] - genoms[1][startIndexes[i]] > 0) {
                resultsArray[i] = 2;

            } else if (genoms[2][lastIndexes[i] + 1] - genoms[2][startIndexes[i]] > 0) {
                resultsArray[i] = 3;

            } else {
                resultsArray[i] = 4;
            }
        }
        return resultsArray;
    }
}


// 100% correctness, 0% performance
//    public static int[] solution(String dNASequence, int[] firstIndexes, int[] lastIndexes) {
//
//        char[] charArray = dNASequence.toCharArray();
//        int[] minImpactFactors = new int[firstIndexes.length];
//
//        for (int index = 0; index < firstIndexes.length; index++) {
//
//            int currentMin = 4;
//            for (int j = firstIndexes[index]; j <= lastIndexes[index]; j++) {
//
//                if (charArray[j] == 'A') {
//                    currentMin = 1;
//                    break;
//                }
//
//                if (charArray[j] == 'C' && currentMin > 2) {
//                    currentMin = 2;
//                } else if (charArray[j] == 'G' && currentMin > 3) {
//                    currentMin = 3;
//
//                }
//            }
//            minImpactFactors[index] = currentMin;
//        }
//
//        return minImpactFactors;
//    }


//    public static int solveGenomicRange(String S, int firstIndex, int lastIndex) {
//        //used jagged array to hold the prefix sums of each A, C and G genoms
//        //we don't need to get prefix sums of T, you will see why.
//        int[][] genoms = new int[3][S.length() + 1];
//        //if the char is found in the index i, then we set it to be 1 else they are 0
//        //3 short values are needed for this reason
//        short a, c, g;
//        for (int i = 0; i < S.length(); i++) {
//            a = 0;
//            c = 0;
//            g = 0;
//            if ('A' == (S.charAt(i))) {
//                a = 1;
//            }
//            if ('C' == (S.charAt(i))) {
//                c = 1;
//            }
//            if ('G' == (S.charAt(i))) {
//                g = 1;
//            }
//            //here we calculate prefix sums. To learn what's prefix sums look at here https://codility.com/media/train/3-PrefixSums.pdf
//            genoms[0][i + 1] = genoms[0][i] + a;
//            genoms[1][i + 1] = genoms[1][i] + c;
//            genoms[2][i + 1] = genoms[2][i] + g;
//        }
//
//        int result = 0;
//        //here we go through the provided P[] and Q[] arrays as intervals
//
//        //we need to add 1 to Q[i],
//        //because our genoms[0][0], genoms[1][0] and genoms[2][0]
//        //have 0 values by default, look above genoms[0][i+1] = genoms[0][i] + a;
//        if (genoms[0][lastIndex + 1] - genoms[0][firstIndex] > 0) {
//            result = 1;
//        } else if (genoms[1][lastIndex + 1] - genoms[1][firstIndex] > 0) {
//            result = 2;
//        } else if (genoms[2][lastIndex + 1] - genoms[2][firstIndex] > 0) {
//            result = 3;
//        } else {
//            result = 4;
//
//        }
//        return result;
//    }
//}
