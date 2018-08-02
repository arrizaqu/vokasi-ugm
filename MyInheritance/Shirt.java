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
public class Shirt extends Clothing {
    private boolean fit;

    public void setFit(boolean fit) {
        this.fit = fit;
    }

    public boolean getFit(){
        return this.fit;
    }

    @Override
    public double getPrice() {
        return 567890;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
