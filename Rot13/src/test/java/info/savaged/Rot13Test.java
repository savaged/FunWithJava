package info.savaged;

import static org.junit.Assert.*;
import org.junit.Test;

public class Rot13Test {
    @Test
    public void testRot13Encode() {
        assertEquals("Grfg", Rot13.encode("Test"));
    }
}
