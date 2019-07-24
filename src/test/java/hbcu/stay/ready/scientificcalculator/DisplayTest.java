package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

public class DisplayTest {

    @Test
    public void switchDisplayTest(){

        Display display = new Display();

        String displayMode = display.switchDisplayMode();


        String expected = "octal";
        String actual = displayMode;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchRadianTest(){
        Display display = new Display();

        String displayMode = display.switchRadiansMode();

        String expected = "Radians";
        String actual = displayMode;

        Assert.assertEquals(expected, actual);
    }
}
