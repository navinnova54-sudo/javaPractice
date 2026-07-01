public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int totalSurplus = 0;
        int currentSurplus = 0;
        int startStation = 0;

        for (int i = 0; i < gas.length; i++) {
            int netGas = gas[i] - cost[i];
            totalSurplus += netGas;
            currentSurplus += netGas;

            if (currentSurplus < 0) {
                startStation = i + 1;
                currentSurplus = 0;
            }
        }

        int result = (totalSurplus >= 0) ? startStation : -1;
        System.out.println("Starting gas station index: " + result);
    }
}

