public class SimpleTribonacci {
    public static void main(String[] args) {
        int count = 10; 
        int t0 = 0;
        int t1 = 0;
        int t2 = 1;

        System.out.println("First " + count + " numbers in the Tribonacci sequence:");

        for (int i = 1; i <= count; i++) {
            System.out.print(t0 + ", ");

            int nextTerm = t0 + t1 + t2;
            
            t0 = t1;
            t1 = t2;
            t2 = nextTerm;
        }
    }
}
