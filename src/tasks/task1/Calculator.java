package task1;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        String operator = scanner.next();
        int secondNumber = scanner.nextInt();
        int result;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                System.out.println(result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println(result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println(result);
                break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
