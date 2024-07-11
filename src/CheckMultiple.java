import java.util.Scanner;

/**
 * This class tells if the 1st number is a multiple of the 2nd number
 */
public class CheckMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        if((num1 >= num2) & (num1 % num2 == 0)){
            System.out.printf("The 1st number %d is a multiple of the second number %d ", num1, num2);
        }else {
            System.out.printf("The 1st number %d is NOT a multiple of the second number %d", num1, num2);
        }
    }
}
