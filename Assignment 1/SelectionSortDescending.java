public class SelectionSortDescending {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max])
                    max = j;
            }

            temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Descending Order:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}