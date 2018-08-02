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
public class Trousers extends Clothing{
    private boolean fit;
    private String gender;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    
    

    public void setFit(boolean fit) {
        this.fit = fit;
    }

    public boolean getFit(){
        return this.fit;
    }
    
    //override 
    @Override
    public void display() {
        /*
        System.out.println("id : "+ getId());
        System.out.println("color : "+ getColor());
        System.out.println("price : "+ getPrice());
        System.out.println("fit : "+ this.fit);
        System.out.println("gender : " + this.getGender());
       */
       // super.display(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double getPrice() {
        return 12000;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
