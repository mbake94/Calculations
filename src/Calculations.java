import java.util.Scanner;

/*
Prompt the user for 2 integers
Calculate product of the two
Print the sum and product of both obtained results
 */
public class Calculations {
    public static void main (String[] args) {
        int inputOne;
        int inputTwo;
        Scanner keybd = new Scanner(System.in);
        System.out.print("Enter a number: ");
        inputOne = keybd.nextInt();
        System.out.print("Enter another number: ");
        inputTwo = keybd.nextInt();
        System.out.println("The sum is: " + inputOne + inputTwo);
        System.out.println("The product is: " + inputOne * inputTwo);

    }
}
