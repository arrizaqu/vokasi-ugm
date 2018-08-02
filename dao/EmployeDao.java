/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao;

import com.test.dao.model.Employee;
import java.util.List;

/**
 *
 * @author arrizaqu
 */
public interface EmployeDao {
    
    public void save(Employee employee);
    public void update(Employee employee);
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(String id);
    public String getEmail();
    
}
