package by.academy.junit.homework.suiteTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class MathTest2 extends Assert {

    private double valueA;
    private double valueB;
    private double expected;

    public MathTest2(double valueA, double valueB, double expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:powOf({0}in{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{{1, 2, 1}, {2, 3, 8}, {3, 3, 27}});
    }

    @Test
    public void testMathPow() {
        assertEquals(expected, Math.pow(valueA, valueB), 0.001);
    }
}
