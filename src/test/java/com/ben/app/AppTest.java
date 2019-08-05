package com.ben.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        // arrange
        int except = 25;
        Calculator ca = new Calculator();

        // act
        int result = ca.Add(10, 15);
        // assert
        assertEquals(except, result);
    }
}
