import java.util.Scanner;

/**
 * This class takes in a 5-digit integer and prints the integer with spaces between each digit
 * @author--Zheng Wang Stu.ID: 20085058
 */
public class IntegerDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5-digit integer: ");
        int num = sc.nextInt();
        System.out.printf("%d can be written as %d\t%d\t%d\t%d\t%d", num,num/10000,num/1000%10,num/100%10,num/10%10,num%10);
    }
}
