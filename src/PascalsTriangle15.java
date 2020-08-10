import java.util.Scanner;

public class PascalsTriangle15 {
    //15.WAP to display Pascal's triangle.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number of Rows to display pascal's triangle:");
        int numOfRaws = scanner.nextInt();
        int c = 1;
        int k;
        for (int i = 0; i < numOfRaws; i++) {
            for (k = 1; k <= numOfRaws - i; k++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
                System.out.print(" " + c);
            }
            System.out.print("\n");


        }
    }
}
