import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println(String.format("Multiplication Table of %d:", num));
        int i = 1;
        while (i <= 12){
            System.out.println(String.format("%d x %d = %d", num, i, (num * i)));
            i++;
        }
    }
}