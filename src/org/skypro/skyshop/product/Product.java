package org.skypro.skyshop.product;

public class Product {

    private String name; // Название продукта
    private int price; // Стоимость продукта

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
