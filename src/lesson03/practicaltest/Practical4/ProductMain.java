package lesson03.practicaltest.Practical4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 27.04.2017.
 */
public class ProductMain {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product apple = new Product("Apple", 10.5, 20);
        list.add(apple);
        Product pineapple = new Product("Pine apple", 15, 15);
        list.add(pineapple);
        Product tomato = new Product("Tomato", 45.5,30);
        list.add(tomato);
        Product cucumber = new Product("Cucumber", 60, 25);
        list.add(cucumber);
        Product onion = new Product("Onion", 5.65, 9);
        list.add(onion);
        System.out.println(Product.theMostExpensive(list));
        System.out.println(Product.theMostBiggestQuantity(list));
    }
}
