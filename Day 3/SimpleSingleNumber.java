public class SimpleSingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 2, 1}; 
        int singleNum = 0;

        for (int num : nums) {
            singleNum = singleNum ^ num; 
        }
        System.out.println("The single unique number is: " + singleNum);
    }
}
