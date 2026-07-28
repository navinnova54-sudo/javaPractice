public class Problem1 {
    class Solution {

    public String countAndSay(int n) {

        String s = "1";

        for (int i = 1; i < n; i++) {

            StringBuilder temp = new StringBuilder();
            int count = 1;

            for (int j = 0; j < s.length(); j++) {

                while (j < s.length() - 1 &&
                       s.charAt(j) == s.charAt(j + 1)) {

                    count++;
                    j++;
                }

                temp.append(count).append(s.charAt(j));
                count = 1;
            }

            s = temp.toString();
        }

        return s;
    }
}
    
}
