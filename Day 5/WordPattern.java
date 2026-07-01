import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        String[] words = s.split(" ");
        boolean matches = true;

        if (pattern.length() != words.length) {
            matches = false;
        } else {
            Map<Character, String> charToWord = new HashMap<>();
            Set<String> usedWords = new HashSet<>();

            for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                String word = words[i];

                if (charToWord.containsKey(c)) {
                    if (!charToWord.get(c).equals(word)) {
                        matches = false;
                        break;
                    }
                } else {
                    if (usedWords.contains(word)) {
                        matches = false;
                        break;
                    }
                    charToWord.put(c, word);
                    usedWords.add(word);
                }
            }
        }

        System.out.println("Does string match pattern? " + matches);
    }
}
