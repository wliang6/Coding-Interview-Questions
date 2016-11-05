package Week2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Weekly_Questions
 * @author Winnie Nov 2, 2016
 * Week2Hard1.java
 * Question: Given a word, return the shortest possible palindrome that 
 * can built by adding characters to the front or end of the word.
 * What is a palindrome? A palindrome is a word that is identical to itself 
 * when reversed. For example, “otto” is a palindrome, and so is “oto”. “Cat” is not a palindrome. 
 * What is the input to the function? The function takes a string that may or may not be a palindrome.
 * What is the output to the function? The function returns a string that is 
 * a palindrome and containing the given word. Characters must be added to either the 
 * front or back of the word to accomplish this.
 * What are some good test cases? 
 * ["hi" -> “ihi”, "o" -> “o”, "hii" -> “hiih”, "iih" -> “hiih”, "haahfr" -> “rfhaahfr”, "frhaah” -> “frhaah”, "haifriend" -> “dneirfiahaifriend”]
 * If characters could be added to either end of the word and it would
 * make two different palindromes of the same length, which should I return? Great question, it doesn’t  matter as long as you pick one and be consistent with it.
 * What if I’m given an empty string? Great question. Return an empty string.

 */
public class Week2Hard1 {

	@Test public void test1(){ assertEquals("ihi", palindrome("hi")); } 
	@Test public void test2(){ assertEquals("o", palindrome("o")); }
	@Test public void test3(){ assertEquals("hiih", palindrome("hii")); }
	@Test public void test4(){ assertEquals("hiih", palindrome("iih")); }
	@Test public void test5(){ assertEquals("rfhaahfr", palindrome("haahfr")); }
	@Test public void test6(){ assertEquals("frhaahrf", palindrome("frhaah")); }
	@Test public void test7(){ assertEquals("dneirfiahaifriend", palindrome("haifriend")); }
	@Test public void test8(){ assertEquals("pofafclcfafop", palindrome("pofafcl")); }
	
	public static void main(String [] args){
		String[] testcases = new String[] {"otto", "", "hi", "o", "hii", "iih", "haahfr", "frhaah", "haifriend", "pofafcl"};
		for(String s : testcases){
			System.out.println(s + " : " + palindrome(s));
		}
	}
	
	
	public static String palindrome(String s){
		String palin = "";
		if(s.length() == 0 || s.length() == 1) return s;
		if(checkPalin(s)) return s;
		for(int i = 0; i < s.length(); i++){
			if(checkPalin(s.substring(0, i))){
				palin = reverse(s.substring(i)) + s;
			}
			else if(checkPalin(s.substring(i))){
				palin = s + reverse(s.substring(0, i));
			}
		}	
		return palin;
	}
	
	
	public static boolean checkPalin(String s){
		for(int i = 0; i < s.length()/2; i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
				return false;
			}	
		}
		return true;
	}
	
	public static String reverse(String s){
		if(s.length() == 0 || s.length() == 1) return s;
		String reversed = "";
		for(int i = s.length() - 1; i >= 0; i--){
			reversed += s.charAt(i);
		}
		return reversed;
	}
}
