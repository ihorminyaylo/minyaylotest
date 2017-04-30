package lesson03.practicaltest.Practical4;

import java.util.List;

/**
 * Created by user on 27.04.2017.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public static String theMostExpensive(List<Product> list) {
        Product mostExpensiveProduct= null;
        double maxPrice = 0;
        for (Product a : list) {
            if (a.getPrice() > maxPrice) {
                mostExpensiveProduct = a;
                maxPrice = a.getPrice();
            }
        }
        return "The most expensive of product is " + mostExpensiveProduct.getName() + ". The product in the stock = "
                + maxPrice + " kg.";
    }
    public static String theMostBiggestQuantity(List<Product> list) {
        Product mostBiggetstQuantity = null;
        int count = 0;
        for (Product a : list) {
            if (a.getQuantity() > count) {
                count = a.getQuantity();
                mostBiggetstQuantity = a;
            }
        }
        return "The most biggest quantity product is " + mostBiggetstQuantity.getName();
    }
}
