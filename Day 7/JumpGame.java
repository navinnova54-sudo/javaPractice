public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        boolean canReach = true;
        int maxReachable = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReachable) {
                canReach = false;
                break;
            }
            maxReachable = Math.max(maxReachable, i + nums[i]);
        }

        System.out.println("Can reach the last index? " + canReach);
    }
}
