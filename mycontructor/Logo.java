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
public class Logo {
    private String name;
    private String position;
    private String color;

    public Logo(){}

    public Logo(String name, String position, String color) {
        this.name = name;
        this.position = position;
        this.color = color;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
