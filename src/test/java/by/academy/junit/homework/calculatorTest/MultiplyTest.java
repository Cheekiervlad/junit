package by.academy.junit.homework.calculatorTest;

import by.academy.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class MultiplyTest extends Assert {

    private double valueA;
    private double valueB;
    private double expected;

    public MultiplyTest(double valueA, double valueB, double expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:multiplyOf({0}*{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{{2, 3, 6}, {1.5, 4, 6}, {1.6, 1.9, 3.04}});
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Calculator.getMultiply(valueA, valueB), 0.001);
    }
}
