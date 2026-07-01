import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";

        int[] lastIndices = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndices[s.charAt(i) - 'a'] = i;
        }

        List<Integer> partitions = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndices[s.charAt(i) - 'a']);
            
            if (i == end) {
                partitions.add(end - start + 1);
                start = i + 1;
            }
        }

        System.out.println("Partition lengths: " + partitions);
    }
}
