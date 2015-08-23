package com.math.simplenumbers.finder;

import java.util.Set;

public interface SimpleNumbersFinder {
    Set<Integer> findSimplesOnInterval(int n);
    Set<Integer> findSimplesOnInterval(int start, int n);
}
