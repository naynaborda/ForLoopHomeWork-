import java.util.Scanner;

public class NaturalNumberAndtheirSum1 {
    //1.WAP in java display n limit of natural numbers and their sum.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter any number to display n limit of natural number and their sum: ");
        int number = scanner.nextInt();
        for (int i =1; i <= number; i++) {
            System.out.println(i);//1,2,3,4,5,6,7
            sum = sum + i;//sum += i;//0+1=1,1+2=3,3+3=6,6+4=10,10+5=15,15+6=21,21+7=28
        }

        System.out.println(" The Sum of Natural Numbers up to n limit  : " + sum);

    }

}
