import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to start the stopwatch...");
        long startTime = System.currentTimeMillis();
        
        
       
        System.out.println("Stopwatch started. Press Enter to stop the stopwatch...");
        scanner.nextLine(); 
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime; 
        double elapsedSeconds = elapsedTime/1000 ; 
        
        System.out.printf("Elapsed time: %.3f seconds%n", elapsedSeconds);
        
    }
}
