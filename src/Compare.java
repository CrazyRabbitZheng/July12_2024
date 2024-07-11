import java.util.Scanner;

/**
 * takes 2 inputs
 * compare and display the larger
 */
public class Compare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number");
        int secondNumber = sc.nextInt();

        System.out.print("Enter third number");
        int thirdNumber = sc.nextInt();

        System.out.printf("The sum of the three is %d%nThe average of the three is %d%nThe product of the 3 is %d%n",
                (firstNumber + secondNumber + thirdNumber),(firstNumber + secondNumber + thirdNumber)/3,firstNumber * secondNumber * thirdNumber);

        if ((firstNumber >= secondNumber) & (firstNumber >= thirdNumber)) {
            System.out.println("The largest of the three is " + firstNumber);
            if (secondNumber >= thirdNumber) {
                System.out.println("The smallest of the three is " + thirdNumber);
            } else {
                System.out.println("The smallest of the three is " + secondNumber);
            }
        }

        if ((secondNumber >= firstNumber) & (secondNumber >= thirdNumber)) {
            System.out.println("The largest of the three is " + secondNumber);
            if (firstNumber >= thirdNumber) {
                System.out.println("The smallest of the three is " + thirdNumber);
            }else {
                System.out.println("The smallest of the three is " + firstNumber);
            }
        }

        if ((thirdNumber >= secondNumber) & (thirdNumber >= firstNumber)) {
            System.out.println("The largest of the three is " + thirdNumber);
            if (firstNumber >= secondNumber) {
                System.out.println("The smallest of the three is " + secondNumber);
            }else {
                System.out.println("The smallest of the three is " + firstNumber);
            }
        }


    }
}
