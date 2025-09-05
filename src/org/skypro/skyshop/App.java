package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

//        System.out.println("1 и 2");
//        Product product1 = new SimpleProduct("Телефон", 30000);
//        Product product2 = new SimpleProduct("Ноутбук", 60000);
//        Product product3 = new SimpleProduct("Наушники", 5000);
//        Product product4 = new SimpleProduct("Мышь", 2000);
//        Product product5 = new SimpleProduct("Клавиатура", 4000);
//        Product product6 = new SimpleProduct("Монитор", 25000);
//
//        basket.shoppingBasket(product1);
//        basket.shoppingBasket(product2);
//        basket.shoppingBasket(product3);
//        basket.shoppingBasket(product4);
//        basket.shoppingBasket(product5);
//        basket.shoppingBasket(product6);
//
//        System.out.println("3");
//        basket.printBasket();
//
//        System.out.println("4");
//        int total = basket.sumBasket();
//        System.out.println("Общая стоимость: " + total + " руб.");
//
//        System.out.println("5");
//        boolean hasNotebook = basket.checksProduct("Мышь");
//        System.out.println("В корзине есть Ноутбук: " + hasNotebook);
//
//        System.out.println("6");
//        boolean hasTablet = basket.checksProduct("Планшет");
//        System.out.println("В корзине есть Планшет: " + hasTablet);
//
//        System.out.println("7");
//        basket.clearBasket();
//        System.out.println("Корзина очищена!");
//        basket.printBasket();
//
//        System.out.println("8");
//        basket.clearBasket();
//        System.out.println("Пытаемся вывести пустую корзину:");
//        basket.printBasket();
//
//        System.out.println("9");
//        int emptyBasketTotal = basket.sumBasket();
//        System.out.println("Стоимость пустой корзины: " + emptyBasketTotal + " руб.");
//
//        System.out.println("10");
//        boolean hasAnything = basket.checksProduct("Телефон");
//        System.out.println("В пустой корзине есть Телефон: " + hasAnything);


        System.out.println("Наследование");

        Product product1 = new SimpleProduct("Телефон", 30000);
        Product product2 = new DiscountedProduct("Ноутбук", 60000, 20);

        Product product3 = new FixPriceProduct("Шоколадка");

        Product product4 = new SimpleProduct("Наушники", 5000);
        Product product5 = new DiscountedProduct("Мышь", 4000, 10);

        basket.shoppingBasket(product1);
        basket.shoppingBasket(product2);
        basket.shoppingBasket(product3);
        basket.shoppingBasket(product4);
        basket.shoppingBasket(product5);

        basket.printBasket();



    }
}
