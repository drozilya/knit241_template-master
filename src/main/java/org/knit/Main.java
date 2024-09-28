package org.knit;

import org.knit.lab1.SimpleUrl;
import org.knit.lab1.Task1;
import org.knit.lab1.Task2;
import org.knit.lab2.Calculator;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Task1 task1 = new Task1();
        task1.execute();

        Task2 task2 = new Task2();
        task2.execute(); */

        Scanner scanner = new Scanner(System.in);
        String state = "";

        while (!Objects.equals(state, "exit")) {
            System.out.print("Введите a: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Введите (+, -, *, /): ");
            String operand = scanner.nextLine();
            System.out.print("Введите b: ");
            double b = Double.parseDouble(scanner.nextLine());

            Calculator calc = new Calculator();
            System.out.println("Результат: " + calc.inputer(a, operand, b));

            System.out.print(">> ");
            state = scanner.nextLine();
        }
    }
}
