package ua.lesson.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Витек on 29.07.2015.
 */
public class CalculatorTest {

    @Test
    public void testGetResult() throws Exception {

        Calculator calculator = new Calculator();
        calculator.getResult();
        assertEquals(0.0, calculator.getResult(), 0.0);
    }

    @Test
    public void testSetResult() throws Exception {

        Calculator calculator = new Calculator();
        calculator.setResult(5.0);
        assertEquals(5.0, calculator.getResult(),0.0);
    }

    @Test
    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        calculator.sum(5.0,3.0);
        assertEquals(8.0,calculator.getResult(),0.0);
    }

    @Test
    public void testSubtraction() throws Exception {

        Calculator calculator = new Calculator();
        calculator.subtraction(6.0,3.0);
        assertEquals(3.0,calculator.getResult(), 0.0);
    }

    @Test
    public void testDivision() throws Exception {

        Calculator calculator = new Calculator();
        calculator.division(8.0,2.0);
        assertEquals(4.0, calculator.getResult(), 0.0);
    }

    @Test
    public void testProduct() throws Exception {

        Calculator calculator = new Calculator();
        calculator.product(3.0,3.0);
        assertEquals(9.0, calculator.getResult(), 0.0);
    }

    @Test
    public void testInvolution() throws Exception {

        Calculator calculator = new Calculator();
        calculator.involution(2.0,8.0);
        assertEquals(256, calculator.getResult(), 0.0);
    }
}