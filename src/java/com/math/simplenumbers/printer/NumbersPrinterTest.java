package com.math.simplenumbers.printer;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumbersPrinterTest {
    public static void main(String[] args){
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();

        NumbersPrinter numbersPrinter = new NumbersPrinterImpl();

        for (int i=-9999; i<100; i++){
            treeSet.add(i);
            hashSet.add(i);
        }

        numbersPrinter.print((TreeSet) treeSet);

        numbersPrinter.print((HashSet) hashSet);
    }
}
