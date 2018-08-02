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
public class MainTestStatic {
    
    public static void main(String[] args) {
        MyStatic ms1 = new MyStatic();
        ms1.address ="jakarta";
        ms1.name = "Guntur";
        MyStatic ms2 = new MyStatic();
        ms2.name = "Agung";
        ms2.address = "bandung";
        
        System.out.println("name : "+ MyStatic.name);
        System.out.println("address : "+ ms1.address);
    }
    
}
