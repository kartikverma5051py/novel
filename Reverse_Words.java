public class Reverse_Words {
    public static String reverseWords(String str) {
        // Split the input string into an array of words
        String[] words = str.split("\\s+");

        // Reverse the order of the words in the array
        int start = 0;
        int end = words.length - 1;
        while (start < end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }

        // Concatenate the reversed words into a single string
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            reversed.append(words[i]);
            if (i < words.length - 1) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

}
