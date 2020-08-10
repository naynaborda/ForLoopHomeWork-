import java.util.Scanner;

public class ArmstrongNumber5FourDigit {
    //5.WAP to input any number rand check if it is ArmStrong number or not
    //eg number =153(1*1*1)+(5*5*5)+(3*3*3)=1+125+27=153
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number to check if it is ArmStrong Number or not: ");
        int number = scanner.nextInt();
        int temp1 = number;
        int length = 0;
        while (temp1 != 0)
        //to find a length of the number
        {
            temp1 = temp1 / 10;//153/10=15,15/10=1,1/10=0
            length = length + 1;//0+1=1,1+1=2,2+1=3
        }
        //to reverse a number
        int temp2 = number;
        int arm = 0;
        int rem;
        while (temp2 != 0) {
            //to find out a last digit number
            rem = temp2 % 10;//153%10=3,15%10=5,1%10=1
            int mul = 1;
            for (int i = 1; i <= length; i++) {
                mul = mul * rem;//1*3=3,3*3=9,9*3=27,5*1=5,5*5=25,25*5=125,1*1=1,1*1=1,1*1=1
            }
            arm = arm + mul;//0+27=27,27+125=152,152+1=153
            temp2 = temp2 / 10;//153/10=15,15/10=1,1/10=0

        }
        if (arm == number) {
            System.out.println(number + " is armstrong number");
        } else {
            System.out.println(number + " is not armstrong number");


        }
    }
}



