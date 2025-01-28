import java.util.Scanner;
public class Worst_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        long startTime = System.nanoTime();
        switch (age) {
            case 0:
                System.out.println("Age cannot be zero");
                break;
            case 1:
                System.out.println("You are not eligible to vote");
                break;
            case 2:
                System.out.println("You are not eligible to vote");
                break;
            case 3:
                System.out.println("You are not eligible to vote");
                break;
            case 4:
                System.out.println("You are not eligible to vote");
                break;
            case 5:
                System.out.println("You are not eligible to vote");
                break;
            case 6:
                System.out.println("You are not eligible to vote");
                break;
            case 7:
                System.out.println("You are not eligible to vote");
                break;
            case 8:
                System.out.println("You are not eligible to vote");
                break;
            case 9:
                System.out.println("You are not eligible to vote");
                break;
            case 10:
                System.out.println("You are not eligible to vote");
                break;
            case 11:
                System.out.println("You are not eligible to vote");
                break;
            case 12:
                System.out.println("You are not eligible to vote");
                break;
            case 13:
                System.out.println("You are not eligible to vote");
                break;
            case 14:
                System.out.println("You are not eligible to vote");
                break;
            case 15:
                System.out.println("You are not eligible to vote");
                break;
            case 16:
                System.out.println("You are not eligible to vote");
                break;
            case 17:
                System.out.println("You are not eligible to vote");
                break;
            default:
                System.out.println("You are eligible to vote");
        }
        scanner.close();
        long endTime = System.nanoTime();
        double elapsedTimeInSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Execution time: " + elapsedTimeInSeconds + " seconds");
    }
}
