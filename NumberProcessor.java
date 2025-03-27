import java.util.Scanner;

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Accept 10 numbers from the user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum6to8 = numbers[5] + numbers[6] + numbers[7];
        System.out.println("Sum of 6th to 8th numbers: " + sum6to8);

        int sum4to9 = numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8];
        System.out.println("Sum of 4th to 9th numbers: " + sum4to9);

        int result = sum4to9 - sum6to8;

        System.out.println("Final Result (Sum4to9 - Sum6to8): " + result);
        
        scanner.close();
    }
}
