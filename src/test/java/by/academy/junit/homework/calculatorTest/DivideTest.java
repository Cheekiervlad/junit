package by.academy.junit.homework.calculatorTest;

import by.academy.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class DivideTest extends Assert {

    private double valueA;
    private double valueB;
    private double expected;

    public DivideTest(double valueA, double valueB, double expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:divideOf({0}/{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{{6, 3, 2}, {5, 3, 1.666}, {10, 2, 5}});
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Calculator.getDivide(valueA, valueB), 0.001);
    }
}
