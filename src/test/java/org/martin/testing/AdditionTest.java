package org.martin.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    public void testAdd() {
        Addition addition = new Addition();
        assertEquals(4, addition.add(2, 2), "2 + 2 should equal 4");
        assertEquals(0, addition.add(0, 0), "0 + 0 should equal 0");
        assertEquals(-2, addition.add(-1, -1), "(-1) + (-1) should equal -2");
        assertEquals(1, addition.add(-1, 2), "(-1) + 2 should equal 1");
    }
}