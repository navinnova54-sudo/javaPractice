public class SimpleMissingNumber {
    public static void main(String[] args) {
        // An array of size 3 containing distinct numbers from 0 to 3. The number 2 is missing.
        int[] nums = {3, 0, 1}; 
        int n = nums.length;

        // Step 1: Calculate the expected sum using Gauss's formula
        int expectedSum = (n * (n + 1)) / 2;

        // Step 2: Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // Step 3: The missing number is the difference
        int missingNumber = expectedSum - actualSum;

        // Print the result
        System.out.println("The missing number is: " + missingNumber);
    }
}
