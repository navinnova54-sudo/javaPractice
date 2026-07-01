import java.time.LocalTime; 
import java.util.Scanner;   

public class DelayedArrivalWithTimeAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter original arrival hour (0-23): ");
        int arrivalHour = scanner.nextInt();
        
        System.out.print("Enter delay time in hours: ");
        int delayHours = scanner.nextInt();
        
        LocalTime scheduledTime = LocalTime.of(arrivalHour, 0);
                LocalTime actualTime = scheduledTime.plusHours(delayHours);
                System.out.println("The updated delayed arrival time is: " + actualTime.getHour());
        
        scanner.close();
    }
}
