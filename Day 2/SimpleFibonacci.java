public class SimpleFibonacci {
    public static void main(String[] args) {
        int count = 10; 
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("First " + count + " numbers in Fibonacci sequence:");

        for (int i = 1; i <= count; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;   
            secondTerm = nextTerm;    
        }
    }
}
