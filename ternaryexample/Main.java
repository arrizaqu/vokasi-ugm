/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ternaryexample;

/**
 *
 * @author arrizaqu
 */
public class Main {
    public static void main(String[] args) {
        //normal
        String word = "";
        String username = "joko";
            if(username == "andi"){
                word = "true";
            } else if(username == "joko"){
                word = "OK";
            } else {
                word = "false";
            }
        //ternary 
        String word2 = (username == "andi") ? ("true") : (username == "joko") ? "OK" : ("false");
        
        System.out.println("word : " + word);
        System.out.println("word2 : "+ word2);
        
        int x = 4, y = 9;
        x = ((y / x) <3) ? x +y : x * y;
        System.out.println("x : " + x);
        int hasil = getMax(x, y);
        System.out.println("hasil : "+ hasil);
    }
    
    public static int getMax(int a, int b){
        return a * b;
    }
}
