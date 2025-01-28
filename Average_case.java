import java.util.Scanner;
public class Average_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age for person " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        long startTime = System.nanoTime();
        for (int age : ages) {
            if (age >= 18) {
                System.out.println("Eligible to vote.");
            } else {
                System.out.println("Not eligible to vote.");
            }
        }
        scanner.close();
        long endTime = System.nanoTime();
        double elapsedTimeInSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Execution time: " + elapsedTimeInSeconds + " seconds");
    }
}