import java.util.Scanner;

public class FloydsTriangle9 {
    //9.WAP to Enter and print the number of rows for floyd's triangle.
    //eg number of rows in Floyd's triangle : 6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  Number of rows for floyd's triangle : ");
        int rows = scanner.nextInt();
        int number = 1, counter, j;
        System.out.println("Floyd's triangle");
        System.out.println("**************");
        for (counter = 1; counter <= rows; counter++) {
            for (j = 1; j <= counter; j++) {
                System.out.print(number + " ");
                //Incrementing the number value
                number++;
            }
            //for new lines
            System.out.println();
        }

    }
}

