package org.knit;

import org.knit.lab1.SimpleUrl;
import org.knit.lab1.Task1;
import org.knit.lab1.Task2;
import org.knit.lab2.Calculator;
import org.knit.lab3.Healer;
import org.knit.lab3.Mage;
import org.knit.lab3.Warrior;
import org.knit.lab3.WarriorGuard;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задачи 1 и 2
        /* Task1 task1 = new Task1();
        task1.execute();

        Task2 task2 = new Task2();
        task2.execute(); */

        // Задача 3
        /* Scanner scanner = new Scanner(System.in);
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
        } */

        WarriorGuard warriorGuard = new WarriorGuard("Щитовик");
        Mage mage = new Mage("Маг");
        Healer healer = new Healer("Хиллер");
        Warrior warrior = new Warrior("Воин");

        Scanner scanner = new Scanner(System.in);
        String command = "";
        int queue = 0;
        while (!Objects.equals(command, "exit")) {
            if (queue == 0) {
                System.out.println("Доступные команды: attack [name], move [x, y]");
                System.out.print("Воин>> ");
                command = scanner.nextLine();
                String[] commandsp = command.split(" ");
                if (Objects.equals(commandsp[0], "attack")) {
                    if (Objects.equals(commandsp[1], "Маг")) {
                        warrior.attack(mage);
                        System.out.println(mage);
                    } else if(Objects.equals(commandsp[1], "Хиллер")) {
                        warrior.attack(healer);
                        System.out.println(healer);
                    } else if(Objects.equals(commandsp[1], "Щитовик")) {
                        warrior.attack(warriorGuard);
                        System.out.println(warriorGuard);
                    } else {
                        System.out.println("Такого класса нет!");
                    }
                }
            }
        }
    }
}
