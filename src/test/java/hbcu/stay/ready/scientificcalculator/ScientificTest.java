package hbcu.stay.ready.scientificcalculator;


import org.junit.Assert;
import org.junit.Test;

public class ScientificTest {

Calculator scientificCalculator;



    public void setup(){

         scientificCalculator = new ScientificCalculator();
     }

     @Test
    public void sineTest(){
         ScientificCalculator scientificCalculator = new ScientificCalculator(0);
         double actual = scientificCalculator.sine(180);
         double expected = -0.80115263573
                 ;

         Assert.assertEquals(expected, actual, 0.0);
     }
    @Test
    public void cosineTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(0);
        double actual = scientificCalculator.cosine(180);
        double expected = -0.5984600690578581;

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void tanTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(0);
        double actual = scientificCalculator.tangent(180);
        double expected = 1.3386902103511544;

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void inverseSineTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(1);
        double actual = scientificCalculator.inversesine(1);
        double expected = 1.57079633
                ;

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void inverseCosineTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(1);
        double actual = scientificCalculator.inversecosine(1);
        double expected = 0;

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void inverseTanTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(0);
        double actual = scientificCalculator.inversetan(180);
        double expected = 1.565240828394204;

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void logarithmTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(0);
        double actual = scientificCalculator.logarithm(10);
        double expected = 1.0;

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void inverseLogTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(7);
        double actual = scientificCalculator.inverseLog(7);
        double expected = 0.84509804001;

        Assert.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void naturalLogTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(0);
        double actual = scientificCalculator.naturalLog(10);
        double expected = 2.302585092994046;

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void inverseNaturalTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(0);
        double actual = scientificCalculator.inverseNatural(1);
        double expected = 2.718281828459045;

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void factorialTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(0);
        double actual = scientificCalculator.factorial(4);
        double expected = 24;

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void AbsoluteValueTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(0);
        double actual = scientificCalculator.absoluteval(4.3);
        double expected = 4.3;

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void cubeRootTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(0);
        double actual = scientificCalculator.cuberoot(64);
        double expected = 4;

        Assert.assertEquals(expected, actual, 0.0);
    }
}
