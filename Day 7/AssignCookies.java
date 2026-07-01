import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        Arrays.sort(g);
        Arrays.sort(s);

        int childPointer = 0;
        int cookiePointer = 0;

        while (childPointer < g.length && cookiePointer < s.length) {
            if (s[cookiePointer] >= g[childPointer]) {
                childPointer++;
            }
            cookiePointer++;
        }

        System.out.println("Max content children: " + childPointer);
    }
}
