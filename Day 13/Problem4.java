import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome java program");
        int a = sc.nextInt();
        int b = sc.nextInt();
       try
       {
           System.out.println(b/a);
           System.out.println("task completed");
       }catch(Exception e){
           System.out.println(a/b);
           System.out.println("error");
       };

        System.out.println("end of the program");
        System.out.println("thank you");
            sc.close();

    }
}


    
