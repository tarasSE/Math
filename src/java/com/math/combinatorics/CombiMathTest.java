package com.math.combinatorics;

import static com.math.combinatorics.CombiMath.*;

public class CombiMathTest {
    public static void main(String[] args) {

        System.out.println("10! = "  // ожидаемый результат 3628800
                + factorial(10));

        System.out.println("10! / ((10-4)! * 4!) = " //  210
                + numberOfCombinations(10, 4));

        System.out.println("10! / ((10-6)! * 6!) = " //  210
                + numberOfCombinations(10, 6));

        System.out.println("(10! / ((10-4)! * 4!)) * 4! = " // 5040
                + numberOfPlacements(10, 4));

        System.out.println("(10! / ((10-6)! * 6!)) * 6! = " // 151200
                + numberOfPlacements(10, 6));

        System.out.println(numberOfPlacements(29, 15));


    }
}
