package com.math.algorithms.lambdas;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
@State(Scope.Thread)
public class OppaLambdaStyleBench {

    private OppaLambdaStyle.PrintList printList = new OppaLambdaStyle.PrintList();

    private Integer integer = 1_00;

    private final List list = new ArrayList<Integer>() {
        {
            for (int i=0; i< integer; i++){
                add(i);
            }
        }
    };


    @Benchmark
    @Warmup(iterations = 2, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10000, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void printListConservative() {

        printList.printListConservative(list);

    }

    @Benchmark
    @Warmup(iterations = 2, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10000, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void printListShort() {

        printList.printListShort(list);

    }

    @Benchmark
    @Warmup(iterations = 2, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10000, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void printListShorter() {

        printList.printListShorter(list);

    }

    @Benchmark
    @Warmup(iterations = 2, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10000, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void printListTheShortest() {

        printList.printListTheShortest(list);

    }

    public static void main(String[] args) throws RunnerException {
        Options optionsBuilder = new OptionsBuilder()
                .include(OppaLambdaStyleBench.class.getSimpleName())
                .forks(1)
                .measurementIterations(1)
                .warmupIterations(2).
                        build();

        new Runner(optionsBuilder).run();
    }

}