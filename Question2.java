import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Scan for input without any prompts
            double height = scanner.nextDouble();  // User inputs height in meters
            double weight = scanner.nextDouble();  // User inputs weight in kilograms

            // Calculate BMI
            if (height > 0) { // Ensure height is greater than zero to avoid division by zero
                double bmi = weight / (height * height);

                // Print the BMI formatted to two decimal places
                System.out.printf("%.2f\n", bmi);
            } else {
                System.out.println("Height must be greater than zero.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please ensure you enter numbers.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
