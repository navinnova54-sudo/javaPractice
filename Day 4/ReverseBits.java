public class ReverseBits {
    public static void main(String[] args) {
        int n = 11; 
        
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
                        result |= (n & 1);
            
            n >>>= 1; 
        }

        System.out.println("Original integer: " + 11);
        System.out.println("Reversed bits integer: " + result);
    }
}
