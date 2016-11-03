package Week2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Weekly_Questions
 * @author Winnie Nov 2, 2016
 * Week2Easy1.java
 * Question: Write a function that determines if a given word is a palindrome or not.
 * What is a palindrome? A palindrome is a word that is identical to itself when reversed. 
 * For example, “otto” is a palindrome, and so is “oto”. “Cat” is not a palindrome. 
 * What is the input to the function? The function takes a string.
 * What is the output to the function? The function returns a boolean: false/0 when the 
 * word is not a palindrome, true/1 when the word is a palindrome.
 * What are some good test cases? “otto”, “otsto”, and “o” should return true. 
 * “ott2o” and “hi” should both return false. It’s fine for your interviewee to 
 * use different examples, as long as they cover the fact that a single-character 
 * word like ‘o’ should return true. They should also specify what happens if an 
 * empty string is given-- I think either returning “true” or throwing an error is 
 * fine, as long as they talk about it with you and are thinking about it. 
 * We will assume that all input strings are CASE-SENSITIVE and spaces matter.

 */
public class Week2Easy1 {


	 @Test public void test1() { assertEquals(true, isPalindrome("z")); }
	 @Test public void test2() { assertEquals(false, isPalindrome("hello")); }
	 @Test public void test3() { assertEquals(true, isPalindrome("wooow")); }
	 @Test public void test4() { assertEquals(true, isPalindrome("IloveCodeedoCevolI")); }
	 @Test public void test5() { assertEquals(true, isPalindrome("")); }
	 @Test public void test6() { assertEquals(true, isPalindrome("otto")); }
	 @Test public void test7() { assertEquals(false, isPalindrome("phillip")); }
	 @Test public void test8() { assertEquals(false, isPalindrome("wat aw")); }
	 @Test public void test9() { assertEquals(false, isPalindrome("Computer Science")); }
	 @Test public void test10() { assertEquals(true, isPalindrome("hello olleh")); }
	    
	    
	public static boolean isPalindrome(String s){
		if(s.length() == 0 || s.length() == 1) return true;
		for(int i = 0; i < s.length() / 2; i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
				return false;
			}
		}
		return true;
	}
	
}
