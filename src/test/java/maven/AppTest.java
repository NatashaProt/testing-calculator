package maven;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void greenTest(){

    }

    @Test
    public void sumTest(){
        int result = App.calculator(2, 3, '+');
        int value = 5;
        Assert.assertEquals(value, result);
    }

    @Test
    public void subtractionTest(){
        int result = App.calculator(10, 3, '-');
        int value = 7;
        Assert.assertEquals(value, result);
    }

    @Test
    public void multiplicationTest(){
        int result = App.calculator(4, 5, '*');
        int value = 20;
        Assert.assertEquals(value, result);
    }

    @Test
    public void divisionTest(){
        int result = App.calculator(6, 3, '/');
        int value = 2;
        Assert.assertEquals(value, result);
    }

    @Test
    public void greaterResultTest(){
        int result = App.calculator(3, 2, '+');
        int value = 0;
        Assert.assertTrue(result > 2);
    }

    @Test
    public void nonzeroTest(){
        int result = App.calculator(3, 2, '-');
        int value = 0;
        Assert.assertNotEquals(value, result);
    }

    @Test
    public void multiplicationByZeroTest(){
        int result = App.calculator(2, 0, '*');
        int value = 0;
        Assert.assertEquals(value, result);
    }

    @Test
    public void divisionWithZeroTest(){
        int result = App.calculator(0, 2, '/');
        int value = 0;
        Assert.assertEquals(value, result);
    }

    @Test
    public void divisionByZeroTest(){
        int result = App.calculator(2, 0, '/');
        int value = -99999;
        Assert.assertEquals(value, result);
    }
}
