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

        //store and take input from two numbers
        double num1, num2;
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        System.out.println("Enter the operator (*,/,%,+,-):");

        char op = input.next().charAt(0);
        double result = 0;

        input.close();

        switch (op) {
            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            case '%':
                result = num1 % num2;
                break;

            case '+':
                result = num1 + num2;
                break;
            
            case '-':
                result = num1 - num2;
                break;
            
            default:
                System.out.println("You enter wrong operator");
        }

        System.out.println("The final result:");
        System.out.println();

        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
}
