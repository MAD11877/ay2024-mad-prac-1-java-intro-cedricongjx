import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Scan for input without any prompts
        double height = scanner.nextDouble();  // User inputs height in meters
        double weight = scanner.nextDouble();  // User inputs weight in kilograms

        // Calculate BMI
        double bmi = weight / (height * height);

        // Print the BMI formatted to two decimal places
        System.out.printf("%.2f\n", bmi);

        // Close the scanner
        scanner.close();
    }
}
