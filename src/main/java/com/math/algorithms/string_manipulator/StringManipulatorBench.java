package com.math.algorithms.string_manipulator;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Fork(1)
@Warmup(iterations = 5)
@State(Scope.Thread)
public class StringManipulatorBench {

    StringManipulator stringManipulator = new StringManipulator();

    private  final String first = "first second овово оаоа оаоа  ";

    private  final String second = "first second овово оаоа оаоа .";


    @Benchmark
    @Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void isStringReverceDiff(){

        stringManipulator.isStringsReverse(first, second);

    }

    @Benchmark
    @Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void isStringReverseSame(){

        stringManipulator.isStringsReverse(first, first);

    }

    @Benchmark
    @Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void replaceStringSpaces(){

        stringManipulator.replaceStringSpaces(second);

    }


}