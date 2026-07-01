public class ValidAnagrams {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean isAnagram = true;

        if (s.length() != t.length()) {
            isAnagram = false;
        } else {
            int[] charCounts = new int[26];

            for (int i = 0; i < s.length(); i++) {
                charCounts[s.charAt(i) - 'a']++;
                charCounts[t.charAt(i) - 'a']--;
            }

            for (int count : charCounts) {
                if (count != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        System.out.println("Are the strings anagrams? " + isAnagram);
    }
}
