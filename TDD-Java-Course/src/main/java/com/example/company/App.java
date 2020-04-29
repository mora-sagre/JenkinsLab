package com.example.company;

import java.util.ArrayList;
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

	public static List<String> fizzbuzz(int finalNumber) throws Exception {
        
        List<String> result = new ArrayList<>();
        if(finalNumber == 0){
            return result;
        }

        if(finalNumber < 0) {
            throw new Exception("Fallo");
        }

        result.addAll(IntStream.rangeClosed(1, finalNumber)
                .mapToObj(i -> i % 5 == 0 ? (i % 3 == 0 ? "FizzBuzz" : "Buzz") : (i % 3 == 0 ? "Fizz" : i+""))
                .collect(Collectors.toList()));
                
        return result;
        
	}
}
