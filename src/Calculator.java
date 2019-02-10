//ask user write numbers

import java.util.Scanner;

class Calculator {
    public static int calculate(int a, String op, int b) {

        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }

    public static int askForNumber(Scanner scanner, String msg) {
        do {
            System.out.print(msg);
            int a = scanner.nextInt();
            if (a > 0 && a <= 10) {
                return a;
            }
        } while (true);

    }

    public static String askForOperation(Scanner scanner, String msg) {
        do {
            System.out.println(msg);
            String op = scanner.next();
            boolean valid = op.equalsIgnoreCase("+") || op.equalsIgnoreCase("-") || op.equalsIgnoreCase("*") || op.equalsIgnoreCase("/");

            if (valid) {
                return op;
            }
        } while (true);
    }

    public static String askForRomanNumeral(Scanner scanner, String msg) {
        do {
            System.out.println(msg);
            String r = scanner.next();
            int a = Number.romanToArabic(r);
            if (a >= 0 && a <= 10) {
                return r;
            }
        } while (true);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick Number System: A for Arabic numbers and R for Roman numerals");
        String numberSystem = scanner.next();
        System.out.println("You picked " + numberSystem);

        if (numberSystem.equalsIgnoreCase("A")) {
            int a = askForNumber(scanner, "Enter first number (0-10): ");
            String op = askForOperation(scanner, "Enter operation (+ - * /): ");
            int b = askForNumber(scanner, "Enter second number (0-10): ");
            System.out.println(a + op + b + "=" + calculate(a, op, b));
        } else {
            String romanNum1 = askForRomanNumeral(scanner, "Enter first Roman number (I - X)");
            String op = askForOperation(scanner, "Enter operation (+ - * /): ");
            String romanNum2 = askForRomanNumeral(scanner, "Enter second Roman number (I - X)");

            int a = Number.romanToArabic(romanNum1);
            int b = Number.romanToArabic(romanNum2);
            int result = calculate(a, op, b);
            String resultAsRomanNumeral = Number.arabicToRoman(result);
            System.out.println(romanNum1 + op + romanNum2 + "=" + resultAsRomanNumeral);
            System.out.println(a + op + b + "=" + result);
        }

    }
}
