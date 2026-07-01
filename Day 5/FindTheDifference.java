public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        char extraChar = 0;

        for (int i = 0; i < s.length(); i++) {
            extraChar ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            extraChar ^= t.charAt(i);
        }

        System.out.println("The added character is: " + extraChar);
    }
}
