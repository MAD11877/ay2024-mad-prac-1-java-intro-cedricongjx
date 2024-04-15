import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = Integer.parseInt(in.nextLine());

        // Loop for each line of the triangle
        for (int i = n; i > 0; i--) {
            // Loop for printing the asterisks on each line
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        // Close the scanner
        in.close();
    }
}
