public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        boolean canConstruct = true;

        if (ransomNote.length() > magazine.length()) {
            canConstruct = false;
        } else {
            int[] counts = new int[26];

            for (int i = 0; i < magazine.length(); i++) {
                counts[magazine.charAt(i) - 'a']++;
            }

            for (int i = 0; i < ransomNote.length(); i++) {
                counts[ransomNote.charAt(i) - 'a']--;
                if (counts[ransomNote.charAt(i) - 'a'] < 0) {
                    canConstruct = false;
                    break;
                }
            }
        }

        System.out.println("Can construct ransom note? " + canConstruct);
    }
}
