import java.util.Scanner;

public class FactorialNumber16 {
    //create a function that takes an integer and returns the factorial of that integer.
    //factorial number is that multiplied by all positive lower integers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to know its factorial number: ");
        int number = scanner.nextInt();

        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is : " + fact);

    }
}
