package com.math.simplenumbers.finder;

import java.util.Set;
import java.util.TreeSet;


public class SimpleNumbersFinderImpl implements SimpleNumbersFinder {

    public Set<Integer> findSimplesOnInterval(int n) {
        simplesSet.add(1);
        simplesSet.add(2);

        for (int i = 3; i <= n; i++) {
            if (isSimple(i)) {
                simplesSet.add(i);
            }
        }

        return getSimplesSet();
    }

    private boolean isSimple(int number) {
        if (number % 2 == 0 &&
                number != 2) {
            return false;
        } else {
            for (Integer simple : getSimplesSet()) {
                if (number % simple == 0 && simple != 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public TreeSet<Integer> getSimplesSet() {
        return simplesSet;
    }

    private TreeSet<Integer> simplesSet = new TreeSet<Integer>();

}
