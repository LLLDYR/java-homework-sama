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
    public double balance(){
        double ans=this.user.getBalance()-account();
        this.user.setBalance(ans);
        return ans;
    }
    public User getUser(){
        return this.user;
    }
    public Product[] getProducts(){
        return this.products;
    }
    public void setProducts(Product[] products){
        this.products=products;
    }
    public void setUser(User user){
        this.user=user;
    }
}
