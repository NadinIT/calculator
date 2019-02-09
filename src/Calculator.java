//ask user write numbers

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);

        /* 1. Ask user to enter number called num1
           2. if num1 is greater than 10, print error then go back to step 1
           3. else if num1 is less than 10, stop
         */
        System.out.println("Enter your expression:");
//        String expression;
//        expression = myNum.next();

        String expression = myNum.next();
        //how to make this array two symbols?
        // 110000+11


        char[] arr = expression.toCharArray();

        char num1 = arr[0];
        char operator = arr[1];
        char num2 = arr[2];

        int n1 = Character.getNumericValue(num1);
        int n2 = Character.getNumericValue(num2);

        //if operator = '-' subtract
        //if operator = '+' add
        //if operator = "*" multiply
        //if operator = "/" divide

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

