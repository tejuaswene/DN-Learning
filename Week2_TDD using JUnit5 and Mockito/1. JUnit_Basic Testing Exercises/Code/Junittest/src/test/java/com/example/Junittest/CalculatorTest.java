package com.example.Junittest;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }
}
