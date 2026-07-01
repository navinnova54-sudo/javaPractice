import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>(List.of("hot", "dot", "dog", "lot", "log", "cog"));

        Set<String> words = new HashSet<>(wordList);
        int steps = 0;

        if (!words.contains(endWord)) {
            steps = 0;
        } else {
            Queue<String> queue = new ArrayDeque<>();
            queue.offer(beginWord);
            int level = 1;

            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    String currentWord = queue.poll();
                    if (currentWord.equals(endWord)) {
                        steps = level;
                        queue.clear();
                        break;
                    }

                    char[] chars = currentWord.toCharArray();
                    for (int j = 0; j < chars.length; j++) {
                        char originalChar = chars[j];
                        for (char c = 'a'; c <= 'z'; c++) {
                            chars[j] = c;
                            String nextWord = new String(chars);
                            if (words.contains(nextWord)) {
                                queue.offer(nextWord);
                                words.remove(nextWord);
                            }
                        }
                        chars[j] = originalChar;
                    }
                }
                level++;
            }
        }

        System.out.println("Shortest transformation length: " + steps);
    }
}

