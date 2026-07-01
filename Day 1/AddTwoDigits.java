import java.util.Scanner;

public class AddTwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first digit: ");
        int digit1 = scanner.nextInt();
        
        System.out.print("Enter second digit: ");
        int digit2 = scanner.nextInt();
        
        int sum = digit1 + digit2;
        System.out.println("The sum is: " + sum);
        
        scanner.close();
    }
}
