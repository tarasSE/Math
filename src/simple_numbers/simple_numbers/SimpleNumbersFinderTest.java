package simple_numbers.simple_numbers;

import java.util.TreeSet;


/**
 * Created by user on 19.08.15.
 */
public class SimpleNumbersFinderTest {
    public static void main(String[] args){

        SimpleNumbersFinder simpleNumbersFinder = new SimpleNumbersFinder();
        TreeSet<Integer> simples = simpleNumbersFinder.findSimplesOnInterval(1000);
        simpleNumbersFinder.simplesPrinter(simples);

        }
    }

