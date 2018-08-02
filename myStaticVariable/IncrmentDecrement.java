/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.myStaticVariable;

/**
 *
 * @author arrizaqu
 */
public class IncrmentDecrement {
    public static void main(String[] args) {
        int a = 15;
        int b = ++a;
        int c = ++b;
        int d = ++a;
        
        System.out.println("b : "+ b); //16
       // System.out.println("b : "+ b);
        System.out.println("c : "+ c); //17
        System.out.println("d : "+ d); //17
        System.out.println("a : "+ a); //17
    }
}
