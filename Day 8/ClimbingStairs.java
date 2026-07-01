public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;

        int result = 0;
        if (n <= 2) {
            result = n;
        } else {
            int first = 1;
            int second = 2;

            for (int i = 3; i <= n; i++) {
                int current = first + second;
                first = second;
                second = current;
            }
            result = second;
        }

        System.out.println("Distinct ways to climb to the top: " + result);
    }
}
