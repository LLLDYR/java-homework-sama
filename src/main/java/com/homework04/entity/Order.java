package com.homework04.entity;

public class Order {
    private User user;
    private Product[] products;
    public Order(){
    }
    public Order(User user,Product[] products){
        this.user=user;
        this.products=products;
    }
    public double account(){
        double sum=0;
        for(int i=0;i<products.length;i++){
            sum = sum + products[i].getPrice();
        }
        return  sum;
    }
}
