package com.math.simplenumbers.printer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class NumbersPrinterImpl implements NumbersPrinter {


    @Override
    public void print(TreeSet<Integer> numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        int maxNumberLength = numbers.last().toString().length();
        int minNumberLength = numbers.first().toString().length();
        int maxLength = 0;

        if (maxNumberLength >= minNumberLength) {
            maxLength = maxNumberLength;
        } else {
            maxLength = minNumberLength;
        }

        int counter = 1;
        for (Integer number : numbers) {
            int currentSimpleLengh = number.toString().length();
            int countOfSpaces = maxLength - currentSimpleLengh;
            for (int i = 0; i <= countOfSpaces; i++) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(number);
            if (counter % 10 == 0) {
                stringBuilder.append("\n");
            }
            counter++;
        }

        System.out.println(
                stringBuilder.toString());
        System.out.println();

    }

    @Override
    public void print(HashSet<Integer> numbers) {
        StringBuilder stringBuilder = new StringBuilder();

        int maxElementLength = 0;
        int minElementLength = 0;
        int maxLength = 0;

        for (Integer number : numbers) {

            Integer currentNumberLength = number.toString().length();

            if (currentNumberLength.toString().length() > maxElementLength) {
                maxElementLength = currentNumberLength;
            } else {
                if (currentNumberLength.toString().length() < minElementLength) {
                    minElementLength = currentNumberLength.toString().length();
                }
            }
        }

        if (maxElementLength >= minElementLength) {
            maxLength = maxElementLength;
        } else {
            maxLength = minElementLength;
        }

        int counter = 1;
        for (Integer number : numbers) {
            int currentSimpleLengh = number.toString().length();
            int countOfSpaces = maxLength - currentSimpleLengh;
            for (int i = 0; i <= countOfSpaces; i++) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(number);
            if (counter % 10 == 0) {
                stringBuilder.append("\n");
            }
            counter++;
        }

        System.out.println(
                stringBuilder.toString());
        System.out.println();
    }

    @Override
    public void print(LinkedHashSet<Integer> numbers) {
        StringBuilder stringBuilder = new StringBuilder();

        int maxElementLength = 0;
        int minElementLength = 0;
        int maxLength = 0;

        for (Integer number : numbers) {
            Integer currentNumberLength = number.toString().length();

            if (currentNumberLength > maxElementLength) {
                maxElementLength = currentNumberLength;
            } else {
                if (currentNumberLength < minElementLength) {
                    minElementLength = number;
                }
            }
        }

        if (maxElementLength >= minElementLength) {
            maxLength = maxElementLength;
        } else {
            maxLength = minElementLength;
        }

        int counter = 1;
        for (Integer number : numbers) {
            int currentSimpleLengh = number.toString().length();
            int countOfSpaces = maxLength - currentSimpleLengh;
            for (int i = 0; i <= countOfSpaces; i++) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(number);
            if (counter % 10 == 0) {
                stringBuilder.append("\n");
            }
            counter++;
        }

        System.out.println(
                stringBuilder.toString());
        System.out.println();
    }
}
