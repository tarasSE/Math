package com.math.algorithms;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

/*
 * Fortunately, in many cases you just need a single state object.
 * In that case, we can mark the benchmark instance itself to be
 * the @State. Then, we can reference it's own fields as will any
 * Java program do.
 */
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Fork(1)
@Warmup(iterations = 5)
@State(Scope.Thread)
public class BenchmarksTemplate {

    @Benchmark
    @Warmup(iterations = 0, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 0, time = 100, timeUnit = TimeUnit.MILLISECONDS)
    public void mesurement(){

    }

}