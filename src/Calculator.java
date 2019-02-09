//ask user write numbers

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);

        System.out.println("Enter your expression:");
        String expression = myNum.next();

        char[] arr = expression.toCharArray();
        char num1 = arr[0];
        char operator = arr[1];
        char num2 = arr[2];

        int n1 = Character.getNumericValue(num1);
        int n2 = Character.getNumericValue(num2);

        if (operator == '-') {
            System.out.println(n1 - n2);
        } else if (operator == '+') {
            System.out.println(n1 + n2);
        } else if (operator == '*') {
            System.out.println(n1 * n2);
        } else if (operator == '/') {
            System.out.println(n1 / n2);
        }
    }

}


