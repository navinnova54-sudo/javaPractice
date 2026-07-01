import java.util.Scanner;

public class SmallestEvenMultiple {
        public static int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : n * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();
        
        int result = smallestEvenMultiple(n);
        System.out.println("The smallest even multiple of " + n + " is: " + result);
        
        scanner.close();
    }
}
