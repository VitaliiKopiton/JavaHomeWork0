
package com.pb.kopiton.hw2;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {


        Scanner a = new Scanner(System.in);
        System.out.print("Введите числовое значение: ");

        int operand1;
        int operand2;
        String sign;

        operand1 = a.nextInt();        // Останавливается, ждет ввода пользователя

        System.out.print("Введите второе числовое значение: ");
        operand2 = a.nextInt();

        System.out.print("Введите математическое действие которое хотите сделать с числами +, -, /, * : ");
        sign = a.next();

        if (operand2 == 0 && sign.equals ("/")) {
        System.out.println("Деление на ноль невозможно !!!");
        }
        else {

            switch (sign) {
                case "+":
                    System.out.println("Результат " + (operand1) + (sign) + (operand2) + ("=") + (operand1 + operand2));
                    break;

                case "-":
                    System.out.println("Результат " + (operand1) + (sign) + (operand2) + ("=") + (operand1 - operand2));
                    break;

                case "*":
                    System.out.println("Результат " + (operand1) + (sign) + (operand2) + ("=") + (operand1 * operand2));
                    break;

                case "/":
                    System.out.println("Результат " + (operand1) + (sign) + (operand2) + ("=") + (operand1 / operand2));
                    break;
                default:
                    System.out.println("Mатематическое действие указано не верно");
            }
        }

    }

}
