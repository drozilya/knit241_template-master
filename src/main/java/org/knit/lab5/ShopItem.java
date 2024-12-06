package org.knit.lab5;

import java.util.Objects;

class ShopItem {
    private String name;
    private double price;
    private int quantity;

    // Конструктор
    public ShopItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "ShopItem{name='" + name + "', price=" + price + ", quantity=" + quantity + '}';
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopItem shopItem = (ShopItem) o;
        return Double.compare(shopItem.price, price) == 0 &&
                quantity == shopItem.quantity &&
                Objects.equals(name, shopItem.name);
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    // Геттеры (для сортировки)
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
