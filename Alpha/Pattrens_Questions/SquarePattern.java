import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{
        
        // Input: Size of the square
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();
        
        // Printing the square pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    }
}
