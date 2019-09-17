import java.util.Scanner;

public class Pyramid2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of lines: ");
        int number = input.nextInt();
        if (number >= 10) {
            for (int i = 1; i <= number; i++) {

                for (int j = 1; j <= number - i; j++) {
                    System.out.print("    ");
                }
                for (int h = i; h >= 1; h--) {
                    System.out.printf("%4d", h);
                }
                for (int k = 2; k <= i; k++) {
                    System.out.printf("%4d", k);

                }

                System.out.println();
            }
        } else {
            for (int i = 1; i <= number; i++) {

                for (int j = 1; j <= number - i; j++) {
                    System.out.printf("   ");
                }
                for (int h = i; h >= 1; h--) {
                    System.out.printf("%3d",  h);
                }
                for (int k = 2; k <= i; k++) {
                    System.out.printf("%3d",  k);

                }

                System.out.println();
            }
        }


    }
}
