public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16; 
        boolean isPower = (n > 0) && ((n & (n - 1)) == 0);

        if (isPower) {
            System.out.println(n + " is a power of two.");
        } else {
            System.out.println(n + " is NOT a power of two.");
        }
    }
}
