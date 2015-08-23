package com.math.simplenumbers.finder;

import com.math.simplenumbers.printer.NumbersPrinter;
import com.math.simplenumbers.printer.NumbersPrinterImpl;

import java.util.TreeSet;



public class SimpleNumbersFinderTest {
    public static void main(String[] args){

        SimpleNumbersFinder simpleNumbersFinder = new SimpleNumbersFinderImpl();
        NumbersPrinter np = new NumbersPrinterImpl();
        TreeSet<Integer> simples = (TreeSet<Integer>) simpleNumbersFinder.findSimplesOnInterval(1000);

        np.print(simples);

        }
    }

