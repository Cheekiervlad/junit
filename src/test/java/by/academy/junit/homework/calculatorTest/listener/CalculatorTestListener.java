package by.academy.junit.homework.calculatorTest.listener;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {

    @Override
    public void testFinished(Description description) {
        System.out.println("Execution Finished : " + description.getMethodName());
    }
}

