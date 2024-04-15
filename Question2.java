import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        
        Scanner in = new Scanner(System.in);

        // Prompt the user for height in meters
        System.out.println("Enter your height in meters:");
        double height = in.nextDouble();

        // Prompt the user for weight in kilograms
        System.out.println("Enter your weight in kilograms:");
        double weight = in.nextDouble();

        // Calculate BMI: BMI = weight (kg) / (height (m) * height (m))
        double bmi = weight / (height * height);

        // Print out the BMI
        System.out.printf("Your BMI is: ", bmi);

       
        in.close();
    }
}
