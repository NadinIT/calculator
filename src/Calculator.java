//ask user write numbers

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);



            System.out.println("Enter first number");
            int num1 = 0;
            int num2 = 0;
            String operator;
            boolean a = false;
            while (a == false) {
                num1 = myNum.nextInt();
                if (num1 <= 10) {
//                System.out.println(num1);
                    a = true;
                } else {
                    System.out.println("Try number between 1 and 10");
                }
            }
            System.out.println("Enter operation( +,-,*,/)");
            operator = myNum.next();


            System.out.println("Enter second number");
            boolean b = false;
            while (b == false) {
                num2 = myNum.nextInt();
                if (num2 <= 10) {
                    if (num2==0){
                        System.out.println("Error! You cant divide by 0.Try somethimg else");
                    }else{
                        b=true;
                    }
                } else {
                    System.out.println("Try number between 1 and 10");
                }
            }
            if (operator.equals("-")){
                System.out.println(num1 - num2);
            } else if (operator.equals("+")) {
                System.out.println(num1 + num2);
            } else if (operator.equals("*")) {
                System.out.println(num1 * num2);
            } else if (operator.equals( "/")) {
                System.out.println(num1 / num2);
            }

        }

}


