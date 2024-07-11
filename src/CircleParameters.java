import java.util.Scanner;

/**
 * This class gets an integer input as a radius and print the diameter, circumference and area
 */
public class CircleParameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");

        int radius = sc.nextInt();
        System.out.printf("The diameter of the circle is %d%nThe circumference is %.2f%nThe area is %.2f", radius * 2, radius * 2 *Math.PI, Math.PI * radius * radius *radius );
    }//made a mistake -- used %.2f for the int diameter.
}
