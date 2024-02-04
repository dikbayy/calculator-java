package Project.Java;
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class calculator {
    // main function
    public static void main(String[] args) {
        // take input from the user
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers: ");

        //store and take input for the numbers
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Enter the operator (*,/,%,+,-):");

        // store and take input for operator
        char op = input.next().charAt(0);
        double result = 0;

        // close the Scanner class
        input.close();

        // switch expression 
        switch (op) {
            // case to multiply two numbers
            case '*':
                result = num1 * num2;
                break;
            // case to divide two numbers
            case '/':
                result = num1 / num2;
                break;
            // case to mod two numbers
            case '%':
                result = num1 % num2;
                break;
            // case to add two numbers
            case '+':
                result = num1 + num2;
                break;
            // case to subtract two numbers
            case '-':
                result = num1 - num2;
                break;
            // default case if previous case doesn't match
            default:
                System.out.println("You enter wrong operator");
        }

        System.out.println("The final result:");
        System.out.println();
        // print the final result
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
}
