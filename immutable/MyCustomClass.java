/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.immutable;

/**
 *
 * @author arrizaqu
 */
public class MyCustomClass {
    
    public String name;
    
    public void setAge(int age){
        System.out.println("(before)value : "+ age);
        age = 10;
        System.out.println("(after)non original value : "+ age);
    }
    public void changeUsername(String username){
        username = "aldo";
    }
    public void changePassword(StringBuilder password){
        password.append("xxx");
    }
    public void changePrice(Tv tv){
        //tv = new Tv();
        tv.price = 1000;
    }
    
    public static void main(String[] args) {
        MyCustomClass mc = new MyCustomClass();
        
        String username = "Agung";
        StringBuilder password = new StringBuilder("1234");
        int age = 5;   
        mc.changeUsername(username);
        mc.changePassword(password);
        mc.setAge(age);
        
        Tv tv = new Tv();
        tv.price = 2000;
        mc.changePrice(tv);
        
        System.out.println("username : "+ username);
        System.out.println("password : "+ password);
        System.out.println("age : "+ age);
        System.out.println("tv price "+ tv.price);
        
    }
}
