package by.academy.junit.classwork;

import by.academy.junit.Calculator;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleMathTest extends Assert {

    @Test
    @Ignore
    public void testFail() {
        System.out.println("@testFail");
        fail();
    }

    @Test
    public void testMathPlus() {
        System.out.println("@testMathPlus");
        assertEquals(4, Calculator.getSum(2, 2), 0.01);
    }

    @Test(expected = ArithmeticException.class)
    public void testMathDivide() {
        System.out.println("@testMathDivide");
        int a = 1 / 0;
    }

    @Test(timeout = 1000)
    @Ignore
    public void testTimeout() {
        while (true) {
            System.out.println("alalal");
        }
    }

}
