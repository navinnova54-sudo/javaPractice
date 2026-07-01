public class SimpleThreeDivisors {
    public static void main(String[] args) {
        int number = 9;
        int divisorCount = 0;

        // Loop to count all divisors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisorCount++;
            }
        }

        if (divisorCount == 3) {
            System.out.println(number + " has exactly 3 divisors.");
        } else {
            System.out.println(number + " does not have exactly 3 divisors. It has " + divisorCount + ".");
        }
    }
}
