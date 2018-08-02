/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.java8date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author arrizaqu
 */
public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        
        System.out.println("local date : "+ localDate);
        System.out.println("local date time : "+ localDateTime);
        System.out.println("local time : "+ LocalTime.now());
        System.out.println("2 weeks from now "+ localDate.plusWeeks(2));
        System.out.println("indonesian date format : "+ localDate.format(dtf));
        System.out.println("tanggal hari ini adalah : "+ localDate.getDayOfMonth());
        System.out.println("tahun ini adalah : "+ localDate.getYear());
        System.out.println("hari ini jam : "+ LocalTime.now().getHour());
    }
}
