import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        Set<Character> jewelSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jewelSet.add(jewels.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewelSet.contains(stones.charAt(i))) {
                count++;
            }
        }

        System.out.println("Number of jewels found: " + count);
    }
}
