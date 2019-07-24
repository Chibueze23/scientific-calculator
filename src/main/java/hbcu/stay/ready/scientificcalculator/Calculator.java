package hbcu.stay.ready.scientificcalculator;

public class Calculator {
    private double memory;

    public Calculator() {
        memory = 0;
    }

    public Calculator(double memory) {
        this.memory = memory;
    }

    public double add(double x) {
        memory += x;
        return memory;
    }

    public double subtract(double x) {
        memory -= x;
        return memory;
    }

    public double multiply(double x) {
        memory *= x;
        return memory;
    }

    public double divide(double x) throws ArithmeticException {
        if (x == 0.0) throw new ArithmeticException();
        memory = memory / x;
        return memory;
    }

    public double square(double x) {
        memory = Math.pow(x, 2);
        return memory;

    }

    public double squareroot(double x) {
        memory = Math.sqrt(x);
        return memory;

    }

    public double exponent(double x) {
        memory = Math.pow(memory, x);
        return memory;

    }

    public double inverse(double x) {
        memory = 1 / x;
        return memory;

    }

    public double switchsign(double x) {
        if (x > 0) {
            memory = x * -1;
        } else {
            memory = x * -1;
        }
        return memory;
    }
}