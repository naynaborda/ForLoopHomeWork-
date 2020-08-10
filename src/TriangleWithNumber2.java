import java.util.Scanner;

public class TriangleWithNumber2 {

    // 2.WAP in java to display the pattern like triangle with a number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows for triangle with numbers:");
        int number = scanner.nextInt();
        //for printing the numbers
        for (int i = 1; i <= number; i++) {
            //for spaces
            for (int k = number - 1; k >= i; k--) {//eg k=5 so k v
                System.out.print("  ");

            }//increasing the value
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            //for going in next line
            System.out.println("");
        }

    }
}
