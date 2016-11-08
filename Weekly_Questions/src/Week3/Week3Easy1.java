package Week3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Weekly_Questions
 * @author Winnie Nov 2, 2016
 * Week3Easy1.java
 * Question: Write a function that determines if two words are an anagram of each other or not.
 * What is an anagram? An anagram is a rearrangement of the same characters from another word to make a new word. For example, “hello” and “heoll” are both anagrams of “llheo”. 
 * What is the input to the function? The function takes two strings.
 * What is the output to the function? The function returns a boolean: false/0 when the words are not anagrams of each other, true/1 when the words are anagrams.
 * Are uppercase letters the same as their lowercase counterparts? No, they are distinct.
 * Do I need to account for any special character encodings? No, great question. You can assume all the characters you encounter are ASCII.
 * What are some good test cases?  “hello” and “heoll” should return true. “” and “” should also return true. “Hello” and “ellho” should return false, because “h” is not the same as “H”.

 */
public class Week3Easy1 {
	
//	@Test public void test1(){ assertEquals(true, isAnagram("hello", "heoll")); }
//	@Test public void test2(){ assertEquals(false, isAnagram("Hello", "ellho")); }
//	
//	public static boolean isAnagram(String s, String t){
//		int [] occurrences = new int [128]; //128 alphabet characters in ASCII
//		for(int i = 0; i < s.length(); i++){
//			occurrences[s.charAt(i)]++;
//		}
//		for(int j = 0; j < t.length(); j++){
//			occurrences[s.charAt(j)]--;
//			if(occurrences[s.charAt(j)] < 0){
//				return false;
//			}
//		}
//		return true;
//	}
	
	public static boolean isAnagram(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		return sort(s).equals(sort(t)); 
	}
	
	public static String sort(String s){
		char[] array = s.toCharArray();
		java.util.Arrays.sort(array);
		return new String(array);
	}
	
	public static void main(String[] args){
		System.out.println(isAnagram("hello", "heoll"));
		System.out.println(isAnagram("Htello", "ellho"));
	}
}
