package com.homework05.test;

import com.homework05.entity.Button;
import com.homework05.entity.Clickable;

public class test {
    public static void main(String[] args) {
        Button b1 = new Button("Button1");
        b1.setClicable(new Clickable(){
            @Override
            public void click() {
                System.out.println("ButtonA");
            }
        });
        b1.getClicable().click();
        Button b2 = new Button("Button2");
        b2.setClicable(new Clickable(){
            @Override
            public void click() {
                System.out.println("ButtonB");
            }
        });
        b2.getClicable().click();
        }
}