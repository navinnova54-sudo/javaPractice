public class BinaryGapProgram {
    public static void main(String[] args) {
        int n = 22; 
        
        int maxGap = 0;
        int currentGap = -1; 

        while (n > 0) {
            if ((n & 1) == 1) {
                if (currentGap != -1) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                currentGap = 0; 
            } else {
                if (currentGap != -1) {
                    currentGap++;
                }
            }
            n >>>= 1;
        }

        System.out.println("The maximum binary gap is: " + maxGap);
    }
}
