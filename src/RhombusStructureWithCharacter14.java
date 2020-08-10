import java.util.Scanner;

public class RhombusStructureWithCharacter14 {
    public static void main(String[] args) {
        //14.WAP to display the following character rhombus structure
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of rows to see rhombus structure: ");
        int number = scanner.nextInt();
        int count = 1;
        int count2 = 1;
        char c = 'A';
        //for upper part
        for (int i = 1; i < (number * 2); i++) {
            for (int spc = number - count2; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i < number) {
                count2++;

            } else {
                count2--;
            }
            //for lower part
            for (int j = 0; j < count; j++) {
                //print character
                System.out.print(c);
                if (j < count / 2) {
                    c++;
                } else {
                    c--;
                }
            }
            if (i < number) {
                count = count + 2;
            } else {
                count = count - 2;
            }
            c = 'A';
            System.out.println();
        }
    }
}
