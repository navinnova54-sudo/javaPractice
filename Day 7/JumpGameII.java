public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        int jumps = 0;
        int currentEnd = 0;
        int furthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            furthest = Math.max(furthest, i + nums[i]);
            
            if (i == currentEnd) {
                jumps++;
                currentEnd = furthest;
            }
        }

        System.out.println("Minimum number of jumps: " + jumps);
    }
}

