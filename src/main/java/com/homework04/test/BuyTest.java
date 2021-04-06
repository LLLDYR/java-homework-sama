package com.homework04.test;

import com.homework04.entity.Order;
import com.homework04.entity.Product;
import com.homework04.entity.User;

public class BuyTest {
    public static void main(String[] args) {
        User user =new User("Myself",99);
        Product instantNoodles = new Product("instantNoodles",5.5);
        Product sausage=new Product("sausage",2.2);
        Product[] products = {instantNoodles,instantNoodles,sausage,sausage,sausage,sausage};
        Order order =new Order(user,products);
        System.out.println(order.balance());
    }
}
