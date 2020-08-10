import java.util.Scanner;

public class First100PrimeNumbers8 {
    //8.WAP to display first n or first 100 prime numbers
    //a number which is divided by itself and 1 is a prime number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number to check first n Prime Number : ");
        int number = scanner.nextInt();
        int num = 0;
        int status = 0;

        if (number >= 2) {
            System.out.println("First " + number + " Prime numbers are:");

        }
        for (int i = 2; i <= number; ) {
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;

        }
    }

}


