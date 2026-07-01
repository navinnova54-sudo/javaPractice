import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};

        List<Integer> scoreRecord = new ArrayList<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int size = scoreRecord.size();
                scoreRecord.add(scoreRecord.get(size - 1) + scoreRecord.get(size - 2));
            } else if (op.equals("D")) {
                int size = scoreRecord.size();
                scoreRecord.add(scoreRecord.get(size - 1) * 2);
            } else if (op.equals("C")) {
                scoreRecord.remove(scoreRecord.size() - 1);
            } else {
                scoreRecord.add(Integer.parseInt(op));
            }
        }

        int totalSum = 0;
        for (int score : scoreRecord) {
            totalSum += score;
        }

        System.out.println("The final total score is: " + totalSum);
    }
}
