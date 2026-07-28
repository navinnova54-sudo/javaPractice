import java.util.Scanner;

public class Problem1 {

public class TankEmptyDay {

    static int findDay(int capacity, int l) {

        int day = l + 1;

        while (true) {
            int k = day - (l + 1);

            if (capacity - (k * (k + 1)) / 2 <= l) {
                return day;
            }

            day++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int capacity = sc.nextInt();
        int l = sc.nextInt();

        System.out.println(findDay(capacity, l));

        sc.close();
    }
}
    
}
