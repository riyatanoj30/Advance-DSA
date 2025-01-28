import java.util.Scanner;
public class Best_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        double startTime = System.nanoTime();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
        scanner.close();
        double endTime = System.nanoTime();
        double elapsedTimeInSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Execution time: " + elapsedTimeInSeconds + " seconds");
    }
}