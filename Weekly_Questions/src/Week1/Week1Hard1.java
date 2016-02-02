package Week1;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 
 * @author Winnie
 * Question: Given a list of all the words in a language and a starter word in that language, 
 * find the longest chain of "jumps" from the starter word to the longer words in a list, 
 * where each valid jump is where a single character has been added anywhere in the word.
 * Hint: A jump is valid if the two words must be the exactly the same, except one extra 
 * character has been added anywhere within the second word. 
 * For example: "hello" and "hellow" is a valid jump. 
 *              "play" and "iplay" is a valid jump.
 *              "play" and "coldplay" is not a valid jump.
 *
 */

public class Week1Hard1 {

	public static void main(String[] args) {
		String [] list = {"a", "ab", "aba", "abba", "abc", "abcd", 
				"abcde", "abcddd", "abcdee", "abcdeef"};
		
		String starterWord = "ab";
		System.out.println(findLongestChain(list,starterWord)); // Should output "abcdeef"
		
		
	}
	/**
	 * 
	 * @param an array called list
	 * @param String starterWord
	 * @return a string with longest chain
	 * Perform Breadth-First Search of a tree where starter word is the root
	 * and children of a node are the words from the list that are 1 character longer. 
	 * We trace the chains of word from the root of the tree to the lowest level possible.  
	 */
	public static String findLongestChain(String[]list, String starterWord){
		String longestWord = "";
		LinkedList<Stack<String>> queue = new LinkedList();
		//Initialize a stack that holds the word chain, starting with starterWord
		Stack<String> starterChain = new Stack();
		starterChain.push(starterWord);
		queue.add(starterChain);
		Stack<String> temp = starterChain;
		while(queue.size() > 0){
			for(int i=0; i<queue.size(); i++){
				temp = queue.remove();
				for(int j=0; j<list.length; j++){
					if(list[j].length() == temp.peek().length() + 1){
						if(isValidJump(temp.peek(), list[j])){
							Stack<String> newChain = (Stack<String>)temp.clone();
							newChain.push(list[j]);
							queue.add(newChain);
						}
					}
				}
			}
		}
		longestWord = temp.toString();
		return longestWord;
		
	}
	
	public static boolean isValidJump(String word1, String word2){
		if(word2.length() - word1.length() != 1){ //second word in chain must be longer than first word
			return false;
		}
		int mismatches = 0;
		int offset = 0; 
		for (int i=0; i<word1.length(); i++){
			if(word1.charAt(i) != word2.charAt(i+offset)){
				mismatches++;
				offset++;
				
			}
			if(mismatches > 1){
				return false;
			}
		}
		if(mismatches == 1 && offset > 0){
			return false;
		}
		
		return true;
	}

}
