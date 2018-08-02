/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.matrix;

/**
 *
 * @author arrizaqu
 */
public class Matrix {
    public static void main(String[] args) {
        String[][] matrix = new String[5][9];
        matrix[0][0] = "1000";
        //looping 2 inside
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if(i + j >= 4 ){
                    matrix[i][j] = i + "," + j;
                } 
                
            }
        }
        
        //output
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(""+matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
