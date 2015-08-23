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

    @Override
    public Set<Integer> findSimplesOnInterval(int start, int n) {
        simplesSet.add(1);
        simplesSet.add(2);

        Set<Integer> simplesOnIntervalN = new TreeSet<>();

        for (int i = 3; i <= n; i++) {
            if (isSimple(i)) {
                simplesSet.add(i);
            }
        }

        for (Integer simple : simplesSet) {
            if (simple >= n) break;
            if (simple >= start) {
                simplesOnIntervalN.add(simple);
            }

        }

        return simplesOnIntervalN;
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

    public Set<Integer> getSimplesSet() {
        return simplesSet;
    }

    private Set<Integer> simplesSet = new TreeSet<>();

}
