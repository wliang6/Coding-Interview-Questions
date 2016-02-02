package Week1;

import java.util.ArrayList;

/**
 * 
 * @author Winnie
 * Question: Create a function to count the number of unique characters in a string.
 * Hint: Assume the string is ASCII, case-sensitive, and punctuation symbols count. 
 * 
 */

public class Week1Easy2 {

	public static void main(String[] args) {
		String word = "Supercalifragilisticexpialidocious";
		System.out.println(countFrequency(word));
	}

	/**
	 * 
	 * @param String word
	 * @return int uniqueCount of the input string
	 * This function uses the ArrayList data structure and uses it to store the count 
	 * frequencies of each unique character of the string. Utilizes a for-loop and a counter.
	 */
	private static int countFrequency(String word) {
		int uniqueCount = 0;
		ArrayList<Character> visited = new ArrayList<Character>();
		for(int i=0; i<word.length(); i++){
			char character = word.charAt(i);
			if(!visited.contains(character)){
				uniqueCount++;
				visited.add(character);
			}
		}
		return uniqueCount;

	}

}
