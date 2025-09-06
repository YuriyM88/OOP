package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

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
