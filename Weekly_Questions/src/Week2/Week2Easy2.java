package Week2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Weekly_Questions
 * @author Winnie Nov 2, 2016
 * Week2Easy2.java
 * Question: Write a function that returns a list of the first n Fibonacci numbers.
 * What is a Fibonacci number? this is a sequence of numbers that is built by adding the two “most recent” numbers together. For example, [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, … ]. It can also start with [0, 1] instead of [1, 1], but for our purposes we will begin with 0.
 * What is the input? The input is an integer “n”, the number of Fibonacci numbers to return.
 * What is the output? a list of Fibonacci numbers, with length n. The list should start with [0, 1, …]
 * What if n is 0, 1, or 2? Good question! Make sure your code accounts for that. It should return an 
 * empty list when n = 0, [0] when n = 1, and [0,1] when n = 2. It’s fine to hard-code those return values.

 */
public class Week2Easy2 {

	@Test public void test1(){ assertEquals(Arrays.asList(), fibonnaci(0)); }
	@Test public void test2(){ assertEquals(Arrays.asList(0), fibonnaci(1)); }
	@Test public void test3(){ assertEquals(Arrays.asList(0,1,1), fibonnaci(3)); }
	@Test public void test4(){ assertEquals(Arrays.asList(0,1,1,2,3), fibonnaci(5)); }
	@Test public void test5(){ assertEquals(Arrays.asList(0,1,1,2,3,5,8,13,21,34), fibonnaci(10)); }
	
	
	public List<Integer> fibonnaci (int n){
		if(n == 0) return Arrays.asList();
		if(n == 1){ return Arrays.asList(0);}
		if(n == 2){ return Arrays.asList(0,1);}
		List<Integer> li = new ArrayList<Integer>();
		li.add(0);
		li.add(1);
		int i = 2;
		while(i < n){
			li.add(li.get(i-1) + li.get(i-2));
			i++;
		}
		System.out.println(li);
		return li;
	}
}
