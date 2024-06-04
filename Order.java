/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.companyproject;

import java.util.ArrayList;

/**
 *
 * @author asoom
 */
public class Order {
    
    
    protected int id;
    protected String date;
    protected boolean isPaid;
    Person person;
    ArrayList<Product> products;
    
    
    private static int idIncrementer;
    
    public Order(String date, boolean isPaid, Person person, ArrayList<Product> products)
    {
        idIncrementer++;
        this.id = idIncrementer;
        this.date = date;
        this.isPaid = isPaid;
        this.person = person;
        this.products = products;
    }
    
}
