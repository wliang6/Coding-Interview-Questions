package Week3;

/**
 * Weekly_Questions
 * @author Winnie Nov 2, 2016
 * Week3Easy2.java
 * Question: Write a function that returns the length of a linked list.
 * What is a linked list? In short, a linked list is a data structure 
 * that contains a chain of nodes. Each node contains only its data 
 * (often node.val) and a reference to the next node (often node.next). 
 * The last node points to null or None as the “next” node. The head node 
 * is the first node in the list, and this is the node that is stored as 
 * a variable to keep track of the list.
 * What is the input? The input is the “head” node of the linked list.
 * What is the output? A node that is located at the midpoint of the linked list. 
 * What if the first node is null or None? Good question! Make sure your 
 * code accounts for that. It should return 0.
 */
public class Week3Easy2 {
	public static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
		}
	}

	public static int lengthOfLinkedList(Node head){
		if(head == null) return 0;
		int counter = 0;
		while(head.next != null){
			head = head.next;
			counter++;
		}
		return counter;
	}
	
	public static void main(String[] args){
		int [] array = new int[] {10, 1, 9, 3, 7};
		Node head = new Node(array[0]);
		Node temp = head;
		for(int i : array){
			temp.next = new Node(i);
			temp = temp.next;
		}
		System.out.println(lengthOfLinkedList(head));
	}
}
