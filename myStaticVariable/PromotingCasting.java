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
public class PromotingCasting {
    public static void main(String[] args) {
        /*
            byte
            short
            int
            long
        */
        //auto promotiong
        byte a = 5;
        short b = a;
        byte c = (byte) b;
        
        int ab = 666666666;
        long ac = ab * 50L;
        //long hasil = ab * ac;
        System.out.println("hasil  : "+ ac);
        
        //coution promoting
        int abc = 666666666;
        long acc = 55555 * 50;
        long result = abc * acc;
        
        System.out.println("result  : "+ result);
        
        //couting promoting2 
        int df = 5;
        double dg = 2;
        double result2 = df / dg;
        System.out.println("hasil 2 :"+ result2);
        
        //casting 
        int ab1 = 5;
        float ab2 = 6;
        byte rs1 = (byte)(ab1 * ab2);
        System.out.println("rs1 : "+ rs1);
    }
}
