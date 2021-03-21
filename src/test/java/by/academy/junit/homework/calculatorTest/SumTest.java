package by.academy.junit.homework.calculatorTest;

import by.academy.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class SumTest extends Assert {

    private double valueA;
    private double valueB;
    private double expected;

    public SumTest(double valueA, double valueB, double expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{{1.2, 1.5, 2.7}, {2, 6, 8}, {18.0, 2.0, 20.0}});
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Calculator.getSum(valueA, valueB), 0.001);
    }
}
