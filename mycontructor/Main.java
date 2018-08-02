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
public class Main {
    public static void main(String[] args) {
        Logo logo = new Logo("logo sd", "bahu atas", "blue");
        Shirt shirt = new Shirt("sport", 'R', 10000.0, logo);
        int a = Math.abs(-45678);
        System.out.println(shirt);
        System.out.println(a);
    }
}
