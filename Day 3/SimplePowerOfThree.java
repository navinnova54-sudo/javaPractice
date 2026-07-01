public class SimplePowerOfThree {
    public static void main(String[] args) {
        int number = 27; 
        int originalNumber = number;
        boolean isPower = true;

        if (number <= 0) {
            isPower = false;
        } else {
            
            while (number % 3 == 0) {
                number = number / 3;
            }
            
    
            isPower = (number == 1);
        }

    
        if (isPower) {
            System.out.println(originalNumber + " is a power of three.");
        } else {
            System.out.println(originalNumber + " is NOT a power of three.");
        }
    }
}
