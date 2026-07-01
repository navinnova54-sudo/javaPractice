public class DecodeWays {
    public static void main(String[] args) {
        String s = "226";

        int result = 0;
        if (s != null && s.length() != 0 && s.charAt(0) != '0') {
            int prev2 = 1;
            int prev1 = 1;

            for (int i = 1; i < s.length(); i++) {
                int current = 0;
                int singleDigit = s.charAt(i) - '0';
                int doubleDigit = Integer.parseInt(s.substring(i - 1, i + 1));

                if (singleDigit >= 1 && singleDigit <= 9) {
                    current += prev1;
                }
                if (doubleDigit >= 10 && doubleDigit <= 26) {
                    current += prev2;
                }

                prev2 = prev1;
                prev1 = current;
            }
            result = prev1;
        }

        System.out.println("Total ways to decode: " + result);
    }
}
