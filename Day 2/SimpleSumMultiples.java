public class SimpleSumMultiples {
    public static void main(String[] args) {
        int n = 7; // The upper limit of our range
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i; 
            }
        }
        System.out.println("The sum of multiples up to " + n + " is: " + sum);
    }
}
