package ConditionalAndSwitch;

import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {

    char opr;
    Double number1, number2, result;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a operator: +, -, *, or /");
    opr = s.next().charAt(0);
    System.out.println("Enter first number");
    number1 = s.nextDouble();
    System.out.println("Enter second number");
    number2 = s.nextDouble();

    switch (opr) {
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Wrong Input");
        break;
    }

    s.close();
  }
}
