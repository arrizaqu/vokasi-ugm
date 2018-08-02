/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.looping;

/**
 *
 * @author arrizaqu
 */
public class Main {
    
    public static void main(String[] args) {
        //loop (while)
        int x = 0;
        while(x < 5){
            System.out.println(x);
            x++;
        }
        
        //loop 
        for(int i = 0, j=0; i < 5 && j < 2;i++, j++){
            System.out.println("i : "+ i);
            System.out.println("j : "+ j);
        }
        
        //do while
        int a = 5;
        do{
            System.out.println("a : "+ a);
        }while(a < 0);
    }
    
}
