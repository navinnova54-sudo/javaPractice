public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int result = 0;
        if ((totalSum + target) % 2 == 0 && Math.abs(target) <= totalSum) {
            int subsetSum = (totalSum + target) / 2;
            int[] dp = new int[subsetSum + 1];
            dp[0] = 1;

            for (int num : nums) {
                for (int j = subsetSum; j >= num; j--) {
                    dp[j] += dp[j - num];
                }
            }
            result = dp[subsetSum];
        }

        System.out.println("Number of ways to reach target: " + result);
    }
}
