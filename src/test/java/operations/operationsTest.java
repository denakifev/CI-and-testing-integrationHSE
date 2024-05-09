package operations;

import static org.junit.Assert.*;
import org.junit.Test;

public class operationsTest {

  @Test
  public void _min() {
    assertEquals(-10, operations._min("samples/test1.txt"));
    assertEquals(-10, operations._min("samples/test2.txt"));
    assertEquals(-10, operations._min("samples/test3.txt"));
  }

  @Test
  public void _max() {
    assertEquals(100, operations._max("samples/test1.txt"));
    assertEquals(40, operations._max("samples/test2.txt"));
    assertEquals(50, operations._max("samples/test3.txt"));
  }

  @Test
  public void _sum() {
    assertEquals(-100, operations._sum("samples/test1.txt"));
    assertEquals(-210, operations._sum("samples/test2.txt"));
    assertEquals(-260, operations._sum("samples/test3.txt"));
  }

  @Test
  public void _mult() {
    assertEquals(-720000, operations._mult("samples/test1.txt"));
    assertEquals(00, operations._mult("samples/test2.txt"));
    assertEquals(4725000, operations._mult("samples/test3.txt"));

  }

  @Test
  public void _optimum(){
    double test1Res = (operations._min("samples/test1.txt") + operations._max("samples/test1.txt")) / 2.0d;
    double test2Res = (operations._min("samples/test2.txt") + operations._max("samples/test2.txt")) / 2.0d;
    double test3Res = (operations._min("samples/test3.txt") + operations._max("samples/test3.txt")) / 2.0d;
    assertEquals(0, test1Res, 1e-8);
    assertEquals(-30, test2Res, 1e-8);
    assertEquals(-2.50, test3Res, 1e-8);
  }

}