package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    private Product[] basket = new Product[5];
    private int basketSize = 0;


    public void shoppingBasket(Product product) {
        if (basketSize < basket.length) {
            basket[basketSize] = product;
            basketSize++;
            System.out.println("Продукт добавлен в корзину!");
        } else {
            System.out.println("Корзина переполнена");
        }
    }

    public int sumBasket() {
        int total = 0;
        for (int i = 0; i < basketSize; i++) {
            Product product = basket[i];
            int price = product.getPrice();
            total = total + price;
        }
        return total;
    }

    public void printBasket() {
        if (basketSize == 0) {
            System.out.println("В корзине пусто ");
        } else {
            for (int i = 0; i < basketSize; i++) {
                Product product = basket[i];
                System.out.println(product.getName() + ": " + product.getPrice());
            }
        }
        System.out.println("Итого: " + sumBasket());
    }

    public boolean checksProduct(String productName) {
        for (int i = 0; i < basketSize; i++) {
            Product product = basket[i];
            String name = product.getName();

            if (name.equals(productName)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket(){
        for (int i = 0; i < basketSize; i++) {
            basket[i] = null;
        }
        basketSize = 0;
    }


}

