/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.MyInheritance;

/**
 *
 * @author arrizaqu
 */
public abstract class Clothing {
    private String id;
    private char color;
    private double price;

    Clothing(){}
    
    public Clothing(String id, char color, double price) {
        this.id = id;
        this.color = color;
        this.price = price;
    }
    
    public  void display(){
        System.out.println("id : "+ this.id);
        System.out.println("color : "+ this.color);
        System.out.println("price : "+ this.price);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    protected abstract double getPrice();

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
