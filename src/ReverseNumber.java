import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int i = 0;
        while (number != 0) {
            i = i * 10 + number % 10; 
            number /= 10; 
        }

        System.out.println("Reversed Number: " + i);
        scanner.close();
    }
}