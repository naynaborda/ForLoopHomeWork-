import java.util.Scanner;

public class PrimeNumber7 {
    public static void main(String[] args) {
        //7.WAP to input any number and check if it is prime number or not
        //a number which is divided by itself and 1 is a prime number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number to check if it is Prime Number or not: ");
        int number = scanner.nextInt();
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {//2<=2.5
            temp = number % i;//5%2=1
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        //If isPrime is true then number is prime else not
        if (isPrime)
            System.out.println(number + " is a Prime Number");
        else
            System.out.println(number + " is not a Prime Number");
    }
}
