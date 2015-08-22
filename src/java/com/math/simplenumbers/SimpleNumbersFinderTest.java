package com.math.simplenumbers;

import java.util.TreeSet;



public class SimpleNumbersFinderTest {
    public static void main(String[] args){

        SimpleNumbersFinder simpleNumbersFinder = new SimpleNumbersFinder();
        TreeSet<Integer> simples = simpleNumbersFinder.findSimplesOnInterval(1000);
        simpleNumbersFinder.simplesPrinter(simples);

        }
    }

