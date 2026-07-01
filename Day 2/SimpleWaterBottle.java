public class SimpleWaterBottle {
    public static void main(String[] args) {
        int capacity = 1000;    
        int currentLevel = 0;   

        System.out.println("Initial Level: " + currentLevel + " mL / " + capacity + " mL");

        currentLevel = capacity;
        System.out.println("After Filling: " + currentLevel + " mL / " + capacity + " mL");
        int drinkAmount = 300;
        currentLevel = currentLevel - drinkAmount;
        System.out.println("After Drinking " + drinkAmount + " mL: " + currentLevel + " mL left");
    }
}
