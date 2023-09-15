package assignments;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int num) {
        int originalNum, remainder, result = 0;
        originalNum = num;

        // Calculate the number of digits
        int numberOfDigits = (int) Math.log10(num) + 1;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, numberOfDigits);
            originalNum /= 10;
        }

        // Check if the result is equal to the original number
        return result == num;
    }
}

