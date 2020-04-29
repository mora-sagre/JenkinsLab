package com.example.company;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue() throws Exception
    {
        int num = 100;
        List<String> result = App.fizzBuzz(num);

        Assert.assertEquals("1", result.get(0));
    }

    @Test(expected = Exception.class)
    public void ShouldReturnTrue() throws Exception {

        int num = -1;
        List<String> result = App.fizzBuzz(num);
    }
}
