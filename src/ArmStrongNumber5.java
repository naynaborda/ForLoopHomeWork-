import java.util.Scanner;

public class ArmStrongNumber5 {
    //5.WAP to input any number rand check if it is ArmStrong number or not
    // to check armstrong number eg.153(1*1*1)+(5*5*5)+(3*3*3)=1+125+27=153

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 digit number to check if it is ArmStrong Number or not: ");
        int num = scanner.nextInt();
        int temp = num;
        int rem;
        int sum = 0;

        for (; temp > 0; temp /= 10) {
            //to find out reminder
            rem = temp % 10;//153%10=3,15%10=5,1%10=1
            sum = sum + rem * rem * rem;//3*3*3=27+5*5*5=125=1*1*1=1
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");

        }
    }
}
