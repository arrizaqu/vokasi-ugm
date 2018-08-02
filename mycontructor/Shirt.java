/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.mycontructor;

/**
 *
 * @author arrizaqu
 */
public class Shirt{
    
    private String description;
    private char colorCode;
    private double price;
    private Logo logo;
    
    public Shirt(){}

    public Shirt(String description, char colorCode, double price, Logo logo) {
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
        this.logo = logo;
    }
    
    //setter dan getter
    public void setLogo(Logo logo) {
        this.logo = logo;
        
    }

    public Logo getLogo() {
        return logo;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        //this.price = price;
    }

    @Override
    public String toString() {
        return "desc: "+ this.description + ", price : "+ price + ", logo : " + this.logo.getName(); //To change body of generated methods, choose Tools | Templates.
    }
}
