import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and prints out the result.
     * 
     * Hint: in.nextInt() to read integer
     */

    Scanner in = new Scanner(System.in);
    int num = in.nextInt(); // User is expected to enter an integer immediately upon execution
    int result = num * num;
    System.out.println(result);
    
    in.close(); // Good practice to close the scanner
  }
}
