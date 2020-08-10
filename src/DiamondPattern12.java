import java.util.Scanner;

public class DiamondPattern12 {
    //12.WAP in java to display the pattern like a diamond.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of row(half of the diamond): ");
        int row = scanner.nextInt();
        //for upper part
        for (int i = 0; i <= row; i++) {
            //for spaces
            for (int j = 1; j <= row -i; j++) {
                System.out.print(" ");
            }
            //for printing a star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //for lower part
        for (int i = row - 1; i >= 1; i--) {
            //for space
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            //for printing a star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
