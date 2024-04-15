import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Directly prompt for height and weight
        double height = scanner.nextDouble();  // User inputs height in meters
        double weight = scanner.nextDouble();  // User inputs weight in kilograms

        // Calculate BMI
        double bmi = weight / (height * height);

       
        System.out.printf("%.2f\n", bmi);

     
        scanner.close();
    }
}
