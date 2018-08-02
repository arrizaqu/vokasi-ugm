/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao;

import com.test.dao.model.Customer;
import com.test.dao.model.Employee;

/**
 *
 * @author arrizaqu
 */
public class Main {
    public static void main(String[] args) {
        EmployeDao crudEmployee = new EmployeeDaoImpl();
        CustomerDao crudCustomer = new CustomerDaoImpl();
        
        crudCustomer.save(new Customer());
        crudEmployee.save(new Employee());
                
    }
}
