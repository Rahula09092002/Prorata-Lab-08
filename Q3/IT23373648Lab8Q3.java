import java.util.Scanner;

public class IT23373648Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;   // how many valid numbers stored so far

        // Keep asking until 6 positive numbers are stored
        while (count < numbers.length) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = num;
                count++;
            }
        }

        // Print array contents
        System.out.println();
        System.out.println("Array Contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Find the maximum number
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The Maximum Number Entered: " + max);
    }
}