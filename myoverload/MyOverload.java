/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.myoverload;

/**
 *
 * @author arrizaqu
 */
public class MyOverload {
    
     public static void getMax(long a, long b){
        System.out.println("long");
    }
    
    public static void getMax(int a, int b){
        System.out.println("int");
    }
    
    public static void getMax(short a, short b){
        System.out.println("short");
    }
    
    public static void getMax(Integer a, Integer b){
        System.out.println("Integer");
    }
    
    public static void getMax(double a, double b){
        System.out.println("double");
    }
    
    public static void getMax(Double a, Double b){
        System.out.println("double big");
    }
    
    public static void main(String[] args) {
        getMax(12000000000L, 12.0);
    }
    
}
