import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class operationsTest {

  @Test
  void _min() {
    assertEquals(-10, operations._min("tests/test1.txt"));
    assertEquals(-10, operations._min("tests/test2.txt"));
    assertEquals(-10, operations._min("tests/test3.txt"));
  }

  @Test
  void _max() {
    assertEquals(10, operations._max("tests/test1.txt"));
    assertEquals(4, operations._max("tests/test2.txt"));
    assertEquals(5, operations._max("tests/test3.txt"));
  }

  @Test
  void _sum() {
    assertEquals(-10, operations._sum("tests/test1.txt"));
    assertEquals(-21, operations._sum("tests/test2.txt"));
    assertEquals(-26, operations._sum("tests/test3.txt"));
  }

  @Test
  void _mult() {
    assertEquals(-72000, operations._mult("tests/test1.txt"));
    assertEquals(0, operations._mult("tests/test2.txt"));
    assertEquals(472500, operations._mult("tests/test3.txt"));

  }

  @ParameterizedTest
  @CsvSource({
      "tests/test1.txt, 0",
      "tests/test2.txt, -3",
      "tests/test3.txt, -2.5",
  })
  void testOptimum(String testFile, String expectedresult){
      float res = (operations._min(testFile) + operations._max(testFile)) / 2.0f;
      assertEquals(Float.parseFloat(expectedresult), res);

  }



}