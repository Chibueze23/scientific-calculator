package hbcu.stay.ready.scientificcalculator;

public class ScientificCalculator extends Calculator {

    private double memory;

    public ScientificCalculator(){ memory = 0;}

    public ScientificCalculator(double memory){this.memory = memory; }

    public double sine(double x){
        memory = Math.sin(x);
        return memory;
    }

    public double cosine(double x){
        memory = Math.cos(x);
        return memory;
    }

    public double tangent(double x){
        memory = Math.tan(x);
        return memory;
    }

    public double inversesine(double x){
        memory = Math.asin(x);
        return memory;
    }

    public double inversecosine(double x){
        memory = Math.acos(x);
        return memory;
    }

    public double inversetan(double x) {
        memory = Math.atan(x);
        return memory;
    }

    public double logarithm(double x) {
        memory = Math.log10(x);
        return memory;
    }

    public double inverseLog(double x) {
        memory = 1 / Math.log10(x);
        return memory;
    }

    public double naturalLog(double x) {
        memory = Math.log(x);
        return memory;
    }

    public double inverseNatural(double x) {
        memory = Math.exp(x);
        return memory;
    }

    public double factorial(double x) {
        int res = 1, i;
        for (i = 2; i <= x; i++)
            res *= i;
        return res;

    }

    public double absoluteval(double x) {
        memory = Math.abs(x);
        return memory;
    }

    public Double cuberoot(double x){
        memory = Math.cbrt(x);
        return memory;
    }

}
