import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        
        Set<Integer> seenNumbers = new HashSet<>();
        boolean isHappy = true;

        while (n != 1) {
            int currentSum = 0;
            while (n > 0) {
                int digit = n % 10;
                currentSum += digit * digit;
                n /= 10;
            }
            
            n = currentSum;

            if (seenNumbers.contains(n)) {
                isHappy = false;
                break;
            }
            seenNumbers.add(n);
        }

        System.out.println("Is it a happy number? " + isHappy);
    }
}
