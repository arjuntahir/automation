package assignments;
import java.util.Scanner;

public class EvenOddSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumOdd = 0;
        int countOdd = 0;
        int sumEven = 0;
        int countEven = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
                countEven++;
            } else {
                sumOdd += number;
                countOdd++;
            }
        }

        if (countEven > 0) {
            double averageEven = (double) sumEven / countEven;
            System.out.println("Sum of even numbers: " + sumEven);
            System.out.println("Average of even numbers: " + averageEven);
        } else {
            System.out.println("No even numbers entered.");
        }

        if (countOdd > 0) {
            double averageOdd = (double) sumOdd / countOdd;
            System.out.println("Sum of odd numbers: " + sumOdd);
            System.out.println("Average of odd numbers: " + averageOdd);
        } else {
            System.out.println("No odd numbers entered.");
        }
    }
}

