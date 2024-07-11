import java.util.Scanner;

/**
 * input 5 numbers and get the largest and the smallest
 */
public class Compare5Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter 3rd number: ");
        int num3 = sc.nextInt();

        System.out.println("Enter 4th number: ");
        int num4 = sc.nextInt();

        System.out.println("Enter 5th number: ");
        int num5 = sc.nextInt();

        int smallest = 0;
        int largest = 0;

        if (num1 > num2) {
            largest = num1;
            smallest = num2;
        }else{
            largest = num2;
            smallest = num1;
        }

        if (largest < num3) {
            largest = num3;
        }else if (smallest > num3) {
            smallest = num3;
        }

        if (largest < num4) {
            largest = num4;
        }else if (smallest > num4) {
            smallest = num4;
        }

        if (largest < num5) {
            largest = num5;
        }else if (smallest > num5) {
            smallest = num5;
        }

        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);
    }
}
