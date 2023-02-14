import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to input a string
        System.out.print("Enter a string with punctuation: ");
        String str = input.nextLine();

        // Call the reverseWords function to reverse the order of words
        String reversed = reverseWords(str);

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseWords(String str) {
        // Split the input string into words
        String[] words = str.split(" ");

        // Create a StringBuilder to build the output string
        StringBuilder sb = new StringBuilder();

        // Iterate over the words in reverse order, appending each word to the StringBuilder
        // along with any punctuation that follows it
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];

            // Check if the word ends with punctuation
            int j = word.length() - 1;
            while (j >= 0 && !Character.isLetterOrDigit(word.charAt(j))) {
                j--;
            }

            // Append the word and any punctuation that follows it to the StringBuilder
            sb.append(word.substring(0, j + 1));
            if (i > 0) {
                sb.append(" ");
            }
        }

        // Return the reversed string
        return sb.toString();
    }
}
