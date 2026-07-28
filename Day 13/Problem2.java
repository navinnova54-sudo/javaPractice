import java.util.*;

public class Problem2 {

    class Solution {

        public List<String> fullJustify(String[] words, int maxWidth) {

            List<String> res = new ArrayList<>();
            int i = 0;

            while (i < words.length) {

                int j = i, len = 0;

                while (j < words.length &&
                        len + words[j].length() + (j - i) <= maxWidth) {

                    len += words[j].length();
                    j++;
                }

                int gap = j - i - 1;
                StringBuilder sb = new StringBuilder();

                // Last line or one word
                if (j == words.length || gap == 0) {

                    for (int k = i; k < j; k++) {

                        sb.append(words[k]);

                        if (k < j - 1)
                            sb.append(" ");
                    }

                    while (sb.length() < maxWidth)
                        sb.append(" ");
                }

                else {

                    int sp = (maxWidth - len) / gap;
                    int ex = (maxWidth - len) % gap;

                    for (int k = i; k < j; k++) {

                        sb.append(words[k]);

                        if (k < j - 1) {

                            for (int s = 0; s < sp; s++)
                                sb.append(" ");

                            if (ex > 0) {
                                sb.append(" ");
                                ex--;
                            }
                        }
                    }
                }

                res.add(sb.toString());
                i = j;
            }

            return res;
        }
    }

}
