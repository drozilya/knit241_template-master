package org.knit.lab5;
import java.util.*;
import java.util.Random;

public class Task8 {
    public static void execute() {
        // Массив названий
        String[] names = {"книга", "ручка", "линейка", "пинал"};

        // Создание массива объектов ShopItem
        Random random = new Random();
        ShopItem[] items = new ShopItem[100];

        for (int i = 0; i < items.length; i++) {
            String name = names[random.nextInt(names.length)];
            double price = 10 + random.nextDouble() * 90; // Случайная цена от 10 до 100
            int quantity = random.nextInt(50) + 1;       // Количество от 1 до 50
            items[i] = new ShopItem(name, price, quantity);
        }

        // Вывод оригинального списка
        System.out.println("Оригинальный список:");
        Arrays.stream(items).forEach(System.out::println);

        // Сортировка по имени (с использованием Comparator)
        Arrays.sort(items, Comparator.comparing(ShopItem::getName));
        System.out.println("\nСписок после сортировки по имени:");
        Arrays.stream(items).forEach(System.out::println);

        // Подсчёт одинаковых элементов
        Map<ShopItem, Integer> itemCount = new HashMap<>();
        for (ShopItem item : items) {
            itemCount.put(item, itemCount.getOrDefault(item, 0) + 1);
        }

        System.out.println("\nКоличество одинаковых ShopItem:");
        itemCount.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + " - " + value + " шт.");
            }
        });
    }
}