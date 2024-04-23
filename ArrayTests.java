import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] { 3 }, input1);
    assertArrayEquals(new int[] { 3, 2, 1 }, input2);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    int[] input2 = { 2, 1, 4 };
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[] { 4, 1, 2 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReversedWithList() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    int[] expectedOutput1 = { 5, 4, 3, 2, 1 };
    int[] output1 = ArrayExamples.reversed(input1);
    assertArrayEquals(expectedOutput1, output1);
  }

  @Test
  public void testReversedWithDuplicateElements() {
    int[] input1 = { 2, 2, 3, 3, 5 };
    int[] expectedOutput1 = { 5, 3, 3, 2, 2 };
    int[] output1 = ArrayExamples.reversed(input1);
    assertArrayEquals(expectedOutput1, output1);
  }

  @Test
  public void testReversedLength() {
    int[] input1 = { 2, 2, 3, 3, 5 };
    int[] output1 = ArrayExamples.reversed(input1);
    assertEquals(5, output1.length);
  }

  @Test
  public void testReversedInPlaceWithList() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    int[] expectedOutput1 = { 5, 4, 3, 2, 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(expectedOutput1, input1);
  }

  @Test
  public void testReversedInPlaceWithDuplicateElements() {
    int[] input1 = { 2, 2, 3, 3, 5 };
    int[] expectedOutput1 = { 5, 3, 3, 2, 2 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(expectedOutput1, input1);
  }

  @Test
  public void testReversedInPlaceLength() {
    int[] input1 = { 2, 2, 3, 3, 5 };
    int expectedOutput1 = 5;
    ArrayExamples.reverseInPlace(input1);
    assertEquals(expectedOutput1, input1.length);
  }
}
