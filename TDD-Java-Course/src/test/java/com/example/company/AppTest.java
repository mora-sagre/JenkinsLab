package com.example.company;


import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldGetFizz() throws Exception
    {
        int finalNumber = 15;
        List<String> result = App.fizzbuzz(finalNumber);

        Assert.assertEquals("Fizz", result.get(2));
        Assert.assertEquals("Fizz", result.get(5));
        Assert.assertEquals("Fizz", result.get(8));
        Assert.assertEquals("Fizz", result.get(11));
    }

    @Test
    public void shouldGetBuzz() throws Exception
    {
        int finalNumber = 15;
        List<String> result = App.fizzbuzz(finalNumber);

        Assert.assertEquals("Buzz", result.get(4));
        Assert.assertEquals("Buzz", result.get(9));
    }

    @Test
    public void shouldGetFizzBuzz() throws Exception
    {
        int finalNumber = 15;
        List<String> result = App.fizzbuzz(finalNumber);

        Assert.assertEquals("FizzBuzz", result.get(14));
    }

    @Test
    public void shouldGetEmptyList() throws Exception
    {
        int finalNumber = 0;
        List<String> result = App.fizzbuzz(finalNumber);

        Assert.assertEquals(0, result.size());
    }

    @Test(expected = Exception.class) 
    public void shouldThrowException() throws Exception
    {
        int finalNumber = -1;
        List<String> result = App.fizzbuzz(finalNumber);

        Assert.assertEquals("FizzBuzz", result.get(14));
    }

}
