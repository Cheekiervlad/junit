package by.academy.junit.homework.suiteTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class MathTest1 extends Assert {

    private double valueA;
    private double expected;

    public MathTest1(double expected, double valueA) {
        this.expected = expected;
        this.valueA = valueA;
    }

    @Parameterized.Parameters(name = "{index}:sqrtOf{0}={1}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{{4, 16}, {3, 9}, {11, 121}});
    }

    @Test
    public void testMathSqrt(){
        assertEquals(expected, Math.sqrt(valueA),0.001);
    }
}
