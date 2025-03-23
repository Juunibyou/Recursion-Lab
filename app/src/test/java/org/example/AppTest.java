
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testValue(){
        TriangleNumberCalculator test = new TriangleNumberCalculator();

        assertEquals(1, test.value(1));
        assertEquals(10, test.value(4));
        assertEquals(15, test.value(5));
    }

    @Test
    public void testAdd(){
        TriangleNumberCalculator test = new TriangleNumberCalculator();

        assertEquals(2, test.add(1,1));
        assertEquals(11, test.add(4, 1));
        assertEquals(25, test.add(5, 4));
    }

    @Test
    public void testSubtract(){
        TriangleNumberCalculator test = new TriangleNumberCalculator();

        assertEquals(0, test.subtract(1,1));
        assertEquals(9, test.subtract(4, 1));
        assertEquals(5, test.subtract(5, 4));
    }
}
