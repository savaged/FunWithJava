package info.savaged;

import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        String[] output = FizzBuzz.getOutput();
        assertEquals("Fizz", output[9]);
        assertEquals("Buzz", output[10]);
        assertEquals("FizzBuzz", output[15]);
    }
}
