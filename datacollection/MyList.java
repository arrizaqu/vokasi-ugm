/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.datacollection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arrizaqu
 */
public class MyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList();
        list.add("A"); //B
        list.add("B"); //D
        list.add("C");
        list.add("D");
        
        //list.add(2, "D");
        //list.set(0, "D");
        list.remove(2);
        //output 
        for(String temp : list){
            System.out.println("data : "+ temp);
        }
        
        List<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
        listMahasiswa.add(new Mahasiswa());
        listMahasiswa.add(new Mahasiswa());
        listMahasiswa.add(new Mahasiswa());
        
    }
}
