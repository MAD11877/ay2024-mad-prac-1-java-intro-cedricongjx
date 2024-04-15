import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int num = in.nextInt();

        // This array will hold the integers input by the user.
        int[] arr = new int[num];

        // Read integers from the user.
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }

       
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : arr) {
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

      
        int mode = arr[0];  // Start with the first element.
        int maxCount = frequencyMap.get(mode);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        // Printing the mode
        System.out.println(mode);

        // Close the scanner
        in.close();
    }
}

