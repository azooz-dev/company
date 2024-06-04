/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.companyproject;

/**
 *
 * @author asoom
 */
public class Product {
    
    protected int id;
    protected String name;
    protected float price;
    private static int idIncrementer;
     public Product(String name, float price)
    {
        idIncrementer++;
        this.id = idIncrementer;
        this.name = name;
        this.price = price;
    }
}
