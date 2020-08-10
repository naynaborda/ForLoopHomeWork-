import java.util.Scanner;

public class MultiplicationTable10 {
    //10.WAP in java to display the multiplication table of given number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number which you want to print table:");
        int number = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }


    }
}
