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
        boolean except = false;
        Palindrome palindrome = new Palindrome();

        // act
        boolean result = palindrome.isPalindrome("Madam");
        // assert
        assertEquals(except, result);
    }
    
    // @Test
    // public void testEmptyApp(){
    //     // arrange
    //     boolean except = true;
    //     Palindrome palindrome = new Palindrome();
    //     // act
    //     boolean result = palindrome.isPalindrome("");
    //     // assert
    //     assertEquals(except, result);
    // }
}
