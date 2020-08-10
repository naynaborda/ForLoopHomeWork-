import java.util.Scanner;

public class RhombusStructureWithNumber13 {
    //13.WAP to display the number rhombus structure.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number to display rhombus structure : ");
        int number = scanner.nextInt();
        int count = 1;
        int noOfSpaces = 1;
        int start = 0;
        //for upper part
        for (int i = 1; i < (number * 2); i++) {
            //for spaces
            for (int spc = number - noOfSpaces; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i < number) {
                start = i;     //for number
                noOfSpaces++;   //for spaces
            } else {
                start = number * 2 - i;  //for number
                noOfSpaces--;  //for spaces
            }
            //for lower part
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j < count / 2) {
                    start--;
                } else {
                    start++;
                }

            }
            if (i < number) {
                count = count + 2;
            } else {
                count = count - 2;
            }
            System.out.println();

        }

    }
}
