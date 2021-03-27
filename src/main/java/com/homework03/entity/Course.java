package com.homework03.entity;

public class Course {
    private String name;
    private int number;
    private boolean required;
    public Course(){
    }
    public Course(int number,String name,boolean required){
        this.number=number;
        this.name=name;
        this.required=required;
    }
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public boolean isRequired(){
        return required;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public  void setRequired(boolean required){
        this.required=required;
    }
}
