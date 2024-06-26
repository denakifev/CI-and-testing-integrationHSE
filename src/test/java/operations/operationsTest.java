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
    assertEquals(10, operations._max("samples/test1.txt"));
    assertEquals(4, operations._max("samples/test2.txt"));
    assertEquals(5, operations._max("samples/test3.txt"));
  }

  @Test
  public void _sum() {
    assertEquals(-10, operations._sum("samples/test1.txt"));
    assertEquals(-21, operations._sum("samples/test2.txt"));
    assertEquals(-26, operations._sum("samples/test3.txt"));
  }

  @Test
  public void _mult() {
    assertEquals(-72000, operations._mult("samples/test1.txt"));
    assertEquals(0, operations._mult("samples/test2.txt"));
    assertEquals(472500, operations._mult("samples/test3.txt"));

  }

  @Test
  public void _optimum(){
    double test1Res = (operations._min("samples/test1.txt") + operations._max("samples/test1.txt")) / 2.0d;
    double test2Res = (operations._min("samples/test2.txt") + operations._max("samples/test2.txt")) / 2.0d;
    double test3Res = (operations._min("samples/test3.txt") + operations._max("samples/test3.txt")) / 2.0d;
    assertEquals(0, test1Res, 1e-8);
    assertEquals(-3, test2Res, 1e-8);
    assertEquals(-2.5, test3Res, 1e-8);
  }

}