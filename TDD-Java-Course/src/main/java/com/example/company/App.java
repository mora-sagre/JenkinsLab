package com.example.company;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public static List<String> fizzBuzz(int num) throws Exception {

        if(num < 0) {
            throw new Exception("Error");
        }
		return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i+""))
                .collect(Collectors.toList());
	}

    
}
