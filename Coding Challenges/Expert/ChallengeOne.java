package meeting1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// Binary Tree class
public class ChallengeOne{
	// Node class
	public class Node{
		int value;
		String name;
		Node left;
		Node right;
		Node parent = null;
		
		public Node(int value, String name) {
			this.value = value;
			this.name = name;
			
		}
		
		public void setParent(Node n) {
			this.parent = parent;
		}
		
		public Node getLeft() {
			return left;
		}
		
		public Node getRight() {
			return right;
		}
	}
	
	// instance of BinarySearchTree
	Node root;
	// Constructor
	public ChallengeOne() {}
	
	/*
	 * Make array that holds the numerical char values of each word in string array
	 * Sort the int array
	 * Sort the String array to match the order based on the int array
	 * return the output of helper method
	 */
	
	public Node constructBinarySearchTree(String[] words) {
		int[] wordVals = getIntArray(words);
		Arrays.sort(wordVals);
		sortStringArray(words, wordVals);
		
		return constructBinarySearchTree(wordVals, words, 0, wordVals.length-1);
	}
	
	// helper
	public Node constructBinarySearchTree(int[] wordVals, String[] words, int left, int right) {
		
		if(left > right) {
			return null;
		}
		// Use binary search process to make tree nodes
		int middle = left + (right-left)/2;
		Node rootNode = new Node(wordVals[middle], words[middle]);
		
		rootNode.left = constructBinarySearchTree(wordVals, words, left, middle-1);
		rootNode.right = constructBinarySearchTree(wordVals, words, middle+1, right);

		return rootNode;
	}
	
	public int[] getIntArray(Object[] words) {
		int[] wordVals = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			int value = 0;
			for(int j = 0; j < ((String) words[i]).length();j++) {
				value += ((String) words[i]).charAt(j);
			}
			wordVals[i] = value;
		}
		return wordVals;
	}
	
	private void sortStringArray(String[] words, int[] wordVals) {
		
		String tmp = "";
		
		for(int i = 0; i< words.length; i++) {
			for(int j = 0; j<words.length; j++) {
				int value = 0;
				for(int k = 0; k < words[j].length();k++) {
					value += words[j].charAt(k);
				}
				if(value == wordVals[i]) {
					tmp = words[i];
					words[i] = words[j];
					words[j] = tmp;
					
					
				}
			}
		}
		
//		return words;
	}
	
	public static void main(String[]arg) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the words (No special characters): ");
		String input = in.nextLine();
		System.out.println();
		String[] words = input.split(" ");
		
		
		
		ChallengeOne bst = new ChallengeOne();
		Node n = bst.constructBinarySearchTree(words);
		
		parentToNode(n);
		printNodes(n);

		
	}
	
	public static void printNodes(Node n) {
		if(n.parent != null) {
			if(n.parent.left != null)
				if(n.name.equals(n.parent.left.name))
					System.out.println("Left node from " + n.parent.name + ": " +n.name);
			if(n.parent.right != null)
				if(n.name.equals(n.parent.right.name))
					System.out.println("Right node from " + n.parent.name + ": " +n.name);
		}
		else
			System.out.println("Root: " + n.name);
		if(n.left != null) {
			printNodes(n.left);
		}
		if(n.right != null) {
			printNodes(n.right);
		}
	}
	
	public static void parentToNode(Node n) {
		
		if(n.left != null) {
			n.left.parent = n;
			parentToNode(n.left);
		}
		if(n.right != null) {
			n.right.parent = n;
			parentToNode(n.right);
		}
			
	}
}
