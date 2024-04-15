import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        try {
            // Read height and weight from user input
            double height = in.nextDouble();  // User inputs height in meters
            double weight = in.nextDouble();  // User inputs weight in kilograms

            // Check if height is greater than zero to avoid arithmetic errors
            if (height > 0) {
                // Calculate BMI
                double bmi = weight / (height * height);

                // Print only the BMI result formatted to two decimal places
                System.out.printf("%.2f\n", bmi);
            } else {
                System.out.println("Height must be greater than zero.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please ensure you enter valid numbers.");
        } finally {
            // Close the scanner to free up resources
            in.close();
        }
    }
}
