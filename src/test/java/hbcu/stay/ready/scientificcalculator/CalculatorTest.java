package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator calculator = new Calculator(10.0);
        double actual = calculator.add(5);
        double expected = 15;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator(10);
        double actual = calculator.subtract(5);
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator(2);
        double actual = calculator.multiply(2);
        double expected = 4;

        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test(expected = ArithmeticException.class)
    public void divideTest() {

        Calculator calculator = new Calculator(10);
        calculator.divide(0);
    }


    @Test
    public void squareTest() {
        Calculator calculator = new Calculator(2);
        double actual = calculator.square(2);
        double expected = 4;

        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void squareRootTest() {
        Calculator calculator = new Calculator(16);
        double actual = calculator.subtract(16);
        double expected = 4;

        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void exponentTest() {
        Calculator calculator = new Calculator(5);
        double actual = calculator.exponent(2);
        double expected = 25;

        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void inverseTest() {
        Calculator calculator = new Calculator(2);
        double actual = calculator.inverse(2);
        double expected = 0.5;

        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void switchSignTest() {
        Calculator calculator = new Calculator(-5);
        double actual = calculator.switchsign(5);
        double expected = -5.0;

        Assert.assertEquals(expected, actual, 0.0);
    }
}
