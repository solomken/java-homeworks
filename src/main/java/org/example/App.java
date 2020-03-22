package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        /*Задача 1
        String name, admin;
        name = "John";
        admin = name;
        System.out.println(admin);
        */

        /* Задача 2
        int num1 = 10;
        int num2 = 7;
        System.out.println(num1 - num2);
         */

        /*Задача 3
        byte[] arr = {9, 25, 4};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        */

        /*Задача 4
        byte num = 10;
        if (num % 2 == 0){
            System.out.println("It is even number");
        }
        else {
            System.out.println("It is odd number");
        }
         */

        /*Задача 5
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
         */

        /*Задача 6
        byte num = 7;
        for (int i = 1; i < 11; i++) {
            byte result = num*i;
            System.out.println(num +"*" + i + "=" + result);
        }
         */

        /*Задача 7
        byte[] arr = {9, 1, 8, 2};
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
        }
        System.out.println(arrSum);
         */

        //Задача 8
        float num1 = 0;
        float num2 = 0;
        boolean isError = false;
        float result = 0;
        String operation;
        String answer;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter number:");
        if (input1.hasNextFloat()) {
            num1 = input1.nextFloat();
        } else {
            System.out.println("It's not a number lol");
            System.out.println("Once more? y/n");
            Scanner input4 = new Scanner(System.in);
            answer = input4.nextLine();
            if (answer.equals("y")) {
                restart(args);
            } else return;
        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter one more number:");
        if (input2.hasNextFloat()) {
            num2 = input2.nextFloat();
        } else {
            System.out.println("It's not a number lol");
            System.out.println("Once more? y/n");
            Scanner input4 = new Scanner(System.in);
            answer = input4.nextLine();
            if (answer.equals("y")) {
                restart(args);
            } else return;
        }

        Scanner input3 = new Scanner(System.in);
        System.out.println("Choose operation:\n+\n-\n*\n/");
        if (input3.hasNextLine()) {
            operation = input3.nextLine();
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    isError = true;
                    break;
            }
        } else {
            isError = true;
        }

        if (!isError) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("Incorrect operation, dude");
        }

        System.out.println("Once more? y/n");
        Scanner input4 = new Scanner(System.in);
        answer = input4.nextLine();
        if (answer.equals("y")) {
            restart(args);
        }

    }

    private static void restart(String[] strArr) {
        main(strArr);
    }
}
