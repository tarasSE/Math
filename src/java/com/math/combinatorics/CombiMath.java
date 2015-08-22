package com.math.combinatorics;

/**
 * Created by user on 22.08.15.
 */
public class CombiMath implements CombiMathInterface {

    public long factorial(long num) {
        return (num == 0) ? 1 : num * factorial(num - 1);
    }


    @Override
    public long numberOfPermutations(long n) {
        return factorial(n);
    }

    @Override
    public long numberOfCombinations(long n, long m) {
        return (factorial(n))/(factorial(n-m)*factorial(m));
    }

    @Override
    public long numberOfPlacements(long n, long m) {
        return (factorial(n)*factorial(m))/(factorial(n-m)*factorial(m));
    }
}
