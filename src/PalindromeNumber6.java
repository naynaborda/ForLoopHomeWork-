import java.util.Scanner;

public class PalindromeNumber6 {
    // 6.WAP to input any number and check if it is Palindrome or not
    //number that is same after reverse eg:545,151,343,55.121
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number to check if it is Palindrome Number or not: ");
        int number=scanner.nextInt();
        int rem;
        int reverse=0;
        int temp=number;
        for(;number>0;){
            //to separate last digit
            rem=number%10;//151%10=1,15%10=5,1%10=1
            //to reverse the number
            reverse=reverse*10+rem;//0*10+1=1,1*10+5=15,15*10+1=151
            number=number/10;//151/10=15,15/10=1,1/10=0.1
        }
        if (temp==reverse){
            System.out.println( "is palindrome number");
        }else{
            System.out.println( " is not palindrome number");
        }


    }
}
