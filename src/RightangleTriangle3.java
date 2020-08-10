import java.util.Scanner;

public class RightangleTriangle3 {
    //3.Display right angle triangle of @ using nested for loops
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to display right angle triangle :");
        int number = scanner.nextInt();

        for ( int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }

    }
}


