import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int count = scanner.nextInt();
        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= count; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
        scanner.close();
    }
}
