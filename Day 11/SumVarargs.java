package Day11;

public class SumVarargs {

    static void sum(int... num) {

        int total = 0;

        for (int i : num)
            total += i;

        System.out.println("Sum = " + total);
    }

    public static void main(String[] args) {
        sum(10, 20, 30, 40, 50);
    }
}
