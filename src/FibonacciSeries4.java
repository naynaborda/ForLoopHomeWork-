import java.util.Scanner;

public class FibonacciSeries4 {
    public static void main(String[] args) {
        //4.Print the sequence 1 1 2 3 5 8 13 21(Fibonacci number)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number up to you want to see Fibonacci Series: ");
        int number = scanner.nextInt();
        int n1 = 1;
        int n2 = 1;
        int n3;

        for (int i = 1; i < number; i++) {
            System.out.print(n1 + " ");
            /*on each iteration, assigning second number to the first number and assigning the
            sum of last two numbers to the second number
             */
            n3 = n1 + n2;//1+1=2,2+1=3
            n1 = n2;//1=1
            n2 = n3;//1=2

        }
    }
}
