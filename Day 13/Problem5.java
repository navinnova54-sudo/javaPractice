public class Problem5 {
    public static void main(String[] args) {

        // Autoboxing
        int a = 10;
        Integer num = a;
        System.out.println("Autoboxing: " + num);

        // Boxing
        Integer num1 = Integer.valueOf(a);
        System.out.println("Boxing: " + num1);

        // Autounboxing
        Integer value = 100;
        int val = value;
        System.out.println("Autounboxing: " + val);

        // Unboxing using valueOf()
        int val1 = Integer.valueOf(value);
        System.out.println("Unboxing: " + val1);

        // Null object
        Integer obj = null;
        System.out.println("Object value: " + obj);

        // Minimum and Maximum
        System.out.println("Min: " + Integer.min(10, 20));
        System.out.println("Max: " + Integer.max(10, 20));

        // Integer limits
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);

        // Compare
        System.out.println("Compare(200, 30): " + Integer.compare(200, 30));

        // String to Integer
        String str = "12345";
        int res = Integer.parseInt(str);
        System.out.println("Parsed value / 100 = " + (res / 100));
    }
}
