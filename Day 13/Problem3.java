import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(b / a);
        } catch (ArithmeticException e) {
            System.out.println("Zero division error");
        }

        try {
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No index");
        }

        input.close();
    }
}
