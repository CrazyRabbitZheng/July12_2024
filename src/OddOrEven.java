import java.util.Scanner;

/**
 * This class tells an input to be odd or even
 * @author--Zheng Wang
 */
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if(num == 1) {
            System.out.printf("%d is odd", num);
        }else if (num % 2 == 0) {
            System.out.printf("%d is even", num);
        }else {
            System.out.printf("%d is odd", num);
        }
    }
}
