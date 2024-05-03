package Benchmarktests;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;


public class Benchmarks {
  public static int _min(String file){
    try {
      int ans = Integer.MAX_VALUE;
      Scanner in = new Scanner(new File(file));
      while(in.hasNextInt()){
        ans = Math.min(ans, in.nextInt());
      }
      in.close();
      return ans;
    }
    catch (IOException e){
      System.out.println("File has not been found");
      return Integer.MAX_VALUE;
    }

  }

  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  public void measure_min() {
      _min("tests/test10.txt");
  }
  public static void main(String[] args) throws RunnerException {
    Options options = new OptionsBuilder()
        .include(Benchmarks.class.getSimpleName())
        .forks(1)
        .warmupIterations(1)
        .measurementIterations(1)
        .build();
    new Runner(options).run();
  }

}
