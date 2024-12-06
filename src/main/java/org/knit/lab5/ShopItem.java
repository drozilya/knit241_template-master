package org.knit.lab5;

import java.util.Objects;

class ShopItem {
    private String name;
    private int price;
    private String group;

    // Конструктор
    public ShopItem(String name, int price, String group) {
        this.name = name;
        this.price = price;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopItem shopItem = (ShopItem) o;
        return Double.compare(shopItem.price, price) == 0 &&
                Objects.equals(name, shopItem.name) &&
                Objects.equals(group, shopItem.group);
    }

    @Override
    public String toString() {
        return "имя: '" + name + "', цена: " + price + ", количество: " + group;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, group);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getGroup() {
        return group;
    }
}
