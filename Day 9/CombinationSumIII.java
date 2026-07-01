import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        int k = 3;
        int n = 7;

        List<List<Integer>> result = new ArrayList<>();
        backtrack(k, n, 1, new ArrayList<>(), result);
        System.out.println(result);
    }

    private static void backtrack(int k, int remain, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            if (remain == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (remain - i < 0) {
                break;
            }

            current.add(i);
            backtrack(k, remain - i, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
