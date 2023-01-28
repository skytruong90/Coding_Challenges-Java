package meeting1;

import java.util.Scanner;

public class ChallengeOne {
	public static void main(String[]args) {
		// For getting input
		Scanner input = new Scanner(System.in);
		// Collect input from user
		System.out.print("Please enter a sentence or phrase: ");
		String userInput = input.nextLine();
		// Add space on console
		System.out.println();
		
		// Break apart the sentence into words,spaces, and punctuation
		String[] brokenSentence = userInput.split("((?<![a-zA-Z])|(?![a-zA-Z]))");				
		
		int l=0;
		int m=(brokenSentence.length-1);
		String temp = "";
		
		/* While left index is less than the right index:
			 * 1. increment the left index until you reach word
			 * 2. decrement the right index until you reach a word
			 * 3. check if left index has surpassed right index; break if true
			 * 4. switch the word[left index] with the word[right index]
			 * 5. increment left index
			 * 6. decrement right index
		 */
		
		while (l < m) {
			// 1
			while (brokenSentence[l].matches("^(?:\\W|\\s)*$")) {
				l++;	
			}
			// 2
			while (brokenSentence[m].matches("^(?:\\W|\\s)*$")) {
				m--;
			} 	
			// 3
			if ( l > m)
				break;
			// 4
			temp = brokenSentence[l];
			brokenSentence[l]=brokenSentence[m];
			brokenSentence[m]=temp;	
			// 5 & 6
			l++;
			m--;
		}
		
		System.out.println();
		// Print reversed sentence or phrase
		for (int k=0; k < brokenSentence.length; k++) {
			System.out.print(brokenSentence[k]);
		}

	}
}
