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
public class Main {
    public static void main(String[] args) {
       // Clothing cloth = new Clothing();
        Clothing shirt = new Shirt();
        Clothing shock = new Shock();
        Clothing trousers = new Trousers();
        Trousers trousers2 = new Trousers();
        
        shirt.setId("shirt_01");
        shirt.setColor('G');
        shirt.setPrice(20000);
        ((Shirt)shirt).setFit(true);
       // shirt.display();
        displayDetail(shirt);
        
        shock.setId("shock_01");
        shock.setPrice(4000);
        shock.setColor('R');
        //shock.display();
        
        System.out.println("=================");
        trousers.setId("trousers_01");
        trousers.setPrice(40000);
        trousers.setColor('B');
        ((Trousers)trousers).setGender("FEMALE");
        ((Trousers)trousers).setFit(true);
       // displayDetail(trousers);
        
    }
    
    public static void displayDetail(Clothing cloth){
        if(cloth instanceof Trousers){
            cloth.display();
            System.out.println("gender : "+((Trousers)cloth).getGender());
            System.out.println("fit : "+((Trousers)cloth).getFit());
        } else if(cloth instanceof Shirt){
             cloth.display();
              System.out.println("fit : "+((Shirt)cloth).getFit());
        }
        
    }
}
