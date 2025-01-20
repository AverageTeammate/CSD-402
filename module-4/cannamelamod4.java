// Jacob Cannamela
// CSD 402
//1.20.2025
// module 4 assignment


public class cannamelamod4 {

    // Method to reverse entire string
    public static String reverse(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    // Method to reverse words in a sentence
    public static String reverseWords(String text) {
        String[] words = text.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    // Method to reverse characters within each word
    public static String reverseCharsInWords(String text) {
        String[] words = text.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            reversed.append(new StringBuilder(word).reverse()).append(" ");
        }
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        // Testing string reversal
        String originalText = "Having fun for CSD402";
        System.out.println("Original: " + originalText);
        System.out.println("Reversed: " + reverse(originalText));

        // Testing word reversal
        String sentence = "Java is not as fun as python";
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Words Reversed: " + reverseWords(sentence));

        // Testing character reversal in each word
        String text = "Python is king";
        System.out.println("Original Text: " + text);
        System.out.println("Chars in Words Reversed: " + reverseCharsInWords(text));
    }
}
