package com.math.simplenumbers.printer;


import java.util.HashSet;
import java.util.TreeSet;

public interface NumbersPrinter {
    void print(TreeSet<Integer> numbers);

    void print(HashSet<Integer> numbers);
}
