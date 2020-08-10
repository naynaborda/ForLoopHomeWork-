import java.util.Scanner;

public class LeftAngleTriangleWithStar11 {
    //11.Display left angle triangle of * using nested for loops
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input number of rows:");
        int number = scanner.nextInt();


        //for number of rows
        for (int i = 1; i <= number; i++) {//1<=5 condition true so go in inside loop,in 2nd round 2<=5 condition true again goes in inside loop
            //for space
            for (int j = number - 1; j >= i; j--)//4>=1then print 1 space,3>=1 then print 2nd space,2>=1 then 3rd space,1>=1 then 4th space
            {
                System.out.print(" ");
            }
            //for printing a star
            for (int k = 1; k <= i; k++)//1<=1 then print 1 *,2<=1 condition false so come out of this loop
            {
                System.out.print("*");
            }
            System.out.println();//to go in next line

        }


    }
}
