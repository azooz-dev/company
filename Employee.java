/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.companyproject;

/**
 *
 * @author asoom
 */
public class Employee extends Person {
    
   
    protected float salary;
    protected String workingTime;
    public Employee(String name, String phone, String gender, float salary, String workingTime)
    {
        super(name, phone, gender);
        this.salary = salary;
        this.workingTime = workingTime;
    }
    
}

