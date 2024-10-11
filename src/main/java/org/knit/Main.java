package org.knit;

import org.knit.lab1.SimpleUrl;
import org.knit.lab1.Task1;
import org.knit.lab1.Task2;
import org.knit.lab2.*;
import org.knit.lab3.Healer;
import org.knit.lab3.Mage;
import org.knit.lab3.Warrior;
import org.knit.lab3.WarriorGuard;
import org.knit.lab4.DictionaryStatistic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Задачи 1 и 2
        /* Task1 task1 = new Task1();
        task1.execute();

        Task2 task2 = new Task2();
        task2.execute(); */

        // Задача 3
        /*
        Scanner scanner = new Scanner(System.in);
        String state = "";

        while (!Objects.equals(state, "exit")) {
            try {
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
            } catch (NumberFormatException e) {
                System.out.println(e + " Неверный формат!");
            }
        }
        */

        /*
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
                    } else if (Objects.equals(commandsp[1], "Хиллер")) {
                        warrior.attack(healer);
                        System.out.println(healer);
                    } else if (Objects.equals(commandsp[1], "Щитовик")) {
                        warrior.attack(warriorGuard);
                        System.out.println(warriorGuard);
                    } else {
                        System.out.println("Такого класса нет!");
                    }
                } else if (Objects.equals(commandsp[0], "move")) {
                    warrior.move(Integer.parseInt(commandsp[1]), Integer.parseInt(commandsp[2]));
                }
                queue = 1;
            } else if (queue == 1) {
                System.out.println("Доступные команды: cast [name], move [x, y]");
                System.out.print("Маг>> ");
                command = scanner.nextLine();
                String[] commandsp = command.split(" ");
                if (Objects.equals(commandsp[0], "cast")) {
                    if (Objects.equals(commandsp[1], "Воин")) {
                        mage.castSpell(warrior);
                        System.out.println(warrior);
                    } else if (Objects.equals(commandsp[1], "Хиллер")) {
                        mage.castSpell(healer);
                        System.out.println(healer);
                    } else if (Objects.equals(commandsp[1], "Щитовик")) {
                        mage.castSpell(warriorGuard);
                        System.out.println(warriorGuard);
                    } else {
                        System.out.println("Такого класса нет!");
                    }
                } else if (Objects.equals(commandsp[0], "move")) {
                    warrior.move(Integer.parseInt(commandsp[1]), Integer.parseInt(commandsp[2]));
                }
                queue = 2;
            } else if (queue == 2) {
                System.out.println("Доступные команды: heal [name], move [x, y]");
                System.out.print("Хиллер>> ");
                command = scanner.nextLine();
                String[] commandsp = command.split(" ");
                if (Objects.equals(commandsp[0], "heal")) {
                    if (Objects.equals(commandsp[1], "Воин")) {
                        healer.heal(warrior);
                        System.out.println(warrior);
                    } else if (Objects.equals(commandsp[1], "Хиллер")) {
                        healer.heal(healer);
                        System.out.println(healer);
                    } else if (Objects.equals(commandsp[1], "Щитовик")) {
                        healer.heal(warriorGuard);
                        System.out.println(warriorGuard);
                    } else if (Objects.equals(commandsp[1], "Маг")) {
                        healer.heal(mage);
                        System.out.println(mage);
                    } else {
                        System.out.println("Такого класса нет!");
                    }
                } else if (Objects.equals(commandsp[0], "move")) {
                    warrior.move(Integer.parseInt(commandsp[1]), Integer.parseInt(commandsp[2]));
                }
                queue = 3;
            } else if (queue == 3) {
                System.out.println("Доступные команды: attack [name], shield [name], move [x, y]");
                System.out.print("Щитовик>> ");
                command = scanner.nextLine();
                String[] commandsp = command.split(" ");
                if (Objects.equals(commandsp[0], "shield")) {
                    if (Objects.equals(commandsp[1], "Воин")) {
                        warriorGuard.deployShield(warrior);
                        System.out.println(warrior);
                    } else if (Objects.equals(commandsp[1], "Хиллер")) {
                        warriorGuard.deployShield(healer);
                        System.out.println(healer);
                    } else if (Objects.equals(commandsp[1], "Щитовик")) {
                        warriorGuard.deployShield(warriorGuard);
                        System.out.println(warriorGuard);
                    } else if (Objects.equals(commandsp[1], "Маг")) {
                        warriorGuard.deployShield(mage);
                        System.out.println(mage);
                    } else {
                        System.out.println("Такого класса нет!");
                    }
                } else if (Objects.equals(commandsp[0], "move")) {
                    warrior.move(Integer.parseInt(commandsp[1]), Integer.parseInt(commandsp[2]));
                }
                queue = 0;
                }
            }
         */
        /* Объемы фигур

        Container container = new Container(1000);

        Shape sphere = new Sphere(5);
        Shape cube = new Cube(3);

        container.add(sphere);
        container.add(cube);
         */

        /* Массивы и строки */

        int c = 0;
        Scanner scanner = new Scanner(new File("dictionary.txt"));
        while (scanner.hasNext()) {
            String word = scanner.nextLine();
            c++;
        }
        scanner.close();

        Scanner scanner2 = new Scanner(new File("dictionary.txt"));
        int ind = 0;
        String[] words = new String[c];

        while (scanner2.hasNext()) {
            words[ind++] = scanner2.nextLine().toLowerCase();
        }
        scanner2.close();

        char[] alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();
        DictionaryStatistic dictStat = new DictionaryStatistic(words, alphabet);
        System.out.println(dictStat);

        System.out.println("Случайное слово из словаря: " + dictStat.getRandomWord());

        dictStat.printSymbolsStat();
    }
}
